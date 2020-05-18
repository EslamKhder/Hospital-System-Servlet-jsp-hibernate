package DatabaseFiles.ServicesInterface;

import Model.Booking;
import Model.Doctor;
import java.util.List;
import org.hibernate.SessionFactory;

public interface DoctorService {

    public int addDoctor(SessionFactory session, Doctor doctor);

    public Doctor getDoctorID(SessionFactory session, Doctor doctor);

    public Doctor IsExist(SessionFactory session, Doctor doctor);
    
    public Doctor getDoctorSpec(SessionFactory session, Doctor spec);
    
    public int editDoctor(SessionFactory session, Doctor doctor);
    
    public int getDoctorSpecId(SessionFactory session, Doctor doctor);
    
    public List<Booking> myBooking(SessionFactory session, Doctor doctor);
}
