package Controller;

import DatabaseFiles.ServicesImplementation.ClientServices;
import Model.Booking;
import Model.Client;
import Model.ClientProperties;
import Model.Doctor;
import java.util.List;
import org.hibernate.SessionFactory;

public class ClientController {
    ClientServices clientservices;
    public ClientController(){
        clientservices = new ClientServices();
    }
    public int addClient(Client client,SessionFactory sessionfactory){
        return clientservices.addClient(client,sessionfactory);
    }
    public Client IsExist(Client client,SessionFactory sessionfactory){
        return clientservices.IsExist(client,sessionfactory);
    }
    public int getClientId(Client client, SessionFactory sessionfactory) {
        return clientservices.getClientId(client, sessionfactory);
    }
//    public Client getClientData(Client client,SessionFactory sessionfactory){
//        return clientservices.getClientData(client, sessionfactory);
//    }
    public Client getClientData(Client client,SessionFactory sessionfactory){
        return clientservices.getClientData(client,sessionfactory);
    }
    
    public ClientProperties getClientProperties(SessionFactory sessionfactory,Client client){
        return clientservices.getClientProperties(sessionfactory,client);
    }
//    public int addBooking(SessionFactory sessionfactory, Client client, Doctor doctor) {
//        return clientservices.addBooking(sessionfactory, client, doctor);
//    }
    public int Booking(Doctor doctor,Client client,SessionFactory sessionfactory){
        return clientservices.Booking(doctor,client,sessionfactory);
    }
    public int isBooking(SessionFactory sessionfactory,Client client,Doctor doctor) {
        return clientservices.isBooking(sessionfactory, client, doctor);
    }
    public List<Booking> myBooking(SessionFactory sessionfactory, Client client) {
        return clientservices.myBooking(sessionfactory, client);
    }
}