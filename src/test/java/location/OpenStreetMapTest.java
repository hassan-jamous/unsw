package location;

import domain.Location;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OpenStreetMapTest {

    private OpenStreetMap openStreetMapUnderTest = new OpenStreetMap();

    @Test
    public void addressProvided_CorrectCoordinatesReturned() throws Exception {
        assertEquals(new Location(), openStreetMapUnderTest.getCoordinatesFromAddress("92 ben boyed road, Sydney"));
        assertEquals(new Location(), openStreetMapUnderTest.getCoordinatesFromAddress("81 Sussex St, Sydney"));
        assertEquals(new Location(), openStreetMapUnderTest.getCoordinatesFromAddress("34-48 Alexander St, Crows Nest"));
    }
}