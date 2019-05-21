package ac.za.cput.service.TownService.Impl;


import ac.za.cput.domain.Town.TownStaff;
import ac.za.cput.service.TownService.TownStaffService;

import java.util.HashSet;
import java.util.Set;

public class TownStaffServiceImpl implements TownStaffService {
    private static TownStaffServiceImpl service = null;
    private Set<TownStaff> tnStaff;

    private TownStaffServiceImpl(){
        this.tnStaff = new HashSet<>();
    }

    public static TownStaffServiceImpl getRepository(){
        if (service == null) service = new TownStaffServiceImpl();
        return service;
    }
    private TownStaff findTownStaff(String tnStaff) {
        return this.tnStaff.stream()
                .filter(townStaff -> townStaff.getTnStaffId().trim().equals(tnStaff))
                .findAny()
                .orElse(null);
    }


    public TownStaff create(TownStaff staff){
        this.tnStaff.add(staff);
        return staff;
    }

    public TownStaff read(String staffId){
        // find the course that matches the id and return it if exist
        TownStaff tnStaff = findTownStaff(staffId);
        return tnStaff;
    }

    public void delete(String staffId) {
        // find the course, delete it if it exist
        TownStaff accountings = findTownStaff(staffId);
        if (tnStaff != null) this.tnStaff.remove(tnStaff);
    }

    public TownStaff update(TownStaff staff){
        // find the course, update it and delete it if it exists
        TownStaff toDelete = findTownStaff(staff.getTnStaffId());
        if(toDelete != null) {
            this.tnStaff.remove(toDelete);
            return create(staff);
        }
        return null;
    }


    public Set<TownStaff> getAll(){
        return this.tnStaff;
    }
}

