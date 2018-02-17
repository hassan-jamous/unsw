package services;

import interfaces.WorldMap;

public class StoreService {
    private WorldMap worldMap;

    public String getStoreLocation(String storeName) {
        return "store location is: " + worldMap.getCoordinatesFromAddress(storeName);
    }

    public void setWorldMap(WorldMap worldMap) {
        this.worldMap = worldMap;
    }
}

