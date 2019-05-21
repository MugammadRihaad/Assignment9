package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.Town.ProductBiscuits;
import ac.za.cput.repository.TownRepo.ProductBiscuitsRepository;

import java.util.HashSet;
import java.util.Set;

public class ProductBiscuitsRepositoryImpl implements ProductBiscuitsRepository {
    private static ProductBiscuitsRepositoryImpl repository = null;
    private Set<ProductBiscuits> prodBiscuits;

    private ProductBiscuitsRepositoryImpl(){
        this.prodBiscuits = new HashSet<>();
    }

    public static ProductBiscuitsRepositoryImpl getRepository(){
        if (repository == null) repository = new ProductBiscuitsRepositoryImpl();
        return repository;
    }


    public ProductBiscuits create(ProductBiscuits biscuits){
        this.prodBiscuits.add(biscuits);
        return biscuits;
    }

    public ProductBiscuits read(String biscuitsId){
        // find the course that matches the id and return it if exist
        return this.repository.read(biscuitsId);
    }

    public void delete(String biscuitsId) {
        // find the course, delete it if it exist
         this.repository.delete(biscuitsId);
    }

    public ProductBiscuits update(ProductBiscuits biscuits){
        // find the course, update it and delete it if it exists
        return this.repository.update(biscuits);
    }


    public Set<ProductBiscuits> getAll(){
        return this.prodBiscuits;
    }
}
