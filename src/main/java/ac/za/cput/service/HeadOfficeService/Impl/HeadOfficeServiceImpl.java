package ac.za.cput.service.HeadOfficeService.Impl;


import ac.za.cput.domain.HeadOffice;
import ac.za.cput.service.HeadOfficeService.HeadOfficeService;

import java.util.HashSet;
import java.util.Set;

public class HeadOfficeServiceImpl implements HeadOfficeService {
    private static HeadOfficeServiceImpl service = null;
    private Set<HeadOffice> offices;

    private HeadOfficeServiceImpl(){
        this.offices = new HashSet<>();
    }

    public static HeadOfficeServiceImpl getRepository(){
        if (service == null) service = new HeadOfficeServiceImpl();
        return service;
    }
    private HeadOffice findOffice(String office) {
        return this.offices.stream()
                .filter(headOffice -> headOffice.getOfficeId().trim().equals(office))
                .findAny()
                .orElse(null);
    }


    public HeadOffice create(HeadOffice office){
        this.offices.add(office);
        return office;
    }

    public HeadOffice read(String officeId){
        // find the course that matches the id and return it if exist
        HeadOffice headOffice = findOffice(officeId);
        return headOffice;
    }

    public void delete(String officeId) {
        // find the course, delete it if it exist
        HeadOffice offices = findOffice(officeId);
        if ( offices!= null) this.offices.remove(offices);
    }

    public HeadOffice update(HeadOffice office){
        // find the course, update it and delete it if it exists
        HeadOffice toDelete = findOffice(office.getOfficeId());
        if(toDelete != null) {
            this.offices.remove(toDelete);
            return create(office);
        }
        return null;
    }


    public Set<HeadOffice> getAll(){
        return this.offices;
    }
}
