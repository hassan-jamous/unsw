package location;

import domain.Location;
import interfaces.WorldMap;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("openStreetMap")
public class OpenStreetMap implements WorldMap {
    public Location getCoordinatesFromAddress(String address) {
        return new Location();
    }
}
