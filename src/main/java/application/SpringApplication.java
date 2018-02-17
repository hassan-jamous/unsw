package application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.StoreService;

import java.util.logging.Logger;

@Configuration
@ComponentScan("location,services")
@SuppressWarnings("hideutilityclassconstructor")
public class SpringApplication {

    private static final Logger LOGGER = Logger.getLogger(SpringApplication.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringApplication.class);

        StoreService ss = (StoreService) context.getBean("storeService");
        LOGGER.info(ss.getStoreLocation("Coles Neutral Bay"));
    }
}
