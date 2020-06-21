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

    public AdminController(SessionFactory sessionfactory) {
        adminservices = new AdminServices(sessionfactory);
    }
    public Admin getAdmin(){
        return adminservices.getAdmin();
    }
    public Admin IsExist(Admin admin){
        return adminservices.IsExist(admin);
    }
}
