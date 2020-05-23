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

    // Edit Client
    public int editClient(Client client, SessionFactory sessionfactory);
    
    // Edit Client
    public int removeBooking(Doctor doctor,Client client, SessionFactory sessionfactory);

    /* Check IF Client Is Exist Or Not 
       IF Exist (Return All Data Of Client)
       IF Not Exist (Return Null)
     */
    public Client IsExist(Client client, SessionFactory sessionfactory);

    // Check IF Client Is Exist Or Not
    public Client getClientData(Client client, SessionFactory sessionfactory);

    // Get All Properties Of Client
    public ClientProperties getClientProperties(SessionFactory sessionfactory, Client client);

    // Get Client By Code 
    public Client getClientCode(SessionFactory sessionfactory, Client client);

    // Reserve A Medical Examination
    public int Booking(Doctor doctor, Client client, SessionFactory sessionfactory);

    //  Check If Client Booking Or No
    public int isBooking(SessionFactory sessionfactory, Client client, Doctor doctor);

    // Get ALL ClientBooking ToDay
    public List<Booking> myBooking(SessionFactory sessionfactory, Client client);
}
