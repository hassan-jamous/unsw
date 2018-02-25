package interfaces;

import domain.Location;

public interface WorldMap {
    Location getCoordinatesFromAddress(String address);
}
