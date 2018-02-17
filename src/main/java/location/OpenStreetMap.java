package location;

import interfaces.WorldMap;

public class OpenStreetMap implements WorldMap {
    public String getCoordinatesFromAddress(String address) {
        return "-33.835303,151.216505";
    }
}
