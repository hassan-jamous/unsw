package services;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreServiceTest {

    StoreService storeServiceUnderTest = new StoreService();

    @Test
    public void storeNameProvided_CorrectStoreAddressReturned() throws Exception {
        assertEquals("store location is: -33.829548,151.218482", storeServiceUnderTest.getStoreLocation("Coles Neutral Bay"));
        assertEquals("store location is: -33.830521,151.222502", storeServiceUnderTest.getStoreLocation("Woolworths Neutral Bay"));
        assertEquals("store location is: -33.830173,151.219215", storeServiceUnderTest.getStoreLocation("The Oaks Neutral Bay"));
    }
}