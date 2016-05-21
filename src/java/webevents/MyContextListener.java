package webevents;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Web application context is initialized!!!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Web application context is destroyed!!!");
    }
}
