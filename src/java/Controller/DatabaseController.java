package Controller;

import DatabaseFiles.ServicesImplementation.DatabaseConnection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DatabaseController {
    DatabaseConnection databaseconnection;
    
    public DatabaseController(){
        databaseconnection = new DatabaseConnection();
    }
    public SessionFactory DataBaseConnection() {
        return databaseconnection.DataBaseConnection();
        
    }
    
    public Session getSession(SessionFactory session) {
        return databaseconnection.getSession(session);
    }
}
