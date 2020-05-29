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

    public DoctorController() {
        doctorservices = new DoctorServices();
    }

    public int addDoctor(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.addDoctor(sessionf, doctor);
    }

    public Doctor getDoctorID(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.getDoctorID(sessionf, doctor);
    }

    public String getPasswordDoctor(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.getPasswordDoctor(sessionf, doctor);
    }
    public DoctorProperties getDoctorProperties(SessionFactory session, Doctor doctor){
        return doctorservices.getDoctorProperties(session, doctor);
    }
    public int editDoctorProperties(SessionFactory session, DoctorProperties doctor){
        return doctorservices.editDoctorProperties(session, doctor);
    }
    
    public int removeDoctor(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.removeDoctor(sessionf, doctor);
    }

    public Doctor isExist(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.isExist(sessionf, doctor);
    }

    public Doctor getDoctorSpec(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.getDoctorSpec(sessionf, doctor);
    }

    public Doctor getDoctorCode(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.getDoctorCode(sessionf, doctor);
    }

    public int editDoctor(SessionFactory sessionfactory, Doctor doctor) {
        return doctorservices.editDoctor(sessionfactory, doctor);
    }

    public int getDoctorSpecId(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.getDoctorSpecId(sessionf, doctor);
    }

    public List<Booking> myBooking(SessionFactory sessionfactory, Doctor doctor) {
        return doctorservices.myBooking(sessionfactory, doctor);
    }

    public int giveMedicine(SessionFactory sessionfactory, Pharmacy pharmcy) {
        return doctorservices.giveMedicine(sessionfactory, pharmcy);
    }

    public List<Doctor> allDoctor(SessionFactory sessionf) {
        return doctorservices.allDoctor(sessionf);
    }
}
