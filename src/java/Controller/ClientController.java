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

    public ClientController(SessionFactory sessionfactory) {
        clientservices = new ClientServices(sessionfactory);
    }

    public int addClient(Client client) {
        return clientservices.addClient(client);
    }

    public Client IsExist(Client client) {
        return clientservices.IsExist(client);
    }
    public int removeClient(Client client){
        return clientservices.removeClient(client);
    }
    public int getClientId(Client client) {
        return clientservices.getClientId(client);
    }
    public int editClientProperties(ClientProperties client){
        return clientservices.editClientProperties(client);
    }
    public int getClientBalance(Client client) {
        return clientservices.getClientBalance(client);
    }
    public int editClient(Client client) {
        return clientservices.editClient(client);
    }

    public int removeBooking(Doctor doctor, Client client) {
        return clientservices.removeBooking(doctor, client);
    }

    public Client getClientData(Client client) {
        return clientservices.getClientData(client);
    }

    public ClientProperties ClientProperties(Client client) {
    return clientservices.ClientProperties(client);
    }

    public Client getClientCode( Client client) {
        return clientservices.getClientCode(client);
    }

    public int Booking(Doctor doctor, Client client) {
        return clientservices.Booking(doctor, client);
    }

    public List<Booking> PharmecyBooking() {
        return clientservices.PharmecyBooking();
    }

    public List<Booking> statisticsBooking() {
        return clientservices.statisticsBooking();
    }

    public List<Booking> allClientReservation(Client client) {
        return clientservices.allClientReservation( client);
    }

    public List<Booking> clientReservationsToday(Client client) {
        return clientservices.clientReservationsToday(client);
    }

    public List<Booking> Pharmecy( Client client) {
        return clientservices.Pharmecy(client);
    }

    public int isBooking( Client client, Doctor doctor) {
        return clientservices.isBooking( client, doctor);
    }

    public List<Booking> allBooking() {
        return clientservices.allBooking();
    }

    public Booking myBooking(Client client, Doctor doctor) {
        return clientservices.myBooking(client, doctor);
    }
    public List<Booking> onlyBooking(Client client, Doctor doctor){
        return clientservices.onlyBooking(client, doctor);
    }
    public int editBooking( Booking book) {
        return clientservices.editBooking(book);
    }
    public List<Client> Clients(){
        return clientservices.Clients();
    }
}
