package DatabaseFiles.ServicesInterface;

import Model.Booking;
import Model.Doctor;
import Model.DoctorProperties;
import Model.Pharmacy;
import java.util.List;
import org.hibernate.SessionFactory;

public interface DoctorService {

    // Create New Doctor Account
    public int addDoctor(SessionFactory session, Doctor doctor);

    // Geting Doctor Property (ID)
    public Doctor getDoctorID(SessionFactory session, Doctor doctor);

    // Get Password Of Doctor
    public String getPasswordDoctor(SessionFactory session, Doctor doctor);

    // Get DoctorProperties
    public DoctorProperties getDoctorProperties(SessionFactory session, Doctor doctor);

    //Get Doctor Balance
    public int getDoctorBalance(Doctor doctor, SessionFactory sessionfactory);

    // Edit DoctorProperties
    public int editDoctorProperties(SessionFactory session, DoctorProperties doctor);

    /* Check IF Doctor Is Exist Or Not 
       IF Exist (Return All Data Of Doctor)
       IF Not Exist (Return Null)
       (Code , Password, Specialty)
     */
    public Doctor isExist(SessionFactory session, Doctor doctor);
    
    /* Check IF Doctor Is Exist Or Not 
       IF Exist (Return All Data Of Doctor)
       IF Not Exist (Return Null)
    (Code , Password)
     */
    public Doctor isExist(Doctor doctor,SessionFactory session);
    //Remove Doctor
    public int removeDoctor(SessionFactory session, Doctor doctor);

    // Get Data Of Doctor by Use Property (DoctorSpecialty)
    public Doctor getDoctorSpec(SessionFactory session, Doctor spec);

    // Get Data Of Doctor by Use Property (Doctor Code)
    public Doctor getDoctorCode(SessionFactory sessionf, Doctor doctor);

    // UpDate Infromation Of Data
    public int editDoctor(SessionFactory session, Doctor doctor);

    // Get Id Of Doctor By Using 
    public int getDoctorSpecId(SessionFactory session, Doctor doctor);

    // Get ALL DoctorBooking ToDay
    public List<Booking> myBooking(SessionFactory session, Doctor doctor);

    // Give Medicine
    public int giveMedicine(SessionFactory session, Pharmacy pharmcy);

    // Get Doctors who are Available
    public List<Doctor> availableDoctor(SessionFactory session);

    // Get All Doctor
    public List<Doctor> allDoctor(SessionFactory session);

}
