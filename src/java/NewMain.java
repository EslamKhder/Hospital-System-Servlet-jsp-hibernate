
import Controller.ClientController;
import Controller.DoctorController;
import DatabaseFiles.ServicesImplementation.ClientServices;
import HibernateFiles.HibernateUtil;
import Model.Booking;
import Model.Client;
import Model.ClientProperties;
import Model.Doctor;
import Model.DoctorProperties;
import Model.Enums.Gender;
import Model.Pharmacy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/*
@Column(name = "Date")
    private String date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        this.date = sdf.format(new Date());
 */
public class NewMain {

    public static void main(String[] args) {

        ClientServices cs = new ClientServices();
        SessionFactory sessionf = HibernateUtil.getSessionFactory();
        ClientController cc = new ClientController();
        Client client = new Client();
        client.setId(2);
        
//        Session s = sessionf.openSession();
//        client.setCode("00000");
//        Doctor c = (Doctor) s.get(Doctor.class, 1);
//        s.close();
        JOptionPane.showMessageDialog(null,cc.Pharmecy(sessionf, client).size());
//        Booking book = new Booking();
//         Doctor doctor = new Doctor(); doctor.setId(1);
//         book.setDoctor(doctor);
//         book.setClient(c);
//         c.getBooking().add(book);
         //book.setClient(c);
//        ClientProperties cp = new ClientProperties("sooooooooooooo", "0111", 20, Gender.Male, "shiben");
//        cp.setId(3);
//        Client c = new Client("4000", "4000", cp);
//        c.setId(4);
//        s.getTransaction().commit();
//        s.close();
        //JOptionPane.showMessageDialog(null, c.getClientproperties().getAddress());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String date = sdf.format(new Date());
//            JOptionPane.showMessageDialog(null, date);
//        SessionFactory sessionf = HibernateUtil.getSessionFactory();
//        Session s = sessionf.openSession();
//        s.beginTransaction();
//         DoctorProperties dp = new DoctorProperties();
//         dp.setId(2);
//         dp.setGender(Gender.Male);
//         dp.setName("ahmed elghazaly");
//         dp.setPhone("01113903660");
//        Doctor doctor = new Doctor(2000, "2000", "Eyes Doctor", dp);
//        doctor.setId(2);
//        s.update(doctor);
//        s.getTransaction().commit();
//        Query q;
//        q = s.createQuery("from Booking where Client_ID = ?");
//        q.setInteger(0, 23);
//        if(q.list().isEmpty()){
//            JOptionPane.showMessageDialog(null, "no");
//        } else {
//            List<Booking> bb = q.list();
//            JOptionPane.showMessageDialog(null, bb.get(0).getDate());
//        }
//        ClientProperties cp = new ClientProperties("solom", "0111", 20, Gender.Male, "shiben");
//        Client c = new Client(5001, "5000", cp);
//        Client c = new Client();
//        c.setId(1);
//        Doctor doo = new Doctor();
//        doo.setId(1);

//        Booking bb = new Booking();
//        bb.setId(2);
//        Pharmacy ph = new Pharmacy();
//        ph.setBooking(bb);
//        ph.setMedicine("yarab");
//        s.save(ph);
//        s.getTransaction().commit();
//c.getClientproperties().setName("efef");
//        ClientController cc = new ClientController();
//        cc.Booking(doo, c, sessionf);
        // DoctorController dc = new DoctorController();
//        DoctorProperties dp = new DoctorProperties("Eslam Khder");
//        Doctor doctor = new Doctor(2000, "2001", "Eyes Doctor", dp);
//        dc.addDoctor(sessionf, doctor);
//if(cc.getClientData(c, sessionf) == null){
//    JOptionPane.showMessageDialog(null,  "no");
//} else {
//    JOptionPane.showMessageDialog(null, cc.getClientData(c, sessionf).getPassword() + "");
//}
//        
//        session.beginTransaction();
//        Client c = new Client();
//        c.setId(1);
//        c.setId(1);
//        Booking b = new Booking();
//        b.setClient(c);
//        
//        session.save(b);
////        
//        ClientProperties cp = new ClientProperties("solom", "0111", 20, Gender.Male, "shiben");
//        Client c = new Client(5001,"5000",cp);
//DoctorProperties dp = new DoctorProperties("nmbnm");
//
//        Doctor d = new Doctor();
//        d.setId(1);
//        Booking b = new Booking();
//        b.setClient(c);
//        b.setDoctor(d);
////        c.setId(1);
////        b.setIdclient(c.getId());
////        c.getBooking().add(b);
////        b.getClients().add(c);
//////        c.setId(1);
//////        c.getBooking().add(b);
//////        b.getClients().add(c);
////////        Booking b = new Booking(); 
////        b.getClients().add(c);
////////        c.getBooking().add(b);
////////b.getClients().add(c);
//        session.save(c);
//         session.save(b);
////        session.save(b);
//        ClientProperties cp = new ClientProperties("solom", "0111", 20, Gender.Male, "shiben");
//        Client c = (Client) session.get(Client.class, 1);
        //session.save(b);
//        JOptionPane.showMessageDialog(null, c.getBooking().size());
//        c.getBooking().add(b);
//Client c = new Client();
//c.setId(1);
//b.setClient(c);
//        session.update(b);
//        Booking bb = (Booking) session.get(Booking.class,7);
//        JOptionPane.showMessageDialog(null, b.getIdclient()+"");
////        c.getBooking().add(b);
//Client c = new Client();c.setId(1);
//bb.setClient(c);
//        //b.setClient(c);
//        session.update(bb);
//       //b.setClient(c);
//        //b.setClient(c);
//        session.update(b);
//        session.getTransaction().commit();
//        Center c = new Center();
//        Course cc = new Course();
//        cc = (Course) session.get(Course.class, 2);
//        JOptionPane.showMessageDialog(null, cc.getCenter().getName());
//        c.setId(1);
//        c.setName("Center1");
//        cc.setId(2);
//        cc.setName("English");
//        c.setCourse(cc);
//        cc.setCenter(c);
//        session.save(c);
//        session.getTransaction().commit();
    }
}
/*
        try {
//            ClientProperties cp = new ClientProperties("solom", "0111", 20, Gender.Male, "shiben");
//            Client c = new Client(5000,"5000",cp);
//            
            Client c = new Client(); c.setId(2);
//            c.setId(1);
            Doctor d = new Doctor();
            d.setId(1);
            d = dd.getDoctorID(sessionf, d);
            JOptionPane.showMessageDialog(null, d.toString());
            JOptionPane.showMessageDialog(null, d.getClients().get(0).getClientproperties().getName());
            d.setPassword("2222");
            d.getClients().add(c);
//            ClientController cc = new ClientController();

            if (dd.editDoctor(sessionf, d) == 1) {
                JOptionPane.showMessageDialog(null, "yes");
            } else {
                JOptionPane.showMessageDialog(null, "No");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "");
        }
 */
 /*
 try {
            DatabaseController dc = new DatabaseController();
            SessionFactory sessionf = dc.DataBaseConnection();
            ClientProperties cp = new ClientProperties("Eslam Khder", "01113903660", 20, Gender.Male, "El Shohada");
            Client c = new Client(2000, "2000", cp);
            ClientController cc = new ClientController();
            if (cc.addClient(c, sessionf) == 1) {
                JOptionPane.showMessageDialog(null, "yes");
            } else {
                JOptionPane.showMessageDialog(null, "No");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "");
        }

try {
            DatabaseController dc = new DatabaseController();
            SessionFactory sessionf = dc.DataBaseConnection();
            DoctorProperties dp = new DoctorProperties("Eslam Khder");
            Doctor doctor = new Doctor(2000, "2001", "Eyes Doctor", dp);
            DoctorController dcc = new DoctorController();
            if (dcc.addDoctor(sessionf,doctor) == 1) {
                JOptionPane.showMessageDialog(null, "yes");
            } else {
                JOptionPane.showMessageDialog(null, "No");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "");
        }
        try {
            ClientController cc = new ClientController();
            DoctorController dcc = new DoctorController();
            DatabaseController dc = new DatabaseController();
            SessionFactory sessionf = dc.DataBaseConnection();
            Client c = new Client(); c.setId(1);
            c = cc.getClient(c, sessionf);
            Doctor doctor = new Doctor(); doctor.setId(1);
            doctor = dcc.getDoctorID(sessionf, doctor);
            if (cc.Booking(doctor,sessionf) == 1) {
                JOptionPane.showMessageDialog(null, "yes");
            } else {
                JOptionPane.showMessageDialog(null, "No");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString() + "");
        }
 */
 /*
ClientProperties cp = new ClientProperties("Eslam Khder", "01113903660", 20, Gender.Male, "El Shohada");
            cp.setId(1);
            Client c = new Client();
            c.setId(1);
            c.setCode(2000);
            c.setPassword("2000");
            c.setBalance(0);
            c.setClientproperties(cp);
            cp.setClient(c);
            DoctorProperties dp = new DoctorProperties();
            dp.setId(1);
            dp.setName("Eslam Khder");
            Doctor doctor = new Doctor();
            doctor.setId(1);
            doctor.setCode(2000);
            doctor.setSpecialty("Eyes Doctor");
            doctor.setBalance(0);
            doctor.setPassword("1000");
            doctor.setDoctorproperties(dp);
            dp.setDoctor(doctor);
            doctor.getClients().add(c);
 */
