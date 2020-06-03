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

    public ClientController() {
        clientservices = new ClientServices();
    }

    public int addClient(Client client, SessionFactory sessionfactory) {
        return clientservices.addClient(client, sessionfactory);
    }

    public Client IsExist(Client client, SessionFactory sessionfactory) {
        return clientservices.IsExist(client, sessionfactory);
    }
    public int removeClient(Client client, SessionFactory sessionfactory){
        return clientservices.removeClient(client, sessionfactory);
    }
    public int getClientId(Client client, SessionFactory sessionfactory) {
        return clientservices.getClientId(client, sessionfactory);
    }
    public int editClientProperties(ClientProperties client, SessionFactory sessionfactory){
        return clientservices.editClientProperties(client, sessionfactory);
    }
    public int getClientBalance(Client client, SessionFactory sessionfactory) {
        return clientservices.getClientBalance(client, sessionfactory);
    }
    public int editClient(Client client, SessionFactory sessionfactory) {
        return clientservices.editClient(client, sessionfactory);
    }

    public int removeBooking(Doctor doctor, Client client, SessionFactory sessionfactory) {
        return clientservices.removeBooking(doctor, client, sessionfactory);
    }

    public Client getClientData(Client client, SessionFactory sessionfactory) {
        return clientservices.getClientData(client, sessionfactory);
    }

    public ClientProperties getClientProperties(SessionFactory sessionfactory, Client client) {
        return clientservices.getClientProperties(sessionfactory, client);
    }

    public Client getClientCode(SessionFactory sessionfactory, Client client) {
        return clientservices.getClientCode(sessionfactory, client);
    }

    public int Booking(Doctor doctor, Client client, SessionFactory sessionfactory) {
        return clientservices.Booking(doctor, client, sessionfactory);
    }

    public List<Booking> PharmecyBooking(SessionFactory sessionfactory) {
        return clientservices.PharmecyBooking(sessionfactory);
    }

    public List<Booking> statisticsBooking(SessionFactory sessionfactory) {
        return clientservices.statisticsBooking(sessionfactory);
    }

    public List<Booking> allClientReservation(SessionFactory sessionfactory, Client client) {
        return clientservices.allClientReservation(sessionfactory, client);
    }

    public List<Booking> clientReservationsToday(SessionFactory sessionfactory, Client client) {
        return clientservices.clientReservationsToday(sessionfactory, client);
    }

    public List<Booking> Pharmecy(SessionFactory sessionfactory, Client client) {
        return clientservices.Pharmecy(sessionfactory, client);
    }

    public int isBooking(SessionFactory sessionfactory, Client client, Doctor doctor) {
        return clientservices.isBooking(sessionfactory, client, doctor);
    }

    public List<Booking> allBooking(SessionFactory sessionfactory) {
        return clientservices.allBooking(sessionfactory);
    }

    public Booking myBooking(SessionFactory sessionfactory, Client client, Doctor doctor) {
        return clientservices.myBooking(sessionfactory, client, doctor);
    }
    public List<Booking> onlyBooking(SessionFactory sessionfactory, Client client, Doctor doctor){
        return clientservices.onlyBooking(sessionfactory, client, doctor);
    }
    public int editBooking(SessionFactory sessionfactory, Booking book) {
        return clientservices.editBooking(sessionfactory, book);
    }
    public List<Client> Clients(SessionFactory sessionfactory){
        return clientservices.Clients(sessionfactory);
    }
}
