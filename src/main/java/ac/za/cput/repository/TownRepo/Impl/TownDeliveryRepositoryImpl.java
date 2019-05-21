package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.Town.TownDelivery;
import ac.za.cput.repository.TownRepo.TownBakerRepository;
import ac.za.cput.repository.TownRepo.TownDeliveryRepository;

import java.util.HashSet;
import java.util.Set;

public class TownDeliveryRepositoryImpl implements TownDeliveryRepository {
    private static TownDeliveryRepositoryImpl repository = null;
    private Set<TownDelivery> tnDelivery;

    private TownDeliveryRepositoryImpl(){
        this.tnDelivery = new HashSet<>();
    }

    public static TownDeliveryRepositoryImpl getRepository(){
        if (repository == null) repository = new TownDeliveryRepositoryImpl();
        return repository;
    }


    public TownDelivery create(TownDelivery delivery){
        this.tnDelivery.add(delivery);
        return delivery;
    }

    public TownDelivery read(String deliveryId){
        // find the course that matches the id and return it if exist
        return this.repository.read(deliveryId);
    }

    public void delete(String deliveryId) {
        // find the course, delete it if it exist
         this.repository.delete(deliveryId);
    }

    public TownDelivery update(TownDelivery delivery){
        // find the course, update it and delete it if it exists
        return this.repository.update(delivery);
    }


    public Set<TownDelivery> getAll(){
        return this.tnDelivery;
    }
}
