package DatabaseFiles.ServicesInterface;

import Model.Booking;
import Model.Doctor;
import Model.DoctorProperties;
import Model.Pharmacy;
import java.util.List;

public interface DoctorService {

    // Create New Doctor Account
    public int addDoctor(Doctor doctor);

    // Geting Doctor Property (ID)
    public Doctor getDoctorID( Doctor doctor);

    // Get Password Of Doctor
    public String getPasswordDoctor(Doctor doctor);

    // Get DoctorProperties
    public DoctorProperties getDoctorProperties(Doctor doctor);

    //Get Doctor Balance
    public int getDoctorBalance(Doctor doctor);

    // Edit DoctorProperties
    public int editDoctorProperties(DoctorProperties doctor);

    /* Check IF Doctor Is Exist Or Not 
       IF Exist (Return All Data Of Doctor)
       IF Not Exist (Return Null)
       (Code , Password, Specialty)
     */
    public Doctor isExist(Doctor doctor);
    
    /* Check IF Doctor Is Exist Or Not 
       IF Exist (Return All Data Of Doctor)
       IF Not Exist (Return Null)
    (Code , Password)
     */
    public Doctor isExistlogin(Doctor doctor);
    //Remove Doctor
    public int removeDoctor(Doctor doctor);

    // Get Data Of Doctor by Use Property (DoctorSpecialty)
    public Doctor getDoctorSpec(Doctor spec);

    // Get Data Of Doctor by Use Property (Doctor Code)
    public Doctor getDoctorCode(Doctor doctor);

    // UpDate Infromation Of Data
    public int editDoctor(Doctor doctor);

    // Get Id Of Doctor By Using 
    public int getDoctorSpecId(Doctor doctor);

    // Get ALL DoctorBooking ToDay
    public List<Booking> myBooking(Doctor doctor);

    // Give Medicine
    public int giveMedicine(Pharmacy pharmcy);

    // Get Doctors who are Available
    public List<Doctor> availableDoctor();

    // Get All Doctor
    public List<Doctor> allDoctor();

}