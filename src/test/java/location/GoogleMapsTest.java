package location;

import domain.Geometry;
import domain.Location;
import domain.LocationServiceRoot;
import domain.Result;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GoogleMapsTest {
    public static final String EXPECTED_LAT = "-33.829548";
    public static final String EXPECTED_LNG = "151.21848";
    public static final String EXPECTED_RESULT = "-33.829548,151.21848";
    @Mock
    private RestTemplate restTemplate;
    @InjectMocks
    private GoogleMaps googleMapsUnderTest;

    @Before
    public void prepareMock() {
        LocationServiceRoot locationServiceRoot = buildLocationServiceResponse();
        when(restTemplate.getForObject(anyString(), any())).thenReturn(locationServiceRoot);
    }

    @Test
    public void addressProvided_CorrectCoordinatesReturned() throws Exception {
        assertEquals(EXPECTED_RESULT, googleMapsUnderTest.getCoordinatesFromAddress("92 ben boyed road, Sydney"));
    }

    private LocationServiceRoot buildLocationServiceResponse() {
        Location location = new Location();
        location.setLat(EXPECTED_LAT);
        location.setLng(EXPECTED_LNG);

        Geometry geometry = new Geometry();
        geometry.setLocation(location);

        Result result = new Result();
        result.setGeometry(geometry);

        List<Result> results = new ArrayList<>();
        results.add(result);

        LocationServiceRoot locationServiceRoot = new LocationServiceRoot();
        locationServiceRoot.setResults(results);
        return locationServiceRoot;
    }
}