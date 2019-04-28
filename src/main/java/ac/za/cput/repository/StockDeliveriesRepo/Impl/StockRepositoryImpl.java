package ac.za.cput.repository.StockDeliveriesRepo.Impl;

import ac.za.cput.domain.StockDeliveries.Stock;
import ac.za.cput.repository.StockDeliveriesRepo.StockRepository;

import java.util.HashSet;
import java.util.Set;

public class StockRepositoryImpl implements StockRepository {
    private static StockRepositoryImpl repository = null;
    private Set<Stock> stocks;

    private StockRepositoryImpl(){
        this.stocks = new HashSet<>();
    }

    public static StockRepositoryImpl getRepository(){
        if (repository == null) repository = new StockRepositoryImpl();
        return repository;
    }


    public Stock create(Stock stocks){
        this.stocks.add(stocks);
        return stocks;
    }

    public Stock read(String stocksId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String stocksId) {
        // find the course, delete it if it exist
    }

    public Stock update(Stock stocksId){
        // find the course, update it and delete it if it exists
        return stocksId;
    }


    public Set<Stock> getAll(){
        return this.stocks;
    }
}
