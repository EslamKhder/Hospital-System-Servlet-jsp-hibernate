/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class AdminServices implements AdminService{
    private DatabaseController dc;
    private Session session;

    public AdminServices() {
        dc = new DatabaseController();
        session = null;
    }
    @Override
    public Admin getAdmin(SessionFactory sessionfactory) {
        session = dc.getSession(sessionfactory);
        return (Admin) session.get(Admin.class, 1);
    }
    
}
