package ac.za.cput.service.TownService.Impl;


import ac.za.cput.domain.Town.TownBaker;
import ac.za.cput.service.TownService.TownBakerService;

import java.util.HashSet;
import java.util.Set;

public class TownBakerServiceImpl implements TownBakerService {
    private static TownBakerServiceImpl service = null;
    private Set<TownBaker> tnBaker;

    private TownBakerServiceImpl(){
        this.tnBaker = new HashSet<>();
    }

    public static TownBakerServiceImpl getRepository(){
        if (service == null) service = new TownBakerServiceImpl
                ();
        return service;
    }
    private TownBaker findTownBaker(String tnBaker) {
        return this.tnBaker.stream()
                .filter(townBaker -> townBaker.getTnBakerId().trim().equals(tnBaker))
                .findAny()
                .orElse(null);
    }


    public TownBaker create(TownBaker baker){
        this.tnBaker.add(baker);
        return baker;
    }

    public TownBaker read(String bakerId){
        // find the course that matches the id and return it if exist
        TownBaker tnBaker = findTownBaker(bakerId);
        return tnBaker;
    }

    public void delete(String bakerId) {
        // find the course, delete it if it exist
        TownBaker bakers = findTownBaker(bakerId);
        if (tnBaker != null) this.tnBaker.remove(tnBaker);
    }

    public TownBaker update(TownBaker baker){
        // find the course, update it and delete it if it exists
        TownBaker toDelete = findTownBaker(baker.getTnBakerId());
        if(toDelete != null) {
            this.tnBaker.remove(toDelete);
            return create(baker);
        }
        return null;
    }


    public Set<TownBaker> getAll(){
        return this.tnBaker;
    }
}
