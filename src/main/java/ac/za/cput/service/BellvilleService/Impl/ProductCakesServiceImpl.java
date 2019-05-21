package ac.za.cput.service.BellvilleService.Impl;


import ac.za.cput.domain.Bellville.ProductCakes;
import ac.za.cput.service.BellvilleService.ProductCakesService;

import java.util.HashSet;
import java.util.Set;

public class ProductCakesServiceImpl implements ProductCakesService {
    private static ProductCakesServiceImpl service = null;
    private Set<ProductCakes> prodCakes;

    private ProductCakesServiceImpl(){
        this.prodCakes = new HashSet<>();
    }

    public static ProductCakesServiceImpl getRepository(){
        if (service == null) service = new ProductCakesServiceImpl();
        return service;
    }
    private ProductCakes findCakes(String cakes) {
        return this.prodCakes.stream()
                .filter(productCakes -> productCakes.getProductCakeId().trim().equals(cakes))
                .findAny()
                .orElse(null);
    }


    public ProductCakes create(ProductCakes cakes){
        this.prodCakes.add(cakes);
        return cakes;
    }

    public ProductCakes read(String cakesId){
        // find the course that matches the id and return it if exist
        ProductCakes prodCake = findCakes(cakesId);
        return prodCake;
    }

    public void delete(String cakesId) {
        // find the course, delete it if it exist
        ProductCakes accountings = findCakes(cakesId);
        if (prodCakes != null) this.prodCakes.remove(prodCakes);
    }

    public ProductCakes update(ProductCakes cakes){
        // find the course, update it and delete it if it exists
        ProductCakes toDelete = findCakes(cakes.getProductCakeId());
        if(toDelete != null) {
            this.prodCakes.remove(toDelete);
            return create(cakes);
        }
        return null;
    }


    public Set<ProductCakes> getAll(){
        return this.prodCakes;
    }
}
