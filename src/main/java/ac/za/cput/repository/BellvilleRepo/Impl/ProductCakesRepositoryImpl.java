package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.ProductCakes;
import ac.za.cput.repository.BellvilleRepo.ProductCakesRepository;

import java.util.HashSet;
import java.util.Set;

public class ProductCakesRepositoryImpl implements ProductCakesRepository {
    private static ProductCakesRepositoryImpl repository = null;
    private Set<ProductCakes> prodCakes;

    private ProductCakesRepositoryImpl(){
        this.prodCakes = new HashSet<>();
    }

    public static ProductCakesRepositoryImpl getRepository(){
        if (repository == null) repository = new ProductCakesRepositoryImpl();
        return repository;
    }


    public ProductCakes create(ProductCakes cakes){
        this.prodCakes.add(cakes);
        return cakes;
    }

    public ProductCakes read(String cakesId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String cakesId) {
        // find the course, delete it if it exist
    }

    public ProductCakes update(ProductCakes cakes){
        // find the course, update it and delete it if it exists
        return cakes;
    }


    public Set<ProductCakes> getAll(){
        return this.prodCakes;
    }
}
