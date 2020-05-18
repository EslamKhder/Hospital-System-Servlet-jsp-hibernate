package DatabaseFiles.ServicesImplementation;

import Controller.DatabaseController;
import DatabaseFiles.ServicesInterface.DoctorService;
import Model.Booking;
import Model.Doctor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class DoctorServices implements DoctorService {

    private DatabaseController dc;
    private Session session;
    private Query q;
    private List<Doctor> doctors;
    private List<Booking> booking;

    public DoctorServices() {
        dc = new DatabaseController();
        session = null;
    }

    @Override
    public int addDoctor(SessionFactory sessionf, Doctor doctor) {
        try {
            session = dc.getSession(sessionf);
            session.beginTransaction();
            session.save(doctor);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    public Doctor getDoctorID(SessionFactory sessionf, Doctor doctor) {
        session = dc.getSession(sessionf);
        doctor = (Doctor) session.get(Doctor.class, doctor.getId());
        return doctor;
    }

    @Override
    public Doctor IsExist(SessionFactory sessionf, Doctor doctor) {
        session = dc.getSession(sessionf);
        q = session.createQuery("from Doctor where Code=? and Password=? and DoctorSpecialty=?");
        q.setInteger(0, doctor.getCode());
        q.setString(1, doctor.getPassword());
        q.setString(2, doctor.getSpecialty());
        doctors = q.list();
        if(doctors.isEmpty()){
            return null;
        }
        return doctors.get(0);
        
    }

    @Override
    public Doctor getDoctorSpec(SessionFactory sessionf, Doctor doctor) {
        session = dc.getSession(sessionf);
        session.beginTransaction();
        Criteria cri = session.createCriteria(Doctor.class);
        cri.add(Restrictions.eq("Specialty", doctor.getSpecialty()));
        List<Doctor> l = cri.list();
        return l.get(0);
    }
    @Override
    public int editDoctor(SessionFactory sessionfactory, Doctor doctor){
        try {
           // session = dc.getSession(sessionfactory);
            session.beginTransaction();
            session.update(doctor);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "");
            return 0;
        }
    }

    @Override
    public int getDoctorSpecId(SessionFactory sessionf, Doctor doctor) {
        session = dc.getSession(sessionf);
        q = session.createQuery("select id from Doctor where DoctorSpecialty=?");
        q.setString(0, doctor.getSpecialty());
        return (int) q.list().get(0);
    }

    @Override
    public List<Booking> myBooking(SessionFactory sessionfactory, Doctor doctor) {
        session = dc.getSession(sessionfactory);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        q = session.createQuery("from Booking where Date = ?");
        q.setString(0, date);
        booking = q.list();
        if(booking.isEmpty()){
            return null;
        } else {
            booking = (List<Booking>) booking.parallelStream()
                    .filter(x -> (doctor.getId() == x.getDoctor().getId())).collect(Collectors.toList());
            return booking;
        }
    }
}
