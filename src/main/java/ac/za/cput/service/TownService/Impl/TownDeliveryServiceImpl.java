package ac.za.cput.service.TownService.Impl;


import ac.za.cput.domain.Town.TownDelivery;
import ac.za.cput.service.TownService.TownDeliveryService;

import java.util.HashSet;
import java.util.Set;

public class TownDeliveryServiceImpl implements TownDeliveryService {
    private static TownDeliveryServiceImpl service = null;
    private Set<TownDelivery> tnDelivery;

    private TownDeliveryServiceImpl(){
        this.tnDelivery = new HashSet<>();
    }

    public static TownDeliveryServiceImpl getRepository(){
        if (service == null) service = new TownDeliveryServiceImpl();
        return service;
    }
    private TownDelivery findTownDelivery(String tnDelivery) {
        return this.tnDelivery.stream()
                .filter(townDelivery -> townDelivery.getTnDeliveId().trim().equals(tnDelivery))
                .findAny()
                .orElse(null);
    }


    public TownDelivery create(TownDelivery delivery){
        this.tnDelivery.add(delivery);
        return delivery;
    }

    public TownDelivery read(String deliveryId){
        // find the course that matches the id and return it if exist
        TownDelivery tnDeliv = findTownDelivery(deliveryId);
        return tnDeliv;
    }

    public void delete(String deliveryId) {
        // find the course, delete it if it exist
        TownDelivery deliveries = findTownDelivery(deliveryId);
        if (tnDelivery != null) this.tnDelivery.remove(tnDelivery);
    }

    public TownDelivery update(TownDelivery delivery){
        // find the course, update it and delete it if it exists
        TownDelivery toDelete = findTownDelivery(delivery.getTnDeliveId());
        if(toDelete != null) {
            this.tnDelivery.remove(toDelete);
            return create(delivery);
        }
        return null;
    }


    public Set<TownDelivery> getAll(){
        return this.tnDelivery;
    }
}
