package Controller;

import DatabaseFiles.ServicesImplementation.DoctorServices;
import Model.Booking;
import Model.Doctor;
import Model.DoctorProperties;
import Model.Pharmacy;
import java.util.List;
import org.hibernate.SessionFactory;

public class DoctorController {

    DoctorServices doctorservices;

    public DoctorController(SessionFactory sessionf) {
        doctorservices = new DoctorServices(sessionf);
    }

    public int addDoctor(Doctor doctor) {
        return doctorservices.addDoctor(doctor);
    }

    public Doctor getDoctorID(Doctor doctor) {
        return doctorservices.getDoctorID(doctor);
    }

    public String getPasswordDoctor(Doctor doctor) {
        return doctorservices.getPasswordDoctor(doctor);
    }

    public DoctorProperties getDoctorProperties(Doctor doctor) {
        return doctorservices.getDoctorProperties(doctor);
    }

    public int getDoctorBalance(Doctor doctor) {
        return doctorservices.getDoctorBalance(doctor);
    }

    public int editDoctorProperties(DoctorProperties doctor) {
        return doctorservices.editDoctorProperties( doctor);
    }

    public int removeDoctor( Doctor doctor) {
        return doctorservices.removeDoctor(doctor);
    }

    public Doctor isExist( Doctor doctor) {
        return doctorservices.isExist(doctor);
    }

    public Doctor isExistlogin(Doctor doctor) {
        return doctorservices.isExistlogin(doctor);
    }

    public Doctor getDoctorSpec(Doctor doctor) {
        return doctorservices.getDoctorSpec(doctor);
    }

    public Doctor getDoctorCode(Doctor doctor) {
        return doctorservices.getDoctorCode(doctor);
    }

    public int editDoctor(Doctor doctor) {
        return doctorservices.editDoctor(doctor);
    }

    public int getDoctorSpecId(Doctor doctor) {
        return doctorservices.getDoctorSpecId(doctor);
    }

    public List<Booking> myBooking( Doctor doctor) {
        return doctorservices.myBooking(doctor);
    }

    public int giveMedicine(Pharmacy pharmcy) {
        return doctorservices.giveMedicine(pharmcy);
    }

    public List<Doctor> allDoctor() {
        return doctorservices.allDoctor();
    }

    public List<Doctor> availableDoctor() {
        return doctorservices.availableDoctor();
    }
}
