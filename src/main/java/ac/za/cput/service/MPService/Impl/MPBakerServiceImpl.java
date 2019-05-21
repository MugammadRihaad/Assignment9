package ac.za.cput.service.MPService.Impl;


import ac.za.cput.domain.MP.MPBaker;
import ac.za.cput.service.MPService.MPBakerService;

import java.util.HashSet;
import java.util.Set;

public class MPBakerServiceImpl implements MPBakerService {
    private static MPBakerServiceImpl service = null;
    private Set<MPBaker> mpBaker;

    private MPBakerServiceImpl(){
        this.mpBaker = new HashSet<>();
    }

    public static MPBakerServiceImpl getRepository(){
        if (service == null) service = new MPBakerServiceImpl();
        return service;
    }
    private MPBaker findBaker(String mpBaker) {
        return this.mpBaker.stream()
                .filter(mpBaker1 -> mpBaker1.getMpBakerId().trim().equals(mpBaker))
                .findAny()
                .orElse(null);
    }


    public MPBaker create(MPBaker baker){
        this.mpBaker.add(baker);
        return baker;
    }

    public MPBaker read(String bakerId){
        // find the course that matches the id and return it if exist
        MPBaker mpBakers = findBaker(bakerId);
        return mpBakers;
    }

    public void delete(String bakerId) {
        // find the course, delete it if it exist
        MPBaker bakers = findBaker(bakerId);
        if (mpBaker != null) this.mpBaker.remove(mpBaker);
    }

    public MPBaker update(MPBaker baker){
        // find the course, update it and delete it if it exists
        MPBaker toDelete = findBaker(baker.getMpBakerId());
        if(toDelete != null) {
            this.mpBaker.remove(toDelete);
            return create(baker);
        }
        return null;
    }


    public Set<MPBaker> getAll(){
        return this.mpBaker;
    }
}

