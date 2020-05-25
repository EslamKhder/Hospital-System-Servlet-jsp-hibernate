package Model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Eng Eslam khder
 */

@Entity
@Table(name = "Booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @Column(name = "Time")
    @Temporal(TemporalType.TIME)
    private Date time;
    
    @ManyToOne()
    @JoinColumn(name = "Client_ID")
    private Client client;

    @ManyToOne()
    @JoinColumn(name = "Doctor_ID")
    private Doctor doctor;
    
    @OneToOne(cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
    private Pharmacy pharmacy;
    
    @Column(name = "Accept_Doctor")
    private int acceptdoctor;

    @Column(name = "Accept_Medicine")
    private int acceptmedicine;
    
    public Booking() {
        date = new Date();
        time = new Date();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public int getAcceptdoctor() {
        return acceptdoctor;
    }

    public void setAcceptdoctor(int acceptdoctor) {
        this.acceptdoctor = acceptdoctor;
    }
    
    public int getAcceptmedicine() {
        return acceptmedicine;
    }

    public void setAcceptmedicine(int acceptmedicine) {
        this.acceptmedicine = acceptmedicine;
    }

    
}
