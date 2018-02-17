package location;

import interfaces.WorldMap;

public class GoogleMaps implements WorldMap {
    public String getCoordinatesFromAddress(String address) {
        return "-33.835303,151.216505";
    }
}
