package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ClientID", nullable = false)
    private int id;
    
    @Column(name = "Code", nullable = false, unique = true)
    private int code;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Balance", nullable = false)
    private int balance;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ClientProperties clientproperties;
    
    @OneToMany(mappedBy = "client")
    private List<Booking> booking = new ArrayList<>();
    
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="Doctor_ID")
//    Doctor doctor;

    public Client() {

    }

    public Client(int code, String password, ClientProperties clientproperties) {
        this.code = code;
        this.password = password;
        this.clientproperties = clientproperties;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ClientProperties getClientproperties() {
        return clientproperties;
    }

    public void setClientproperties(ClientProperties clientproperties) {
        this.clientproperties = clientproperties;
    }

    public List<Booking> getBooking() {
        return booking;
    }

    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }
    
}
