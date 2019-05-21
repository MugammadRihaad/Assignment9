package ac.za.cput.repository.MPRepo.Impl;

import ac.za.cput.domain.MP.MPBaker;
import ac.za.cput.repository.MPRepo.MPBakerRepository;

import java.util.HashSet;
import java.util.Set;

public class MPBakerRepositoryImpl implements MPBakerRepository {
    private static MPBakerRepositoryImpl repository = null;
    private Set<MPBaker> mpBaker;

    private MPBakerRepositoryImpl(){
        this.mpBaker = new HashSet<>();
    }

    public static MPBakerRepositoryImpl getRepository(){
        if (repository == null) repository = new MPBakerRepositoryImpl();
        return repository;
    }


    public MPBaker create(MPBaker baker){
        this.mpBaker.add(baker);
        return baker;
    }

    public MPBaker read(String bakerId){
        // find the course that matches the id and return it if exist
        return this.repository.read(bakerId);
    }

    public void delete(String bakerId) {
        // find the course, delete it if it exist
         this.repository.delete(bakerId);
    }

    public MPBaker update(MPBaker baker){
        // find the course, update it and delete it if it exists
        return this.repository.update(baker);
    }


    public Set<MPBaker> getAll(){
        return this.mpBaker;
    }
}
