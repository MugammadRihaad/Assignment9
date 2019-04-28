package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleDelivery;
import ac.za.cput.repository.BellvilleRepo.BellvilleDeliveryRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleDeliveryRepositoryImpl implements BellvilleDeliveryRepository {
    private static BellvilleDeliveryRepositoryImpl repository = null;
    private Set<BellvilleDelivery> bellDelivery;

    private BellvilleDeliveryRepositoryImpl(){
        this.bellDelivery = new HashSet<>();
    }

    public static BellvilleDeliveryRepositoryImpl getRepository(){
        if (repository == null) repository = new BellvilleDeliveryRepositoryImpl();
        return repository;
    }


    public BellvilleDelivery create(BellvilleDelivery delivery){
        this.bellDelivery.add(delivery);
        return delivery;
    }

    public BellvilleDelivery read(String deliveryId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String deliveryId) {
        // find the course, delete it if it exist
    }

    public BellvilleDelivery update(BellvilleDelivery delivery){
        // find the course, update it and delete it if it exists
        return delivery;
    }


    public Set<BellvilleDelivery> getAll(){
        return this.bellDelivery;
    }
}
