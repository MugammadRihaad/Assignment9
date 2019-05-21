package ac.za.cput.repository.MPRepo.Impl;

import ac.za.cput.domain.MP.MPBranch;
import ac.za.cput.repository.MPRepo.MPBranchRepository;

import java.util.HashSet;
import java.util.Set;

public class MPBranchRepositoryImpl implements MPBranchRepository {
    private static MPBranchRepositoryImpl repository = null;
    private Set<MPBranch> mpBranch;

    private MPBranchRepositoryImpl(){
        this.mpBranch = new HashSet<>();
    }

    public static MPBranchRepositoryImpl getRepository(){
        if (repository == null) repository = new MPBranchRepositoryImpl();
        return repository;
    }


    public MPBranch create(MPBranch branch){
        this.mpBranch.add(branch);
        return branch;
    }

    public MPBranch read(String branchId){
        // find the course that matches the id and return it if exist
        return this.repository.read(branchId);
    }

    public void delete(String branchId) {
        // find the course, delete it if it exist
         this.repository.delete(branchId);
    }

    public MPBranch update(MPBranch branch){
        // find the course, update it and delete it if it exists
        return this.repository.update(branch);
    }


    public Set<MPBranch> getAll(){
        return this.mpBranch;
    }
}
