package ac.za.cput.service.StockDeliveriesService.Impl;

import ac.za.cput.domain.Bellville.ProductCakes;
import ac.za.cput.domain.StockDeliveries.Stock;
import ac.za.cput.service.StockDeliveriesService.StockService;

import java.util.HashSet;
import java.util.Set;

public class StockServiceImpl implements StockService {
    private static StockServiceImpl service = null;
    private Set<Stock> stocks;

    private StockServiceImpl(){
        this.stocks = new HashSet<>();
    }

    public static StockServiceImpl getRepository(){
        if (service == null) service = new StockServiceImpl();
        return service;
    }
    private Stock findStock(String stock) {
        return this.stocks.stream()
                .filter(stock1 -> stock1.getStockId().trim().equals(stock))
                .findAny()
                .orElse(null);
    }


    public Stock create(Stock stocks){
        this.stocks.add(stocks);
        return stocks;
    }

    public Stock read(String stocksId){
        // find the course that matches the id and return it if exist
        Stock stock = findStock(stocksId);
        return stock;
    }

    public void delete(String stocksId) {
        // find the course, delete it if it exist
        Stock stocks = findStock(stocksId);
        if (stocks != null) this.stocks.remove(stocks);
    }

    public Stock update(Stock stocksId){
        // find the course, update it and delete it if it exists
        Stock toDelete = findStock(stocksId.getStockId());
        if(toDelete != null) {
            this.stocks.remove(toDelete);
            return create(stocksId);
        }
        return null;
    }


    public Set<Stock> getAll(){
        return this.stocks;
    }
}
