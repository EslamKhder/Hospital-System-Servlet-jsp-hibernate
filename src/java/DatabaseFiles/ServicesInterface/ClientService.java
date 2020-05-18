package DatabaseFiles.ServicesInterface;

import Model.Booking;
import Model.Client;
import Model.ClientProperties;
import Model.Doctor;
import Model.Pharmacy;
import java.util.List;
import org.hibernate.SessionFactory;

public interface ClientService {

    public int addClient(Client client, SessionFactory sessionfactory);

    public int getClientId(Client client, SessionFactory sessionfactory);

    public Client IsExist(Client client, SessionFactory sessionfactory);

    public Client getClientData(Client client, SessionFactory sessionfactory);

    public ClientProperties getClientProperties(SessionFactory sessionfactory, Client client);

    public int Booking(Doctor doctor, Client client, SessionFactory sessionfactory);

    public int isBooking(SessionFactory sessionfactory, Client client, Doctor doctor);

    public List<Booking> myBooking(SessionFactory sessionfactory, Client client);
}
