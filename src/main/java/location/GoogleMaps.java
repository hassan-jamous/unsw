package location;

import domain.Location;
import domain.LocationServiceRoot;
import interfaces.WorldMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Qualifier("googleMaps")
public class GoogleMaps implements WorldMap {
    public static final String API_KEY = "AIzaSyAVIxCBE6AcTNybYG5nAi4Wgrg1_9vxtls";
    public static final String COORDINATE_SERVICE_ENDPOINT = "https://maps.google.com/maps/api/geocode/json";

    @Autowired
    private RestTemplate restTemplate;

    public Location getCoordinatesFromAddress(String address) {
        LocationServiceRoot result = restTemplate.getForObject(
                COORDINATE_SERVICE_ENDPOINT + "?address=" + address + "&key="
                        + API_KEY, LocationServiceRoot.class);
        return getLocation(result);
    }

    private Location getLocation(LocationServiceRoot serviceResponse) {
        return serviceResponse.getResults().get(0).getGeometry().getLocation();
    }
}
