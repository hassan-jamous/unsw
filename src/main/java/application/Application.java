package application;

import services.StoreService;

import java.util.logging.Logger;

public final class Application {
    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    private Application() {
    }

    public static void main(String[] args) {
        StoreService ss = new StoreService();
        LOGGER.info(ss.getStoreLocation("Coles Neutral Bay"));
    }
}
