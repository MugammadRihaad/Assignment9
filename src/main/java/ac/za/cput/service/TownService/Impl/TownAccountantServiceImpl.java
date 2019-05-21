package ac.za.cput.service.TownService.Impl;


import ac.za.cput.domain.Town.TownAccountant;
import ac.za.cput.service.TownService.TownAccountantService;

import java.util.HashSet;
import java.util.Set;

public class TownAccountantServiceImpl implements TownAccountantService {
    private static TownAccountantServiceImpl service = null;
    private Set<TownAccountant> tnAccount;

    private TownAccountantServiceImpl(){
        this.tnAccount = new HashSet<>();
    }

    public static TownAccountantServiceImpl getRepository(){
        if (service == null) service = new TownAccountantServiceImpl();
        return service;
    }
    private TownAccountant findTownAccountant(String tnAccountant) {
        return this.tnAccount.stream()
                .filter(townAccountant -> townAccountant.getTnAccountId().trim().equals(tnAccountant))
                .findAny()
                .orElse(null);
    }


    public TownAccountant create(TownAccountant accountant){
        this.tnAccount.add(accountant);
        return accountant;
    }

    public TownAccountant read(String accountantId){
        // find the course that matches the id and return it if exist
        TownAccountant tnAccount = findTownAccountant(accountantId);
        return tnAccount;
    }

    public void delete(String accountantId) {
        // find the course, delete it if it exist
        TownAccountant accountings = findTownAccountant(accountantId);
        if (tnAccount != null) this.tnAccount.remove(tnAccount);
    }

    public TownAccountant update(TownAccountant accountant){
        // find the course, update it and delete it if it exists
        TownAccountant toDelete = findTownAccountant(accountant.getTnAccountId());
        if(toDelete != null) {
            this.tnAccount.remove(toDelete);
            return create(accountant);
        }
        return null;
    }


    public Set<TownAccountant> getAll(){
        return this.tnAccount;
    }
}
