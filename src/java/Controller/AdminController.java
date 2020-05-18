package Controller;

import DatabaseFiles.ServicesImplementation.AdminServices;
import Model.Admin;
import org.hibernate.SessionFactory;

/**
 *
 * @author Eng Eslam khder
 */
public class AdminController {
    AdminServices adminservices;

    public AdminController() {
        adminservices = new AdminServices();
    }
    public Admin getAdmin(SessionFactory sessionfactory){
        return adminservices.getAdmin(sessionfactory);
    }
}
