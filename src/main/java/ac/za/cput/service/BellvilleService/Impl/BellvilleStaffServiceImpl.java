package ac.za.cput.service.BellvilleService.Impl;


import ac.za.cput.domain.Bellville.BellvilleStaff;
import ac.za.cput.service.BellvilleService.BellvilleStaffService;

import java.util.HashSet;
import java.util.Set;

public class BellvilleStaffServiceImpl implements BellvilleStaffService {
    private static BellvilleStaffServiceImpl service = null;
    private Set<BellvilleStaff> bellStaff;

    private BellvilleStaffServiceImpl(){
        this.bellStaff = new HashSet<>();
    }

    public static BellvilleStaffServiceImpl getRepository(){
        if (service == null) service = new BellvilleStaffServiceImpl();
        return service;
    }
    private BellvilleStaff findStaff(String staff) {
        return this.bellStaff.stream()
                .filter(bellvilleStaff -> bellvilleStaff.getBellStaffId().trim().equals(staff))
                .findAny()
                .orElse(null);
    }


    public BellvilleStaff create(BellvilleStaff staff){
        this.bellStaff.add(staff);
        return staff;
    }

    public BellvilleStaff read(String staffId){
        // find the course that matches the id and return it if exist
        BellvilleStaff bellStaff = findStaff(staffId);
        return bellStaff;
    }

    public void delete(String staffId) {
        // find the course, delete it if it exist
        BellvilleStaff accountings = findStaff(staffId);
        if (bellStaff != null) this.bellStaff.remove(bellStaff);
    }

    public BellvilleStaff update(BellvilleStaff staff){
        // find the course, update it and delete it if it exists
        BellvilleStaff toDelete = findStaff(staff.getBellAccountId());
        if(toDelete != null) {
            this.bellStaff.remove(toDelete);
            return create(staff);
        }
        return null;
    }


    public Set<BellvilleStaff> getAll(){
        return this.bellStaff;
    }
}
