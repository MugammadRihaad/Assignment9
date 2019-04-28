package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleAccountant;
import ac.za.cput.domain.Bellville.bellvilleBaker;
import ac.za.cput.repository.BellvilleRepo.BellvilleBakerRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleBakerRepositoryImpl implements BellvilleBakerRepository {
    private static BellvilleBakerRepositoryImpl repository = null;
    private Set<bellvilleBaker> bellBaker;

    private BellvilleBakerRepositoryImpl(){
        this.bellBaker = new HashSet<>();
    }

    public static BellvilleBakerRepositoryImpl getRepository(){
        if (repository == null) repository = new BellvilleBakerRepositoryImpl();
        return repository;
    }


    public bellvilleBaker create(bellvilleBaker baker){
        this.bellBaker.add(baker);
        return baker;
    }

    public bellvilleBaker read(String bakerId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String bakerId) {
        // find the course, delete it if it exist
    }

    public bellvilleBaker update(bellvilleBaker baker){
        // find the course, update it and delete it if it exists
        return baker;
    }


    public Set<bellvilleBaker> getAll(){
        return this.bellBaker;
    }
}
