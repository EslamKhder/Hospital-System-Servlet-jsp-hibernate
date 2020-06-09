package DatabaseFiles.ServicesImplementation;

import Controller.DatabaseController;
import DatabaseFiles.ServicesInterface.AdminService;
import Model.Admin;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class AdminServices implements AdminService {

    private DatabaseController dc;
    private Session session;
    private Admin admin;
    private Query q;
    private List<Admin> admins;

    public AdminServices() {
        dc = new DatabaseController();
        session = null;
    }

    @Override
    // Get Data Of Admin
    public Admin getAdmin(SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            admin =  (Admin) session.get(Admin.class, 1);
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
    public Admin IsExist(Admin admin, SessionFactory sessionfactory){
        try {
            session = dc.getSession(sessionfactory);
            q = session.createQuery("from Admin where Code=? and Password=?");
            q.setString(0, admin.getCode());
            q.setString(1, admin.getPassword());
            admins = q.list();
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
