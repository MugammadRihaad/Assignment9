package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.bellvilleBaker;
import ac.za.cput.service.BellvilleService.BellvilleBakerService;

import java.util.HashSet;
import java.util.Set;

public class BellvilleBakerServiceImpl implements BellvilleBakerService {
    private static BellvilleBakerServiceImpl service = null;
    private Set<bellvilleBaker> bellBaker;

    private BellvilleBakerServiceImpl(){
        this.bellBaker = new HashSet<>();
    }
    private bellvilleBaker findBaker(String baker) {
        return this.bellBaker.stream()
                .filter(bellvilleBaker -> bellvilleBaker.getBellBakerId().trim().equals(baker))
                .findAny()
                .orElse(null);
    }

    public static BellvilleBakerServiceImpl getRepository(){
        if (service == null) service = new BellvilleBakerServiceImpl();
        return service;
    }
    public BellvilleBakerService getService(){
        if (service == null) service = new BellvilleBakerServiceImpl();
        return service;
    }



    public bellvilleBaker create(bellvilleBaker baker){
        this.bellBaker.add(baker);
        return baker;
    }

    public bellvilleBaker read(String bakerId){
        // find the course that matches the id and return it if exist
        bellvilleBaker bellBaker = findBaker(bakerId);
        return bellBaker;
    }

    public void delete(String bakerId) {
        // find the course, delete it if it exist
        bellvilleBaker accountings = findBaker(bakerId);
        if (bellBaker != null) this.bellBaker.remove(bellBaker);
    }

    public bellvilleBaker update(bellvilleBaker baker){
        // find the course, update it and delete it if it exists
        bellvilleBaker toDelete = findBaker(baker.getBellBakerId());
        if(toDelete != null) {
            this.bellBaker.remove(toDelete);
            return create(baker);
        }
        return null;
    }


    public Set<bellvilleBaker> getAll(){
        return this.bellBaker;
    }
}
