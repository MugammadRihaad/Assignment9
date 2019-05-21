package ac.za.cput.service.MPService.Impl;

import ac.za.cput.domain.MP.MPAccountant;
import ac.za.cput.service.MPService.MPAccountantService;

import java.util.HashSet;
import java.util.Set;

public class MPAccountantServiceImpl implements MPAccountantService {
    private static MPAccountantServiceImpl service = null;
    private Set<MPAccountant> mpAccount;

    private MPAccountantServiceImpl(){
        this.mpAccount = new HashSet<>();
    }

    public static MPAccountantServiceImpl getRepository(){
        if (service == null) service = new MPAccountantServiceImpl();
        return service;
    }
    private MPAccountant findmpAccountant(String mpAccount) {
        return this.mpAccount.stream()
                .filter(mpAccountant -> mpAccountant.getMpAccountId().trim().equals(mpAccount))
                .findAny()
                .orElse(null);
    }


    public MPAccountant create(MPAccountant accountant){
        this.mpAccount.add(accountant);
        return accountant;
    }

    public MPAccountant read(String accountantId){
        // find the course that matches the id and return it if exist
        MPAccountant accountant = findmpAccountant(accountantId);
        return accountant;
    }

    public void delete(String accountantId) {
        // find the course, delete it if it exist
        MPAccountant accountings = findmpAccountant(accountantId);
        if (mpAccount != null) this.mpAccount.remove(mpAccount);
    }

    public MPAccountant update(MPAccountant accountant){
        // find the course, update it and delete it if it exists
        MPAccountant toDelete = findmpAccountant(accountant.getMpAccountId());
        if(toDelete != null) {
            this.mpAccount.remove(toDelete);
            return create(accountant);
        }
        return null;
    }


    public Set<MPAccountant> getAll(){
        return this.mpAccount;
    }
}
