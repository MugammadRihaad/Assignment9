package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.Town.TownBaker;
import ac.za.cput.repository.TownRepo.TownBakerRepository;

import java.util.HashSet;
import java.util.Set;

public class TownBakerRepositoryImpl implements TownBakerRepository {
    private static TownBakerRepositoryImpl repository = null;
    private Set<TownBaker> tnBaker;

    private TownBakerRepositoryImpl(){
        this.tnBaker = new HashSet<>();
    }

    public static TownBakerRepositoryImpl getRepository(){
        if (repository == null) repository = new TownBakerRepositoryImpl
    ();
        return repository;
    }


    public TownBaker create(TownBaker baker){
        this.tnBaker.add(baker);
        return baker;
    }

    public TownBaker read(String bakerId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String bakerId) {
        // find the course, delete it if it exist
    }

    public TownBaker update(TownBaker baker){
        // find the course, update it and delete it if it exists
        return baker;
    }


    public Set<TownBaker> getAll(){
        return this.tnBaker;
    }
}
