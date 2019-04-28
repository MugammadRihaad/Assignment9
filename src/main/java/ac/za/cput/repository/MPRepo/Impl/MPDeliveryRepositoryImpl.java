package ac.za.cput.repository.MPRepo.Impl;

import ac.za.cput.domain.MP.MPDelivery;
import ac.za.cput.repository.MPRepo.MPDeliveryRepository;

import java.util.HashSet;
import java.util.Set;

public class MPDeliveryRepositoryImpl implements MPDeliveryRepository {
    private static MPDeliveryRepositoryImpl repository = null;
    private Set<MPDelivery> mpDelivery;

    private MPDeliveryRepositoryImpl(){
        this.mpDelivery = new HashSet<>();
    }

    public static MPDeliveryRepositoryImpl getRepository(){
        if (repository == null) repository = new MPDeliveryRepositoryImpl();
        return repository;
    }


    public MPDelivery create(MPDelivery delivery){
        this.mpDelivery.add(delivery);
        return delivery;
    }

    public MPDelivery read(String deliveryId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String deliveryId) {
        // find the course, delete it if it exist
    }

    public MPDelivery update(MPDelivery delivery){
        // find the course, update it and delete it if it exists
        return delivery;
    }


    public Set<MPDelivery> getAll(){
        return this.mpDelivery;
    }
}
