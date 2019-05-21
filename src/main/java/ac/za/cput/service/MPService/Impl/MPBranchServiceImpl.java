package ac.za.cput.service.MPService.Impl;


import ac.za.cput.domain.MP.MPBranch;
import ac.za.cput.service.MPService.MPBranchService;

import java.util.HashSet;
import java.util.Set;

public class MPBranchServiceImpl implements MPBranchService {
    private static MPBranchServiceImpl service = null;
    private Set<MPBranch> mpBranch;

    private MPBranchServiceImpl(){
        this.mpBranch = new HashSet<>();
    }

    public static MPBranchServiceImpl getRepository(){
        if (service == null) service = new MPBranchServiceImpl();
        return service;
    }
    private MPBranch findMpBranch(String mpBranch) {
        return this.mpBranch.stream()
                .filter(mpBranch1 -> mpBranch1.getMpBrId().trim().equals(mpBranch))
                .findAny()
                .orElse(null);
    }


    public MPBranch create(MPBranch branch){
        this.mpBranch.add(branch);
        return branch;
    }

    public MPBranch read(String branchId){
        // find the course that matches the id and return it if exist
        MPBranch mpBranch = findMpBranch(branchId);
        return mpBranch;
    }

    public void delete(String branchId) {
        // find the course, delete it if it exist
        MPBranch branches = findMpBranch(branchId);
        if (mpBranch != null) this.mpBranch.remove(mpBranch);
    }

    public MPBranch update(MPBranch branch){
        // find the course, update it and delete it if it exists
        MPBranch toDelete = findMpBranch(branch.getMpBrId());
        if(toDelete != null) {
            this.mpBranch.remove(toDelete);
            return create(branch);
        }
        return null;
    }


    public Set<MPBranch> getAll(){
        return this.mpBranch;
    }
}
