package services;

import interfaces.WorldMap;
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
    @Mock
    private WorldMap worldMap;
    @InjectMocks
    private StoreService storeServiceUnderTest;

    @Before
    public void prepareMock() {
        when(worldMap.getCoordinatesFromAddress(COLES_NEUTRAL_BAY)).thenReturn("-33.829548,151.21848");
    }

    @Test
    public void storeNameProvided_CorrectStoreAddressReturned() throws Exception {
        assertEquals("store location is: -33.829548,151.21848", storeServiceUnderTest.getStoreLocation(COLES_NEUTRAL_BAY));
    }
}