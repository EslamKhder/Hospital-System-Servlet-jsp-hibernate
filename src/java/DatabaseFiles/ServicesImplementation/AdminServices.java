package DatabaseFiles.ServicesImplementation;

import Controller.DatabaseController;
import DatabaseFiles.ServicesInterface.AdminService;
import Model.Admin;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class AdminServices implements AdminService {

    private SessionFactory sessionfactory;
    private DatabaseController dc;
    private Admin admin;
    private Query q;
    private List<Admin> admins;

    public AdminServices(SessionFactory sessionfactory) {
        this.sessionfactory = sessionfactory;
        this.dc = new DatabaseController();
        this.admin = new Admin();
        this.q = null;
        this.admins = new ArrayList();
    }

    @Override
    // Get Data Of Admin
    public Admin getAdmin() {
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            admin =  (Admin) session.get(Admin.class, 1);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return admin;
    }
    /* Check IF Client Is Exist Or Not 
       IF Exist (Return All Data Of Client)
       IF Not Exist (Return Null)
     */
    @Override
    public Admin IsExist(Admin admin){
        Session session = null;
        try {
            session = dc.getSession(sessionfactory);
            session.beginTransaction();
            q = session.createQuery("from Admin where Code=? and Password=?");
            q.setString(0, admin.getCode());
            q.setString(1, admin.getPassword());
            admins = q.list();
            session.getTransaction().commit();
            if (admins.isEmpty()) {
                return null;
            }
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return admins.get(0);
    }
}
