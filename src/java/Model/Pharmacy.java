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
@Table(name = "Pharmacy")
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "medicine")
    private String medicine;

    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @OneToOne(mappedBy = "pharmacy")
    @JoinColumn(name = "Booking_ID")
    private Booking booking;

    public Pharmacy() {
        date = new Date();
    }

    public Pharmacy(String medicine) {
        date = new Date();
        this.medicine = medicine;
    }

    public Pharmacy(String medicine, Booking booking) {
        date = new Date();
        this.medicine = medicine;
        this.booking = booking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

}
