package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.Town.TownStaff;
import ac.za.cput.repository.TownRepo.TownStaffRepository;

import java.util.HashSet;
import java.util.Set;

public class TownStaffRepositoryImpl implements TownStaffRepository {
    private static TownStaffRepositoryImpl repository = null;
    private Set<TownStaff> tnStaff;

    private TownStaffRepositoryImpl(){
        this.tnStaff = new HashSet<>();
    }

    public static TownStaffRepositoryImpl getRepository(){
        if (repository == null) repository = new TownStaffRepositoryImpl();
        return repository;
    }


    public TownStaff create(TownStaff staff){
        this.tnStaff.add(staff);
        return staff;
    }

    public TownStaff read(String staffId){
        // find the course that matches the id and return it if exist
        return this.repository.read(staffId);
    }

    public void delete(String staffId) {
        // find the course, delete it if it exist
         this.repository.delete(staffId);
    }

    public TownStaff update(TownStaff staff){
        // find the course, update it and delete it if it exists
        return this.repository.update(staff);
    }


    public Set<TownStaff> getAll(){
        return this.tnStaff;
    }
}
