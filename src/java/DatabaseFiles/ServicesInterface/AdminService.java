package DatabaseFiles.ServicesInterface;

import Model.Admin;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public interface AdminService {
    public Admin getAdmin(SessionFactory sessionfactory);
}
