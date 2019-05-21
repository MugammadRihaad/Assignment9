package ac.za.cput.service.MPService.Impl;


import ac.za.cput.domain.MP.MPDelivery;
import ac.za.cput.service.MPService.MPDeliveryService;

import java.util.HashSet;
import java.util.Set;

public class MPDeliveryServiceImpl implements MPDeliveryService {
    private static MPDeliveryServiceImpl service = null;
    private Set<MPDelivery> mpDelivery;

    private MPDeliveryServiceImpl(){
        this.mpDelivery = new HashSet<>();
    }

    public static MPDeliveryServiceImpl getRepository(){
        if (service == null) service = new MPDeliveryServiceImpl();
        return service;
    }
    private MPDelivery findMpDelivery(String mpDeliv) {
        return this.mpDelivery.stream()
                .filter(mpDelivery1 -> mpDelivery1.getMpDeliveId().trim().equals(mpDeliv))
                .findAny()
                .orElse(null);
    }


    public MPDelivery create(MPDelivery delivery){
        this.mpDelivery.add(delivery);
        return delivery;
    }

    public MPDelivery read(String deliveryId){
        // find the course that matches the id and return it if exist
        MPDelivery mpDeliv = findMpDelivery(deliveryId);
        return mpDeliv;
    }

    public void delete(String deliveryId) {
        // find the course, delete it if it exist
        MPDelivery delivery = findMpDelivery(deliveryId);
        if (mpDelivery != null) this.mpDelivery.remove(mpDelivery);
    }

    public MPDelivery update(MPDelivery delivery){
        // find the course, update it and delete it if it exists
        MPDelivery toDelete = findMpDelivery(delivery.getMpDeliveId());
        if(toDelete != null) {
            this.mpDelivery.remove(toDelete);
            return create(delivery);
        }
        return null;
    }


    public Set<MPDelivery> getAll(){
        return this.mpDelivery;
    }
}
