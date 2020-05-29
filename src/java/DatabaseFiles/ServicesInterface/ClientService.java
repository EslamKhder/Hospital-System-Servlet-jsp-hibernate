package DatabaseFiles.ServicesInterface;

import Model.Booking;
import Model.Client;
import Model.ClientProperties;
import Model.Doctor;
import java.util.List;
import org.hibernate.SessionFactory;

public interface ClientService {

    // Create New Client Account
    public int addClient(Client client, SessionFactory sessionfactory);

    // Geting Client Property (ID) 
    public int getClientId(Client client, SessionFactory sessionfactory);

    // Geting ClientProperties 
    public ClientProperties getClientProperties(Client client, SessionFactory sessionfactory);
    
    // Edit Client
    public int editClient(Client client, SessionFactory sessionfactory);

    // Edit ClientProperties
    public int editClientProperties(ClientProperties client, SessionFactory sessionfactory);
    
    // Remove Client
    public int removeClient(Client client, SessionFactory sessionfactory);

    // Remove Booking of Client
    public int removeBooking(Doctor doctor, Client client, SessionFactory sessionfactory);

    /* Check IF Client Is Exist Or Not 
       IF Exist (Return All Data Of Client)
       IF Not Exist (Return Null)
     */
    public Client IsExist(Client client, SessionFactory sessionfactory);

    // Get Client (Data)
    public Client getClientData(Client client, SessionFactory sessionfactory);

    // Get All Properties Of Client
    public ClientProperties getClientProperties(SessionFactory sessionfactory, Client client);

    // Get Client By Code 
    public Client getClientCode(SessionFactory sessionfactory, Client client);

    public List<Booking> PharmecyBooking(SessionFactory sessionfactory);

    // Get ALL Booking (Doctor And Client)
    public List<Booking> statisticsBooking(SessionFactory sessionfactory);

    // Get ALL ClientBooking
    public List<Booking> allClientReservation(SessionFactory sessionfactory);

    // Get ALL ClientBooking ToDay
    public List<Booking> clientReservationsToday(SessionFactory sessionfactory, Client client);

    public List<Booking> Pharmecy(SessionFactory sessionfactory, Client client);

    public List<Booking> allBooking(SessionFactory sessionfactory);

    // Reserve A Medical Examination
    public int Booking(Doctor doctor, Client client, SessionFactory sessionfactory);

    //  Check If Client Booking Or No
    public int isBooking(SessionFactory sessionfactory, Client client, Doctor doctor);

    // Get the only Booking of Client 
    public List<Booking> onlyBooking(SessionFactory sessionfactory, Client client, Doctor doctor);

    // Get The Booking of The Doctor Today
    public Booking myBooking(SessionFactory sessionfactory, Client client, Doctor doctor);

    // Edit Booking Of Client
    public int editBooking(SessionFactory sessionfactory, Booking book);
}
