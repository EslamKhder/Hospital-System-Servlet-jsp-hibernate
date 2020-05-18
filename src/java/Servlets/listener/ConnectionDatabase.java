package Servlets.listener;

import Controller.DatabaseController;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ConnectionDatabase implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DatabaseController DC = new DatabaseController();
        sce.getServletContext().setAttribute("factory", DC.DataBaseConnection());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().removeAttribute("factory");
    }
}
