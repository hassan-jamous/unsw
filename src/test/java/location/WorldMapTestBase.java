package location;

import interfaces.WorldMap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class WorldMapTestBase<T extends WorldMap> {
    private T worldMapInstance;

    protected abstract T createWorldMapInstance();

    @Before
    public void setUp() {
        worldMapInstance = createWorldMapInstance();
    }

    @Test
    public void addressProvided_CorrectCoordinatesReturned() throws Exception {
        assertEquals("-33.835303,151.216505", worldMapInstance.getCoordinatesFromAddress("92 ben boyed road, Sydney"));
        assertEquals("-33.867754,151.203187", worldMapInstance.getCoordinatesFromAddress("81 Sussex St, Sydney"));
        assertEquals("-33.826951,151.201790", worldMapInstance.getCoordinatesFromAddress("34-48 Alexander St, Crows Nest"));
    }
}
