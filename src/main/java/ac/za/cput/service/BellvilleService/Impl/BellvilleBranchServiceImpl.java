package ac.za.cput.service.BellvilleService.Impl;


import ac.za.cput.domain.Bellville.BellvilleBranch;
import ac.za.cput.service.BellvilleService.BellvilleBranchService;

import java.util.HashSet;
import java.util.Set;

public class BellvilleBranchServiceImpl implements BellvilleBranchService {
    private static BellvilleBranchServiceImpl service = null;
    private Set<BellvilleBranch> bellBranch;

    private BellvilleBranchServiceImpl(){
        this.bellBranch = new HashSet<>();
    }

    public static BellvilleBranchServiceImpl getRepository(){
        if (service == null) service = new BellvilleBranchServiceImpl();
        return service;
    }
    private BellvilleBranch findBranch(String branch) {
        return this.bellBranch.stream()
                .filter(bellvilleBranch -> bellvilleBranch.getBellBrId().trim().equals(branch))
                .findAny()
                .orElse(null);
    }


    public BellvilleBranch create(BellvilleBranch branch){
        this.bellBranch.add(branch);
        return branch;
    }

    public BellvilleBranch read(String branchId){
        // find the course that matches the id and return it if exist
        BellvilleBranch bellBranch = findBranch(branchId);
        return bellBranch;
    }

    public void delete(String branchId) {
        // find the course, delete it if it exist
        BellvilleBranch accountings = findBranch(branchId);
        if (bellBranch != null) this.bellBranch.remove(bellBranch);
    }

    public BellvilleBranch update(BellvilleBranch branch){
        // find the course, update it and delete it if it exists
        BellvilleBranch toDelete = findBranch(branch.getBellBrId());
        if(toDelete != null) {
            this.bellBranch.remove(toDelete);
            return create(branch);
        }
        return null;
    }


    public Set<BellvilleBranch> getAll(){
        return this.bellBranch;
    }
}
