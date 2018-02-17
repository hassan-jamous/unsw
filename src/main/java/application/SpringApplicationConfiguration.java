package application;

import interfaces.WorldMap;
import location.GoogleMaps;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.StoreService;

@Configuration
public class SpringApplicationConfiguration {

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
}
