package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleBranch;
import ac.za.cput.repository.BellvilleRepo.BellvilleBranchRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleBranchRepositoryImpl implements BellvilleBranchRepository {
    private static BellvilleBranchRepositoryImpl repository = null;
    private Set<BellvilleBranch> bellBranch;

    private BellvilleBranchRepositoryImpl(){
        this.bellBranch = new HashSet<>();
    }

    public static BellvilleBranchRepositoryImpl getRepository(){
        if (repository == null) repository = new BellvilleBranchRepositoryImpl();
        return repository;
    }


    public BellvilleBranch create(BellvilleBranch branch){
        this.bellBranch.add(branch);
        return branch;
    }

    public BellvilleBranch read(String branchId){
        // find the course that matches the id and return it if exist
        return this.repository.read(branchId);
    }

    public void delete(String branchId) {
        // find the course, delete it if it exist
         this.repository.delete(branchId);
    }

    public BellvilleBranch update(BellvilleBranch branch){
        // find the course, update it and delete it if it exists
        return this.repository.update(branch);
    }


    public Set<BellvilleBranch> getAll(){
        return this.bellBranch;
    }
}
