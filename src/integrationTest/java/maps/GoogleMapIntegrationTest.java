package maps;

import application.BootApplication;
import domain.Location;
import interfaces.WorldMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = BootApplication.class)
public class GoogleMapIntegrationTest {
    @Autowired
    @Qualifier("googleMaps")
    private WorldMap googleMap;

    @Test
    public void addressProvided_GoogleMapServiceIsCalled_CorrectCoordinatesReturned() throws Exception {
        Location location = googleMap.getCoordinatesFromAddress("92 Ben Boyd Rd, Neutral Bay NSW 2089");
        assertEquals("-33.8353026", location.getLat());
        assertEquals("151.2165052", location.getLng());
    }
}