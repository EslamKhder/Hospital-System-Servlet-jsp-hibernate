package DatabaseFiles.ServicesImplementation;

import Controller.DatabaseController;
import DatabaseFiles.ServicesInterface.DoctorService;
import Model.Booking;
import Model.Doctor;
import Model.DoctorProperties;
import Model.Pharmacy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
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
    private String result;
    private int out;
    private DoctorProperties doctorproperties;

    public DoctorServices(SessionFactory sessionfactory) {
        this.dc = new DatabaseController();
        this.q = null;
        this.doctors = new ArrayList();
        this.booking = new ArrayList();
        this.doctorproperties = new DoctorProperties();
        this.session = dc.getSession(sessionfactory);
        this.session.beginTransaction();
    }

    // Create New Doctor Account
    @Override
    public int addDoctor(Doctor doctor) {
        try {
            session.persist(doctor);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }

    }

    // Geting Doctor Property (ID)
    @Override
    public Doctor getDoctorID(Doctor doctor) {
        try {
            doctor = (Doctor) session.get(Doctor.class, doctor.getId());
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return doctor;
    }

    // Get Password Of Doctor
    @Override
    public String getPasswordDoctor(Doctor doctor) {
        try {
            q = session.createQuery("select password from Doctor where code=?");
            q.setString(0, doctor.getCode());
            result = (String) q.list().get(0);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return result;
    }

    // Get DoctorProperties
    @Override
    public DoctorProperties getDoctorProperties(Doctor doctor) {
        try {
            doctorproperties = (DoctorProperties) session.get(DoctorProperties.class, doctor.getDoctorproperties().getId());
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return doctorproperties;
    }
    //Get Doctor Balance

    @Override
    public int getDoctorBalance(Doctor doctor) {
        try {
            q = session.createQuery("select balance from Doctor where id=?");
            q.setInteger(0, doctor.getId());
            out = (int) q.list().get(0);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return out;
    }

    // Edit DoctorProperties
    @Override
    public int editDoctorProperties(DoctorProperties doctor) {
        try {
            session.update(doctor);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    //Remove Doctor
    @Override
    public int removeDoctor( Doctor doctor) {
        try {

            session.delete(doctor);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    /* Check IF Doctor Is Exist Or Not 
       IF Exist (Return All Data Of Doctor)
       IF Not Exist (Return Null)
    (Code , Password,Specialty)
     */
    
    @Override
    public Doctor isExist(Doctor doctor) {
        try {
            q = session.createQuery("from Doctor where Code=? and Password=? and DoctorSpecialty=?");
            q.setString(0, doctor.getCode());
            q.setString(1, doctor.getPassword());
            q.setString(2, doctor.getSpecialty());
            doctors = q.list();
            session.getTransaction().commit();
            if (doctors.isEmpty()) {
                return null;
            }
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return doctors.get(0);
    }
    /* Check IF Doctor Is Exist Or Not 
       IF Exist (Return All Data Of Doctor)
       IF Not Exist (Return Null)
    (Code , Password)
     */
    @Override
    public Doctor isExistlogin(Doctor doctor){
        try {
            q = session.createQuery("from Doctor where Code=? and Password=?");
            q.setString(0, doctor.getCode());
            q.setString(1, doctor.getPassword());
            doctors = q.list();
            session.getTransaction().commit();
            if (doctors.isEmpty()) {
                return null;
            }
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return doctors.get(0);
    }
    // Get Data Of Doctor by Use Property (DoctorSpecialty)
    @Override
    public Doctor getDoctorSpec(Doctor doctor) {
        try {
            Criteria cri = session.createCriteria(Doctor.class);
            cri.add(Restrictions.eq("Specialty", doctor.getSpecialty()));
            doctors = cri.list();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return doctors.get(0);
    }

    // Get Data Of Doctor by Use Property (Doctor Code)
    @Override
    public Doctor getDoctorCode(Doctor doctor) {
        try {
            Criteria cri = session.createCriteria(Doctor.class);
            cri.add(Restrictions.eq("code", doctor.getCode()));
            doctors = cri.list();
            session.getTransaction().commit();
            if (doctors.isEmpty()) {
                return null;
            }

        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return doctors.get(0);
    }

    // UpDate Infromation Of Data
    @Override
    public int editDoctor(Doctor doctor) {
        try {
            session.update(doctor);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }

    // Get Id Of Doctor By Using
    @Override
    public int getDoctorSpecId(Doctor doctor) {
        try {
            q = session.createQuery("select id from Doctor where DoctorSpecialty=?");
            q.setString(0, doctor.getSpecialty());
            out = (int) q.list().get(0);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return out;
    }

    // Get ALL DoctorBooking ToDay
    @Override
    public List<Booking> myBooking(Doctor doctor) {
        try {
            q = session.createQuery("from Booking where Date = ?");
            q.setString(0, this.Date());
            booking = q.list();
            session.getTransaction().commit();
            if (booking.isEmpty()) {
                return null;
            } else {
                booking = (List<Booking>) booking.parallelStream()
                        .filter(x -> (doctor.getId() == x.getDoctor().getId() && x.getAcceptdoctor() == 0)).collect(Collectors.toList());
            }
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return booking;
    }

    @Override
    public int giveMedicine(Pharmacy pharmcy) {
        try {
            session.save(pharmcy);
            session.getTransaction().commit();
            return 1;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.close();
        }
    }
 
    // Get All Doctor
    @Override
    public List<Doctor> allDoctor() {
        try {
            q = session.createQuery("from Doctor");
            doctors = q.list();
            session.getTransaction().commit();
            if (doctors.isEmpty()) {
                return null;
            }

        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally { 
            session.close();
        }
        return doctors;
    }

    // Get Doctors who are Available
    @Override
    public List<Doctor> availableDoctor() {
        doctors = this.allDoctor();
        if (doctors.isEmpty()) {
            return null;
        } else {
            doctors = doctors.parallelStream().filter(x -> x.getAvailable() == 1).collect(Collectors.toList());
        }
        return doctors;
    }

    public String Date() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }
}