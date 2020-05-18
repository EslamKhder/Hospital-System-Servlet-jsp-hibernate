package DatabaseFiles.ServicesInterface;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public interface DatabaseService {
    public SessionFactory DataBaseConnection();
    public Session getSession(SessionFactory session);
}
