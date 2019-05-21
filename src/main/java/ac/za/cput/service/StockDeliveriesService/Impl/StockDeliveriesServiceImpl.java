package ac.za.cput.service.StockDeliveriesService.Impl;

import ac.za.cput.domain.StockDeliveries.StockDeliveries;
import ac.za.cput.service.StockDeliveriesService.StockDeliveriesService;

import java.util.HashSet;
import java.util.Set;

public class StockDeliveriesServiceImpl implements StockDeliveriesService {
    private static StockDeliveriesServiceImpl service = null;
    private Set<StockDeliveries> stockDeliveries;

    private StockDeliveriesServiceImpl(){
        this.stockDeliveries = new HashSet<>();
    }

    public static StockDeliveriesServiceImpl getRepository(){
        if (service == null) service = new StockDeliveriesServiceImpl();
        return service;
    }
    private StockDeliveries findStockDeliveries(String stockDel) {
        return this.stockDeliveries.stream()
                .filter(stockDeliveries -> stockDeliveries.getDelId().trim().equals(stockDel))
                .findAny()
                .orElse(null);
    }


    public StockDeliveries create(StockDeliveries stockdel){
        this.stockDeliveries.add(stockdel);
        return stockdel;
    }

    public StockDeliveries read(String stockdelId){
        // find the course that matches the id and return it if exist
        StockDeliveries stockDeliv = findStockDeliveries(stockdelId);
        return stockDeliv;
    }

    public void delete(String stockdelId) {
        // find the course, delete it if it exist
        StockDeliveries deliveries = findStockDeliveries(stockdelId);
        if (stockDeliveries != null) this.stockDeliveries.remove(stockDeliveries);
    }

    public StockDeliveries update(StockDeliveries stockdel){
        // find the course, update it and delete it if it exists
        StockDeliveries toDelete = findStockDeliveries(stockdel.getDelId());
        if(toDelete != null) {
            this.stockDeliveries.remove(toDelete);
            return create(stockdel);
        }
        return null;
    }


    public Set<StockDeliveries> getAll(){
        return this.stockDeliveries;
    }
}
