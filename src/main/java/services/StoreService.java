package services;

import domain.Location;
import interfaces.WorldMap;
import location.StoreAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class StoreService {
    @Autowired
    @Qualifier("googleMaps")
    private WorldMap worldMap;

    @Autowired
    private StoreAddressMapper storeAddressMapper;

    public Location getStoreLocation(String storeName) {
        return worldMap.getCoordinatesFromAddress(storeAddressMapper.getStoreAddress(storeName));
    }
}

