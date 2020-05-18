package Controller;

import DatabaseFiles.ServicesImplementation.DoctorServices;
import Model.Booking;
import Model.Doctor;
import java.util.List;
import org.hibernate.SessionFactory;

public class DoctorController {
    DoctorServices doctorservices;
    public DoctorController(){
        doctorservices = new DoctorServices();
    }
    
    public int addDoctor(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.addDoctor(sessionf, doctor);
    }

    public Doctor getDoctorID(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.getDoctorID(sessionf, doctor);
    }

    public Doctor IsExist(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.IsExist(sessionf, doctor);
    }
    public Doctor getDoctorSpec(SessionFactory sessionf, Doctor doctor){
        return doctorservices.getDoctorSpec(sessionf, doctor);
    }
    public int editDoctor(SessionFactory sessionfactory, Doctor doctor){
        return doctorservices.editDoctor(sessionfactory, doctor);
    }
    public int getDoctorSpecId(SessionFactory sessionf, Doctor doctor) {
        return doctorservices.getDoctorSpecId(sessionf, doctor);
    }
    public List<Booking> myBooking(SessionFactory sessionfactory, Doctor doctor) {
        return doctorservices.myBooking(sessionfactory, doctor);
    }
}