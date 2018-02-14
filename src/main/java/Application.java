import services.StoreService;

public class Application {

    public static void main(String [] args) {
        StoreService ss = new StoreService();
        System.out.println(ss.getStoreLocation("Coles Neutral Bay"));
    }
}
