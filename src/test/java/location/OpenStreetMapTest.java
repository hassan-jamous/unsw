package location;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpenStreetMapTest {

    private OpenStreetMap openStreetMapUnderTest = new OpenStreetMap();

    @Test
    public void addressProvided_CorrectCoordinatesReturned() throws Exception {
        assertEquals("-33.835303,151.216505", openStreetMapUnderTest.getCoordinatesFromAddress("92 ben boyed road, Sydney"));
        assertEquals("-33.867754,151.203187", openStreetMapUnderTest.getCoordinatesFromAddress("81 Sussex St, Sydney"));
        assertEquals("-33.826951,151.201790", openStreetMapUnderTest.getCoordinatesFromAddress("34-48 Alexander St, Crows Nest"));
    }

}