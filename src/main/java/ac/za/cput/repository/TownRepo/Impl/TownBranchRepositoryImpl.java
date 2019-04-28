package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.MP.MPBranch;

import ac.za.cput.domain.Town.TownBranch;
import ac.za.cput.repository.TownRepo.TownBranchRepository;

import java.util.HashSet;
import java.util.Set;

public class TownBranchRepositoryImpl implements TownBranchRepository {
    private static TownBranchRepositoryImpl repository = null;
    private Set<TownBranch> tnBranch;

    private TownBranchRepositoryImpl(){
        this.tnBranch = new HashSet<>();
    }

    public static TownBranchRepositoryImpl getRepository(){
        if (repository == null) repository = new TownBranchRepositoryImpl();
        return repository;
    }


    public TownBranch create(TownBranch branch){
        this.tnBranch.add(branch);
        return branch;
    }

    public TownBranch read(String branchId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String branchId) {
        // find the course, delete it if it exist
    }

    public TownBranch update(TownBranch branch){
        // find the course, update it and delete it if it exists
        return branch;
    }


    public Set<TownBranch> getAll(){
        return this.tnBranch;
    }
}
