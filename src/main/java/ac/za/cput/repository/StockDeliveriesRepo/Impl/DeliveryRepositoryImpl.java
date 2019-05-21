package ac.za.cput.repository.StockDeliveriesRepo.Impl;

import ac.za.cput.domain.StockDeliveries.Deliveries;
import ac.za.cput.repository.StockDeliveriesRepo.DeliveryRepository;


import java.util.HashSet;
import java.util.Set;

public class DeliveryRepositoryImpl implements DeliveryRepository {
    private static DeliveryRepositoryImpl repository = null;
    private Set<Deliveries> deliveries;

    private DeliveryRepositoryImpl(){
        this.deliveries = new HashSet<>();
    }

    public static DeliveryRepositoryImpl getRepository(){
        if (repository == null) repository = new DeliveryRepositoryImpl();
        return repository;
    }


    public Deliveries create(Deliveries deliv){
        this.deliveries.add(deliv);
        return deliv;
    }

    public Deliveries read(String delivId){
        // find the course that matches the id and return it if exist
        return this.repository.read(delivId);
    }

    public void delete(String delivId) {
        // find the course, delete it if it exist
         this.repository.delete(delivId);
    }

    public Deliveries update(Deliveries delivId){
        // find the course, update it and delete it if it exists
        return this.repository.update(delivId);
    }


    public Set<Deliveries> getAll(){
        return this.deliveries;
    }
}
