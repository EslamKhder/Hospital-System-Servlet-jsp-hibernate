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

    public AdminServices() {
        dc = new DatabaseController();
        session = null;
    }

    @Override
    // Get Data Of Admin
    public Admin getAdmin(SessionFactory sessionfactory) {
        try {
            session = dc.getSession(sessionfactory);
            return (Admin) session.get(Admin.class, 1);
        } finally {
            session.close();
        }
    }
}
