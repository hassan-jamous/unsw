package location;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StoreAddressMapper {
    private Map<String, String> storeAddressMapper = new HashMap<>();

    public StoreAddressMapper() {
        storeAddressMapper.put("Coles Neutral Bay", "92 Ben Boyd Rd, Neutral Bay NSW 2089");
        storeAddressMapper.put("OliverBrown Crows nest", "34-48 Alexander St, Crows Nest NSW 2065");
        storeAddressMapper.put("Starbucks City", "525 George St, Sydney NSW 2000");
    }

    public String getStoreAddress(String storeName) {
        return storeAddressMapper.get(storeName);
    }
}
