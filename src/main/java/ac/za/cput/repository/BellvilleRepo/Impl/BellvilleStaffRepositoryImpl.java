package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleStaff;
import ac.za.cput.repository.BellvilleRepo.BellvilleStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleStaffRepositoryImpl implements BellvilleStaffRepository {
    private static BellvilleStaffRepositoryImpl repository = null;
    private Set<BellvilleStaff> bellStaff;

    private BellvilleStaffRepositoryImpl(){
        this.bellStaff = new HashSet<>();
    }

    public static BellvilleStaffRepositoryImpl getRepository(){
        if (repository == null) repository = new BellvilleStaffRepositoryImpl();
        return repository;
    }


    public BellvilleStaff create(BellvilleStaff staff){
        this.bellStaff.add(staff);
        return staff;
    }

    public BellvilleStaff read(String staffId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String staffId) {
        // find the course, delete it if it exist
    }

    public BellvilleStaff update(BellvilleStaff staff){
        // find the course, update it and delete it if it exists
        return staff;
    }


    public Set<BellvilleStaff> getAll(){
        return this.bellStaff;
    }
}
