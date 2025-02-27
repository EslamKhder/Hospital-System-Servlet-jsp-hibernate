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

    private SessionFactory sessionfactory;
    private DatabaseController dc;
    private Query q;
    private List<Client> clients;
    private List<Booking> booking;
    private int result;
    private ClientProperties clientproperties;
    private Booking book;

    public ClientServices(SessionFactory sessionfactory) {
        this.sessionfactory = sessionfactory;
        this.dc = new DatabaseController();
        this.q = null;
        this.clients = new ArrayList();
        this.booking = new ArrayList();
        this.clientproperties = new ClientProperties();
        this.book = new Booking();
    }

    // Create New Client Account
    @Override
    public int addClient(Client client) {
        Session session = null;
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
    public int getClientId(Client client) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("select id from Client where Code=?");
            q.setString(0, client.getCode());
            result = (int) q.list().get(0);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return result;
    }
 //Geting ClientProperties 

    @Override
    public ClientProperties getClientProperties(Client client) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            clientproperties = (ClientProperties) session.get(ClientProperties.class, client.getClientproperties().getId());
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.clear();
            session.close();
        }
        return clientproperties;
    }

    //Get Client Balance
    @Override
    public int getClientBalance(Client client) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("select balance from Client where id=?");
            q.setInteger(0, client.getId());
            result = (int) q.list().get(0);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return result;
    }

    // Edit Client
    @Override
    public int editClient(Client client) {
        Session session = null;
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
    public int editClientProperties(ClientProperties client) {
        Session session = null;
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
    public int removeBooking(Doctor doctor, Client client) {
        Session session = null;
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
    public int removeClient(Client client) {
        Session session = null;
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
    public Client IsExist(Client client) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("from Client where Code=? and Password=?");
            q.setString(0, client.getCode());
            q.setString(1, client.getPassword());
            clients = q.list();
            session.getTransaction().commit();
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
    public Client getClientData(Client client) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            client = (Client) session.get(Client.class, client.getId());
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return client;
    }

    // Get All Properties Of Client
    @Override
    public ClientProperties ClientProperties(Client client) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            clientproperties = (ClientProperties) session.get(ClientProperties.class, client.getId());
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return clientproperties;
    }

    // Get Client By Code 
    @Override
    public Client getClientCode(Client client) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            Criteria cri = session.createCriteria(Client.class);
            cri.add(Restrictions.eq("code", client.getCode()));
            clients = cri.list();
            session.getTransaction().commit();
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
    public List<Booking> allBooking() {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("from Booking");
            booking = q.list();
            session.getTransaction().commit();
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
    public List<Booking> PharmecyBooking() {
        booking = this.allBooking();
        if (booking != null) {
            booking = (List<Booking>) booking.parallelStream()
                    .filter(x -> (x.getAcceptmedicine() == 0 && x.getAcceptdoctor() == 1)).collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    // Get ALL Booking (Doctor And Client)
    @Override
    public List<Booking> statisticsBooking() {
        booking = this.allBooking();
        if (booking != null) {
            booking = booking = booking.parallelStream().filter(x -> x.getAcceptmedicine() == 1 && x.getAcceptdoctor() == 1)
                    .collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    // Get ALL ClientBooking 
    @Override
    public List<Booking> allClientReservation(Client client) {
        booking = this.allBooking();
        if (booking != null) {
            booking = booking.parallelStream().filter(x -> x.getAcceptmedicine() == 1
                    && x.getClient().getId() == client.getId()).collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    // Get ALL ClientBooking ToDay
    @Override
    public List<Booking> clientReservationsToday(Client client) {
        booking = this.allBooking();
        if (booking != null) {
            booking = (List<Booking>) booking.parallelStream()
                    .filter(x -> (client.getId() == x.getClient().getId() && x.getAcceptdoctor() == 0)).collect(Collectors.toList());
            return booking;
        }
        return null;
    }

    @Override
    public List<Booking> Pharmecy(Client client) {
        booking = this.allBooking();
        try {

            if (booking != null) {
                booking = booking.parallelStream().filter(x -> x.getAcceptmedicine() == 1 && client.getId() == x.getClient().getId()).collect(Collectors.toList());
                return booking;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        return null;
    }

    // Reserve A Medical Examination
    @Override
    public int Booking(Doctor doctor, Client client) {
        Session session = null;
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
    public int isBooking(Client client, Doctor doctor) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("from Booking where Client_ID = ?");
            q.setInteger(0, client.getId());
            booking = q.list();
            session.getTransaction().commit();
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
    public Booking myBooking(Client client, Doctor doctor) {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("from Booking where Date = ?");
            q.setString(0, this.Date());
            booking = q.list();
            session.getTransaction().commit();
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
    public List<Booking> onlyBooking(Client client, Doctor doctor) {
        booking = this.allBooking();
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
    public int editBooking(Booking book) {
        Session session = null;
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

    // All Client
    @Override
    public List<Client> Clients() {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("from Client");
            clients = q.list();
            session.getTransaction().commit();
            if (clients.isEmpty()) {
                return null;
            }
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return clients;
    }

    public String Date() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }
}
