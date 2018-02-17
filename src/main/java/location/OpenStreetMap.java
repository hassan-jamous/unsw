package location;

import interfaces.WorldMap;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("openStreetMap")
public class OpenStreetMap implements WorldMap {
    public String getCoordinatesFromAddress(String address) {
        return "-33.835303,151.216505";
    }
}
