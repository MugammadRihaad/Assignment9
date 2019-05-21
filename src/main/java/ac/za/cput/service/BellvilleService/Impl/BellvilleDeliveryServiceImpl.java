package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.BellvilleDelivery;
import ac.za.cput.service.BellvilleService.BellvilleDeliveryService;

import java.util.HashSet;
import java.util.Set;

public class BellvilleDeliveryServiceImpl implements BellvilleDeliveryService {
    private static BellvilleDeliveryServiceImpl service = null;
    private Set<BellvilleDelivery> bellDelivery;

    private BellvilleDeliveryServiceImpl(){
        this.bellDelivery = new HashSet<>();
    }

    public static BellvilleDeliveryServiceImpl getRepository(){
        if (service == null) service = new BellvilleDeliveryServiceImpl();
        return service;
    }
    private BellvilleDelivery findDelivery(String delivery) {
        return this.bellDelivery.stream()
                .filter(bellvilleDelivery -> bellvilleDelivery.getBellDeliveId().trim().equals(delivery))
                .findAny()
                .orElse(null);
    }


    public BellvilleDelivery create(BellvilleDelivery delivery){
        this.bellDelivery.add(delivery);
        return delivery;
    }

    public BellvilleDelivery read(String deliveryId){
        // find the course that matches the id and return it if exist
        BellvilleDelivery bellDelivery = findDelivery(deliveryId);
        return bellDelivery;
    }

    public void delete(String deliveryId) {
        // find the course, delete it if it exist
        BellvilleDelivery accountings = findDelivery(deliveryId);
        if (bellDelivery != null) this.bellDelivery.remove(bellDelivery);
    }

    public BellvilleDelivery update(BellvilleDelivery delivery){
        // find the course, update it and delete it if it exists
        BellvilleDelivery toDelete = findDelivery(delivery.getBellDeliveId());
        if(toDelete != null) {
            this.bellDelivery.remove(toDelete);
            return create(delivery);
        }
        return null;
    }


    public Set<BellvilleDelivery> getAll(){
        return this.bellDelivery;
    }
}
