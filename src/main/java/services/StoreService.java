package services;

import location.GoogleMaps;

public class StoreService {

    public String getStoreLocation(String storeName) {
        GoogleMaps googleMaps = new GoogleMaps();
        return "store location is: " + googleMaps.getCoordinatesFromAddress(storeName);
    }
}
