package listener;

import javax.servlet.*;

public class AppContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Ứng dụng BMI đã được khởi động.");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Ứng dụng BMI đã bị dừng.");
    }
}