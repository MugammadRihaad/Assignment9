package ac.za.cput.service.TownService.Impl;


import ac.za.cput.domain.Town.ProductBiscuits;
import ac.za.cput.service.TownService.ProductBiscuitsService;

import java.util.HashSet;
import java.util.Set;

public class ProductBiscuitsServiceImpl implements ProductBiscuitsService {
    private static ProductBiscuitsServiceImpl service = null;
    private Set<ProductBiscuits> prodBiscuits;

    private ProductBiscuitsServiceImpl(){
        this.prodBiscuits = new HashSet<>();
    }

    public static ProductBiscuitsServiceImpl getRepository(){
        if (service == null) service = new ProductBiscuitsServiceImpl();
        return service;
    }
    private ProductBiscuits findProductBiscuits(String prodBiscuit) {
        return this.prodBiscuits.stream()
                .filter(productBiscuits -> productBiscuits.getProductBiscuitsId().trim().equals(prodBiscuit))
                .findAny()
                .orElse(null);
    }


    public ProductBiscuits create(ProductBiscuits biscuits){
        this.prodBiscuits.add(biscuits);
        return biscuits;
    }

    public ProductBiscuits read(String biscuitsId){
        // find the course that matches the id and return it if exist
        ProductBiscuits prodbiscuits = findProductBiscuits(biscuitsId);
        return prodbiscuits;
    }

    public void delete(String biscuitsId) {
        // find the course, delete it if it exist
        ProductBiscuits biscuits = findProductBiscuits(biscuitsId);
        if (biscuits != null) this.prodBiscuits.remove(biscuits);
    }

    public ProductBiscuits update(ProductBiscuits biscuits){
        // find the course, update it and delete it if it exists
        ProductBiscuits toDelete = findProductBiscuits(biscuits.getProductBiscuitsId());
        if(toDelete != null) {
            this.prodBiscuits.remove(toDelete);
            return create(biscuits);
        }
        return null;
    }


    public Set<ProductBiscuits> getAll(){
        return this.prodBiscuits;
    }
}
