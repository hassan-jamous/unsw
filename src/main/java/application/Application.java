package application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.StoreService;

import java.util.logging.Logger;

public final class Application {
    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    private Application() {
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringApplicationConfiguration.class);

        StoreService ss = (StoreService) context.getBean("storeService");
        LOGGER.info(ss.getStoreLocation("Coles Neutral Bay"));
    }

}
