package location;

import interfaces.WorldMap;

public class OpenStreetMapTest extends WorldMapTestBase {
    protected WorldMap createWorldMapInstance() {
        return new OpenStreetMap();
    }
}