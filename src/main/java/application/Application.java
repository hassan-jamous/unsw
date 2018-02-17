package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.StoreService;

import java.util.logging.Logger;

public final class Application {
    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    private Application() {
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");

        StoreService ss = (StoreService) context.getBean("storeService");
        LOGGER.info(ss.getStoreLocation("Coles Neutral Bay"));
    }

}
