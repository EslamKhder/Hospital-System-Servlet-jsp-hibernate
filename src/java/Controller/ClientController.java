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
    public int editClient(Client client, SessionFactory sessionfactory){
        return clientservices.editClient(client, sessionfactory);
    }
    public int removeBooking(Doctor doctor,Client client, SessionFactory sessionfactory) {
        return clientservices.removeBooking(doctor, client, sessionfactory);
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
    
    public Client getClientCode(SessionFactory sessionfactory, Client client){
        return clientservices.getClientCode(sessionfactory, client);
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
    public List<Booking> myBookingtoday(SessionFactory sessionfactory, Client client) {
        return clientservices.myBookingtoday(sessionfactory, client);
    }
    public List<Booking> allmyBooking(SessionFactory sessionfactory, Client client) {
        return clientservices.allmyBooking(sessionfactory, client);
    }
    public List<Booking> allBooking(SessionFactory sessionfactory) {
        return clientservices.allBooking(sessionfactory);
    }
    public Booking myBooking(SessionFactory sessionfactory, Client client, Doctor doctor) {
        return clientservices.myBooking(sessionfactory, client, doctor);
    }
    public int editBooking(SessionFactory sessionfactory,Booking book){
        return clientservices.editBooking(sessionfactory, book);
    }
}