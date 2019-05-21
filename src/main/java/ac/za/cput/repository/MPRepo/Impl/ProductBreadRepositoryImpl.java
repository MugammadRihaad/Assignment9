package ac.za.cput.repository.MPRepo.Impl;

import ac.za.cput.domain.MP.ProductBread;
import ac.za.cput.repository.BellvilleRepo.ProductCakesRepository;
import ac.za.cput.repository.MPRepo.ProductBreadRepository;

import java.util.HashSet;
import java.util.Set;

public class ProductBreadRepositoryImpl implements ProductBreadRepository {
    private static ProductBreadRepositoryImpl repository = null;
    private Set<ProductBread> prodBread;

    private ProductBreadRepositoryImpl(){
        this.prodBread = new HashSet<>();
    }

    public static ProductBreadRepositoryImpl getRepository(){
        if (repository == null) repository = new ProductBreadRepositoryImpl();
        return repository;
    }


    public ProductBread create(ProductBread bread){
        this.prodBread.add(bread);
        return bread;
    }

    public ProductBread read(String breadId){
        // find the course that matches the id and return it if exist
        return this.repository.read(breadId);
    }

    public void delete(String breadId) {
        // find the course, delete it if it exist
         this.repository.delete(breadId);
    }

    public ProductBread update(ProductBread bread){
        // find the course, update it and delete it if it exists
        return this.repository.update(bread);
    }


    public Set<ProductBread> getAll(){
        return this.prodBread;
    }
}
