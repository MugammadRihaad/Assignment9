package ac.za.cput.service.MPService.Impl;


import ac.za.cput.domain.MP.ProductBread;
import ac.za.cput.service.MPService.ProductBreadService;

import java.util.HashSet;
import java.util.Set;

public class ProductBreadServiceImpl implements ProductBreadService {
    private static ProductBreadServiceImpl service = null;
    private Set<ProductBread> prodBread;

    private ProductBreadServiceImpl(){
        this.prodBread = new HashSet<>();
    }

    public static ProductBreadServiceImpl getRepository(){
        if (service == null) service = new ProductBreadServiceImpl();
        return service;
    }
    private ProductBread findProductBread(String prodBread) {
        return this.prodBread.stream()
                .filter(productBread -> productBread.getProductBreadId().trim().equals(prodBread))
                .findAny()
                .orElse(null);
    }


    public ProductBread create(ProductBread bread){
        this.prodBread.add(bread);
        return bread;
    }

    public ProductBread read(String breadId){
        // find the course that matches the id and return it if exist
        ProductBread prodBread = findProductBread(breadId);
        return prodBread;
    }

    public void delete(String breadId) {
        // find the course, delete it if it exist
        ProductBread breads = findProductBread(breadId);
        if (prodBread != null) this.prodBread.remove(prodBread);
    }

    public ProductBread update(ProductBread bread){
        // find the course, update it and delete it if it exists
        ProductBread toDelete = findProductBread(bread.getProductBreadId());
        if(toDelete != null) {
            this.prodBread.remove(toDelete);
            return create(bread);
        }
        return null;
    }


    public Set<ProductBread> getAll(){
        return this.prodBread;
    }
}
