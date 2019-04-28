package ac.za.cput.repository.StockDeliveriesRepo.Impl;

import ac.za.cput.domain.StockDeliveries.Deliveries;
import ac.za.cput.domain.StockDeliveries.StockDeliveries;
import ac.za.cput.repository.StockDeliveriesRepo.StockDeliveriesRepository;

import java.util.HashSet;
import java.util.Set;

public class StockDeliveriesRepositoryImpl implements StockDeliveriesRepository {
    private static StockDeliveriesRepositoryImpl repository = null;
    private Set<StockDeliveries> stockDeliveries;

    private StockDeliveriesRepositoryImpl(){
        this.stockDeliveries = new HashSet<>();
    }

    public static StockDeliveriesRepositoryImpl getRepository(){
        if (repository == null) repository = new StockDeliveriesRepositoryImpl();
        return repository;
    }


    public StockDeliveries create(StockDeliveries stockdel){
        this.stockDeliveries.add(stockdel);
        return stockdel;
    }

    public StockDeliveries read(String stockdelId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String stockdelId) {
        // find the course, delete it if it exist
    }

    public StockDeliveries update(StockDeliveries stockdel){
        // find the course, update it and delete it if it exists
        return stockdel;
    }


    public Set<StockDeliveries> getAll(){
        return this.stockDeliveries;
    }
}
