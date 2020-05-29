package DatabaseFiles.ServicesImplementation;

import Controller.DatabaseController;
import DatabaseFiles.ServicesInterface.ClientService;
import Model.Booking;
import Model.Client;
import Model.ClientProperties;
import Model.Doctor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class ClientServices implements ClientService {

    private DatabaseController dc;
    private Session session;
    private Query q;
    private List<Client> clients;
    private List<Booking> booking;
    private int result;
    private ClientProperties clientproperties;
    private Booking book;

    public ClientServices() {
        dc = new DatabaseController();
        session = null;
        q = null;
        clients = new ArrayList();
        booking = new ArrayList();
        clientproperties = new ClientProperties();
        book = new Booking();
    }

    // Create New Client Account
    @Override
    public int addClient(Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            session.persist(client);
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
            q.setString(0, client.getCode());
            result = (int) q.list().get(0);
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return result;
    }
// Geting ClientProperties 

    public ClientProperties getClientProperties(Client client, SessionFactory sessionfactory){
        try {
            session = dc.getSession(sessionfactory);
            clientproperties = (ClientProperties) session.get(ClientProperties.class, client.getClientproperties().getId());
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return clientproperties;
    }
    // Edit Client
    @Override

    public int editClient(Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            session.update(client);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    // Edit ClientProperties
    @Override
    public int editClientProperties(ClientProperties client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            session.update(client);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    // Edit Client
    @Override
    public int removeBooking(Doctor doctor, Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            Criteria cri = session.createCriteria(Booking.class);
            cri.add(Restrictions.eq("date", new Date()));
            cri.add(Restrictions.eq("client", client));
            cri.add(Restrictions.eq("doctor", doctor));
            booking = cri.list();
            session.delete(cri.list().get(0));
            session.getTransaction().commit();
            return 1;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    @Override
    public int removeClient(Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            session.delete(client.getClientproperties());
            session.getTransaction().commit();
            return 1;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            return 0;
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
            q.setString(0, client.getCode());
            q.setString(1, client.getPassword());
            clients = q.list();
            if (clients.isEmpty()) {
                return null;
            }

        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return clients.get(0);
    }

    // Get Client (Data)
    @Override
    public Client getClientData(Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            client = (Client) session.get(Client.class, client.getId());
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return client;
    }

    // Get All Properties Of Client
    @Override
    public ClientProperties getClientProperties(SessionFactory sessionfactory, Client client) {
        try {
            session = dc.getSession(sessionfactory);
            clientproperties = (ClientProperties) session.get(ClientProperties.class, client.getId());
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return clientproperties;
    }

    // Get Client By Code 
    @Override
    public Client getClientCode(SessionFactory sessionfactory, Client client) {
        try {
            session = dc.getSession(sessionfactory);
            Criteria cri = session.createCriteria(Client.class);
            cri.add(Restrictions.eq("code", client.getCode()));
            clients = cri.list();
            if (clients.isEmpty()) {
                return null;
            }

        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return clients.get(0);
    }

    // Get ALL Booking Booking
    @Override
    public List<Booking> allBooking(SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("from Booking");
            booking = q.list();
            if (booking.isEmpty()) {
                return null;
            }
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return booking;
    }

    @Override
    public List<Booking> PharmecyBooking(SessionFactory sessionfactory) {
        booking = this.allBooking(sessionfactory);
        if (booking != null) {
            booking = (List<Booking>) booking.parallelStream()
                    .filter(x -> (x.getAcceptmedicine() == 0 && x.getAcceptdoctor() == 1)).collect(Collectors.toList());
            return booking;
        }
        JOptionPane.showMessageDialog(null, booking.size());
        return null;
    }

    // Get ALL Booking (Doctor And Client)
    @Override
    public List<Booking> statisticsBooking(SessionFactory sessionfactory) {
        booking = this.allBooking(sessionfactory);
        if (booking != null) {
            booking = booking = booking.parallelStream().filter(x -> x.getAcceptmedicine() == 1 && x.getAcceptdoctor() == 1)
                    .collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    // Get ALL ClientBooking 
    @Override
    public List<Booking> allClientReservation(SessionFactory sessionfactory) {
        booking = this.allBooking(sessionfactory);
        if (booking != null) {
            booking = booking.parallelStream().filter(x -> x.getAcceptmedicine() == 1).collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    // Get ALL ClientBooking ToDay
    @Override
    public List<Booking> clientReservationsToday(SessionFactory sessionfactory, Client client) {
        booking = this.allBooking(sessionfactory);
        if (booking != null) {
            booking = (List<Booking>) booking.parallelStream()
                    .filter(x -> (client.getId() == x.getClient().getId() && x.getAcceptdoctor() == 0)).collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    @Override
    public List<Booking> Pharmecy(SessionFactory sessionfactory, Client client) {
        booking = this.allBooking(sessionfactory);
        if (booking != null) {
            booking = booking.parallelStream().filter(x -> x.getAcceptmedicine() == 1 && client.getId() == x.getId()).collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    // Reserve A Medical Examination
    @Override
    public int Booking(Doctor doctor, Client client, SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            book.setClient(client);
            book.setDoctor(doctor);
            session.save(book);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

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
                for (int i = 0; i < booking.size(); i++) {
                    if (booking.get(i).getDoctor().getId() == doctor.getId()
                            && booking.get(i).getDate().toString().equals(this.Date())) {
                        return 1;
                    }
                }
            }

        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return 0;
    }

    // Get The Booking of The Doctor Today
    @Override
    public Booking myBooking(SessionFactory sessionfactory, Client client, Doctor doctor) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("from Booking where Date = ?");
            q.setString(0, this.Date());
            booking = q.list();
            if (booking.isEmpty()) {
                return null;
            } else {
                booking = (List<Booking>) booking.parallelStream()
                        .filter(x -> (client.getId() == x.getClient().getId() && (doctor.getId() == x.getDoctor().getId())))
                        .collect(Collectors.toList());

            }
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return booking.get(0);
    }

    // Get the only Booking of Client 
    @Override
    public List<Booking> onlyBooking(SessionFactory sessionfactory, Client client, Doctor doctor) {
        booking = this.allBooking(sessionfactory);
        if (booking != null) {
            booking = booking.parallelStream().filter(x -> x.getClient().getId() == client.getId()
                    && x.getDate().toString().equals(this.Date())
                    && x.getDoctor().getId() == doctor.getId()).collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    // Edit Booking Of Client
    @Override
    public int editBooking(SessionFactory sessionfactory, Booking book) {
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            session.update(book);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    public String Date() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }
}
