package ac.za.cput.repository.MPRepo.Impl;

import ac.za.cput.domain.MP.MPStaff;
import ac.za.cput.repository.MPRepo.MPStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class MPStaffRepositoryImpl implements MPStaffRepository {
    private static MPStaffRepositoryImpl repository = null;
    private Set<MPStaff> mpStaff;

    private MPStaffRepositoryImpl(){
        this.mpStaff = new HashSet<>();
    }

    public static MPStaffRepositoryImpl getRepository(){
        if (repository == null) repository = new MPStaffRepositoryImpl();
        return repository;
    }


    public MPStaff create(MPStaff staff){
        this.mpStaff.add(staff);
        return staff;
    }

    public MPStaff read(String staffId){
        // find the course that matches the id and return it if exist
        return this.repository.read(staffId);
    }

    public void delete(String staffId) {
        // find the course, delete it if it exist
         this.repository.delete(staffId);
    }

    public MPStaff update(MPStaff staff){
        // find the course, update it and delete it if it exists
        return this.repository.update(staff);
    }


    public Set<MPStaff> getAll(){
        return this.mpStaff;
    }
}
