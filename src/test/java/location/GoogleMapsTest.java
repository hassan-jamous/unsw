package location;

import interfaces.WorldMap;

public class GoogleMapsTest extends WorldMapTestBase {
    protected WorldMap createWorldMapInstance() {
        return new GoogleMaps();
    }
}