package DatabaseFiles.ServicesInterface;

import Model.Booking;
import Model.Client;
import Model.ClientProperties;
import Model.Doctor;
import java.util.List;
import org.hibernate.SessionFactory;

public interface ClientService {

    // Create New Client Account
    public int addClient(Client client);

    // Geting Client Property (ID) 
    public int getClientId(Client client);

    // Geting ClientProperties 
    public ClientProperties getClientProperties(Client client);

    //Get Client Balance
    public int getClientBalance(Client client);

    // Edit Client
    public int editClient(Client client);

    // Edit ClientProperties
    public int editClientProperties(ClientProperties client);

    // Remove Client
    public int removeClient(Client client);

    // Remove Booking of Client
    public int removeBooking(Doctor doctor, Client client);

    /* Check IF Client Is Exist Or Not 
       IF Exist (Return All Data Of Client)
       IF Not Exist (Return Null)
     */
    public Client IsExist(Client client);

    // Get Client (Data)
    public Client getClientData(Client client);

    // Get All Properties Of Client
    public ClientProperties ClientProperties(Client client);

    // Get Client By Code 
    public Client getClientCode(Client client);

    public List<Booking> PharmecyBooking();

    // Get ALL Booking (Doctor And Client)
    public List<Booking> statisticsBooking();

    // Get ALL ClientBooking
    public List<Booking> allClientReservation(Client client);

    // Get ALL ClientBooking ToDay
    public List<Booking> clientReservationsToday( Client client);

    public List<Booking> Pharmecy( Client client);

    public List<Booking> allBooking();

    // Reserve A Medical Examination
    public int Booking(Doctor doctor, Client client);

    //  Check If Client Booking Or No
    public int isBooking(Client client, Doctor doctor);

    // Get the only Booking of Client 
    public List<Booking> onlyBooking(Client client, Doctor doctor);

    // Get The Booking of The Doctor Today
    public Booking myBooking(Client client, Doctor doctor);

    // Edit Booking Of Client
    public int editBooking(Booking book);

    // All Client
    public List<Client> Clients();
}
