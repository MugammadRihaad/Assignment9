package ac.za.cput.service.MPService.Impl;


import ac.za.cput.domain.MP.MPStaff;
import ac.za.cput.service.MPService.MPStaffService;

import java.util.HashSet;
import java.util.Set;

public class MPStaffServiceImpl implements MPStaffService {
    private static MPStaffServiceImpl service = null;
    private Set<MPStaff> mpStaff;

    private MPStaffServiceImpl(){
        this.mpStaff = new HashSet<>();
    }

    public static MPStaffServiceImpl getRepository(){
        if (service == null) service = new MPStaffServiceImpl();
        return service;
    }
    private MPStaff findMpStaff(String mpStaff) {
        return this.mpStaff.stream()
                .filter(mpStaff1 -> mpStaff1.getMpStaffId().trim().equals(mpStaff))
                .findAny()
                .orElse(null);
    }


    public MPStaff create(MPStaff staff){
        this.mpStaff.add(staff);
        return staff;
    }

    public MPStaff read(String staffId){
        // find the course that matches the id and return it if exist
        MPStaff mpStaff = findMpStaff(staffId);
        return mpStaff;
    }

    public void delete(String staffId) {
        // find the course, delete it if it exist
        MPStaff staff = findMpStaff(staffId);
        if (mpStaff != null) this.mpStaff.remove(mpStaff);
    }

    public MPStaff update(MPStaff staff){
        // find the course, update it and delete it if it exists
        MPStaff toDelete = findMpStaff(staff.getMpStaffId());
        if(toDelete != null) {
            this.mpStaff.remove(toDelete);
            return create(staff);
        }
        return null;
    }


    public Set<MPStaff> getAll(){
        return this.mpStaff;
    }
}
