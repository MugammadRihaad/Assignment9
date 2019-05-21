package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.BellvilleAccountant;
import ac.za.cput.service.BellvilleService.BellvilleAccountantService;

import java.util.HashSet;
import java.util.Set;

public class BellvilleAccountantServiceImpl implements BellvilleAccountantService {
    private static BellvilleAccountantServiceImpl service = null;
    private Set<BellvilleAccountant> bellAccount;

    private BellvilleAccountantServiceImpl(){
        this.bellAccount = new HashSet<>();
    }

    private BellvilleAccountant findAccountant(String account) {
        return this.bellAccount.stream()
                .filter(bellvilleAccountant -> bellvilleAccountant.getBellAccountId().trim().equals(account))
                .findAny()
                .orElse(null);
    }

    public static BellvilleAccountantServiceImpl getRepository(){
        if (service == null) service = new BellvilleAccountantServiceImpl();
        return service;
    }
    public BellvilleAccountantService getService(){
        if (service == null) service = new BellvilleAccountantServiceImpl();
        return service;
    }


    public BellvilleAccountant create(BellvilleAccountant accountants){
        this.bellAccount.add(accountants);
        return accountants;
    }



    public BellvilleAccountant read(String account){
        // find the Accountant that matches the id and return it if exist
        BellvilleAccountant bellAccount = findAccountant(account);
        return bellAccount;
    }

    public void delete(String account) {
        // find the Accountant, delete it if it exist
        BellvilleAccountant accountings = findAccountant(account);
        if (bellAccount != null) this.bellAccount.remove(bellAccount);
    }

    public BellvilleAccountant update(BellvilleAccountant accountant){
        BellvilleAccountant toDelete = findAccountant(accountant.getBellAccountId());
        if(toDelete != null) {
            this.bellAccount.remove(toDelete);
            return create(accountant);
        }
        return null;
    }


    public Set<BellvilleAccountant> getAll(){
        return this.bellAccount;
    }
}
