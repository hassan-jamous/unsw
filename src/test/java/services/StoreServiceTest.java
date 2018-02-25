package services;

import domain.Location;
import interfaces.WorldMap;
import location.StoreAddressMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StoreServiceTest {
    private static final String COLES_NEUTRAL_BAY = "Coles Neutral Bay";
    private static final String COLES_NEUTRAL_BAY_ADDRESS = "92 Ben Boyd Rd, Neutral Bay NSW 2089";
    private static final Location EXPECTED_LOCATION = new Location("-33.829548", "151.21848");
    @Mock
    private WorldMap worldMap;
    @Mock
    private StoreAddressMapper storeAddressMapper;
    @InjectMocks
    private StoreService storeServiceUnderTest;

    @Before
    public void prepareMock() {
        when(worldMap.getCoordinatesFromAddress(COLES_NEUTRAL_BAY_ADDRESS)).thenReturn(EXPECTED_LOCATION);
        when(storeAddressMapper.getStoreAddress(COLES_NEUTRAL_BAY)).thenReturn(COLES_NEUTRAL_BAY_ADDRESS);
    }

    @Test
    public void storeNameProvided_CorrectStoreAddressReturned() throws Exception {
        assertEquals(EXPECTED_LOCATION, storeServiceUnderTest.getStoreLocation(COLES_NEUTRAL_BAY));
    }
}