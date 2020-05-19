package DatabaseFiles.ServicesInterface;

import Model.Admin;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public interface AdminService {
    // Get Data Of Admin
    public Admin getAdmin(SessionFactory sessionfactory);
}
