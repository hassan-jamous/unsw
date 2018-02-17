package services;

import interfaces.WorldMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StoreService {
    @Autowired
    @Qualifier("googleMaps")
    private WorldMap worldMap;

    public String getStoreLocation(String storeName) {
        return "store location is: " + worldMap.getCoordinatesFromAddress(storeName);
    }
}

