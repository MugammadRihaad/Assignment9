package ac.za.cput.service.TownService.Impl;


import ac.za.cput.domain.Town.TownBranch;
import ac.za.cput.service.TownService.TownBranchService;

import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;

public class TownBranchServiceImpl implements TownBranchService {
    private static TownBranchServiceImpl service = null;
    private Set<TownBranch> tnBranch;

    private TownBranchServiceImpl(){
        this.tnBranch = new HashSet<>();
    }

    public static TownBranchServiceImpl getRepository(){
        if (service == null) service = new TownBranchServiceImpl();
        return service;
    }
    private TownBranch findTownBranch(String tnBranch) {
        return this.tnBranch.stream()
                .filter(townBranch -> townBranch.getTnBrId().trim().equals(tnBranch))
                .findAny()
                .orElse(null);
    }


    public TownBranch create(TownBranch branch){
        this.tnBranch.add(branch);
        return branch;
    }

    public TownBranch read(String branchId){
        // find the course that matches the id and return it if exist
        TownBranch tnBranch = findTownBranch(branchId);
        return tnBranch;
    }

    public void delete(String branchId) {
        // find the course, delete it if it exist

        TownBranch bakers = findTownBranch(branchId);
        if (tnBranch != null) this.tnBranch.remove(tnBranch);
    }

    public TownBranch update(TownBranch branch){
        // find the course, update it and delete it if it exists
        TownBranch toDelete = findTownBranch(branch.getTnBrId());
        if(toDelete != null) {
            this.tnBranch.remove(toDelete);
            return create(branch);
        }
        return null;
    }


    public Set<TownBranch> getAll(){
        return this.tnBranch;
    }
}
