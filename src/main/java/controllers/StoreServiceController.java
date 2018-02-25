package controllers;

import domain.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.StoreService;

@RestController
public class StoreServiceController {
    @Autowired
    private StoreService storeService;

    @RequestMapping("/location/{storeName}")
    public Location greeting(@PathVariable("storeName") String storeName) {
        return storeService.getStoreLocation(storeName);
    }
}
