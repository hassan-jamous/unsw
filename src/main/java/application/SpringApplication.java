package application;

import interfaces.WorldMap;
import location.GoogleMaps;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.StoreService;

import java.util.logging.Logger;

@Configuration
public class SpringApplication {

    private static final Logger LOGGER = Logger.getLogger(SpringApplication.class.getName());

    @Bean
    public WorldMap googleMaps() {
        return new GoogleMaps();
    }

    @Bean
    public StoreService storeService(WorldMap googleMaps) {
        StoreService storeService = new StoreService();
        storeService.setWorldMap(googleMaps);
        return storeService;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringApplication.class);

        StoreService ss = (StoreService) context.getBean("storeService");
        LOGGER.info(ss.getStoreLocation("Coles Neutral Bay"));
    }
}
