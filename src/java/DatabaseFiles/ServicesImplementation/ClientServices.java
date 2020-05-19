package DatabaseFiles.ServicesImplementation;

import Controller.DatabaseController;
import DatabaseFiles.ServicesInterface.ClientService;
import Model.Booking;
import Model.Client;
import Model.ClientProperties;
import Model.Doctor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClientServices implements ClientService {

    private DatabaseController dc;
    private Session session;
    private Query q;
    private List<Client> clients;
    private List<Booking> booking;

    public ClientServices() {
        dc = new DatabaseController();
        session = null;
        q = null;
    }

    
    // Create New Client Account
    @Override
    public int addClient(Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    // Geting Client Property (ID)
    @Override
    public int getClientId(Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            q = session.createQuery("select id from Client where Code=?");
            q.setInteger(0, client.getCode());
            return (int) q.list().get(0);
        } finally {
            session.close();
        }

    }
    
    /* Check IF Client Is Exist Or Not 
       IF Exist (Return All Data Of Client)
       IF Not Exist (Return Null)
     */
    @Override
    public Client IsExist(Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            q = session.createQuery("from Client where Code=? and Password=?");
            q.setInteger(0, client.getCode());
            q.setString(1, client.getPassword());
            clients = q.list();
            if (clients.isEmpty()) {
                return null;
            }
            return clients.get(0);
        } finally {
            session.close();
        }

    }

    @Override
    public Client getClientData(Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            client = (Client) session.get(Client.class, client.getId());
            return client;
        } finally {
            session.close();
        }
    }

    // Get All Properties Of Client
    @Override
    public ClientProperties getClientProperties(SessionFactory sessionfactory, Client client) {
        try {
            session = dc.getSession(sessionfactory);
            return (ClientProperties) session.get(ClientProperties.class, client.getId());
        } finally {
            session.close();
        }
    }
    
    
    // Reserve A Medical Examination
    @Override
    public int Booking(Doctor doctor, Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            Booking book = new Booking();
            book.setClient(client);
            book.setDoctor(doctor);
            session.save(book);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            return 0;
        } finally {
            session.close();
        }
    }
//
//    @Override
//    public List<Pharmacy> getMedicine() {
//        session = dc.getSession(sessionfactory);
//        q = session.createQuery("from Pharmacy where Client_ID=?");
//        q.setInteger(0, client.getCode());
//        q.setString(1, client.getPassword());
//        clients = q.list();
//        if(clients.size() == 0){
//            return null;
//        }
//        return clients.get(0);
//    }

    
    //  Check If Client Booking Or No
    @Override
    public int isBooking(SessionFactory sessionfactory, Client client, Doctor doctor) {
        try {
            session = dc.getSession(sessionfactory);
            q = session.createQuery("from Booking where Client_ID = ?");
            q.setInteger(0, client.getId());
            booking = q.list();
            if (booking.isEmpty()) {
                return 0;
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(new Date());
                for (int i = 0; i < booking.size(); i++) {
                    if (booking.get(i).getDoctor().getId() == doctor.getId()
                            && booking.get(i).getDate().toString().equals(date)) {
                        return 1;
                    }
                }
            }
            return 0;
        } finally {
            session.close();
        }
    }

    // Get ALL ClientBooking ToDay
    @Override
    public List<Booking> myBooking(SessionFactory sessionfactory, Client client) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(new Date());
            q = session.createQuery("from Booking where Date = ?");
            q.setString(0, date);
            booking = q.list();
            if (booking.isEmpty()) {
                return null;
            } else {
                booking = (List<Booking>) booking.parallelStream()
                        .filter(x -> (client.getId() == x.getClient().getId())).collect(Collectors.toList());
                return booking;
            }
        } finally {
            session.close();
        }
    }
}
//    @Override
//    public Client getClientData(Client client, SessionFactory sessionfactory) {
//        session = dc.getSession(sessionfactory);
//        Query q = session.createQuery("from Client where Code=? and Password=?");
//        q.setInteger(0, client.getCode());
//        q.setString(1, client.getPassword());
//        return (Client) q.list().get(0);
//    }
//    @Override
//    public int addBooking(SessionFactory sessionfactory, Client client, Doctor doctor) {
//        try {
//            session = dc.getSession(sessionfactory);
//            session.beginTransaction();
////            Booking book = new Booking(client.getId(), doctor.getSpecialty(), doctor);
////            session.save(book);
//            session.getTransaction().commit();
//            return 1;
//        } catch (Exception e) {
//            return 0;
//        }
//    }
