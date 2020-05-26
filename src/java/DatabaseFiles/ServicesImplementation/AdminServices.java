package DatabaseFiles.ServicesImplementation;

import Controller.DatabaseController;
import DatabaseFiles.ServicesInterface.AdminService;
import Model.Admin;
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

    public AdminServices() {
        dc = new DatabaseController();
        session = null;
    }

    @Override
    // Get Data Of Admin
    public Admin getAdmin(SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            admin =  (Admin) session.get(Admin.class, 10);
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return admin;
    }
}
