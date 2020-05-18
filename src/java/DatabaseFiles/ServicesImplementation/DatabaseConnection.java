package DatabaseFiles.ServicesImplementation;

import HibernateFiles.HibernateUtil;
import org.hibernate.Session;
import DatabaseFiles.ServicesInterface.DatabaseService;
import org.hibernate.SessionFactory;


public class DatabaseConnection implements DatabaseService{

    @Override
    public SessionFactory DataBaseConnection() {
        return HibernateUtil.getSessionFactory();
        
    }
    
    @Override
    public Session getSession(SessionFactory session) {
        return session.openSession();
    }
}
