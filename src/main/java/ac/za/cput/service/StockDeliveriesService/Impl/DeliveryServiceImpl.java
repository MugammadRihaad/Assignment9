package ac.za.cput.service.StockDeliveriesService.Impl;

import ac.za.cput.domain.StockDeliveries.Deliveries;
import ac.za.cput.service.StockDeliveriesService.DeliveryService;

import java.util.HashSet;
import java.util.Set;

public class DeliveryServiceImpl implements DeliveryService {
    private static DeliveryServiceImpl service = null;
    private Set<Deliveries> deliveries;

    private DeliveryServiceImpl(){
        this.deliveries = new HashSet<>();
    }

    public static DeliveryServiceImpl getRepository(){
        if (service == null) service = new DeliveryServiceImpl();
        return service;
    }
    private Deliveries findDeliveries(String delivery) {
        return this.deliveries.stream()
                .filter(deliveries1 -> deliveries1.getDelivId().trim().equals(delivery))
                .findAny()
                .orElse(null);
    }


    public Deliveries create(Deliveries deliv){
        this.deliveries.add(deliv);
        return deliv;
    }

    public Deliveries read(String delivId){
        // find the course that matches the id and return it if exist
        Deliveries delivery = findDeliveries(delivId);
        return delivery;
    }

    public void delete(String delivId) {
        // find the course, delete it if it exist
        Deliveries deliveries = findDeliveries(delivId);
        if (deliveries != null) this.deliveries.remove(deliveries);
    }

    public Deliveries update(Deliveries delivId){
        // find the course, update it and delete it if it exists
        Deliveries toDelete = findDeliveries(delivId.getDelivId());
        if(toDelete != null) {
            this.deliveries.remove(toDelete);
            return create(delivId);
        }
        return null;
    }


    public Set<Deliveries> getAll(){
        return this.deliveries;
    }
}
