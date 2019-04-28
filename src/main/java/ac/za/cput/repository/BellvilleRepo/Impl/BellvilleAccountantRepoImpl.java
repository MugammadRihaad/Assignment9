package ac.za.cput.repository.BellvilleRepo.Impl;

import ac.za.cput.domain.Bellville.BellvilleAccountant;
import ac.za.cput.repository.BellvilleRepo.BellvilleAccountantRepository;

import java.util.HashSet;
import java.util.Set;

public class BellvilleAccountantRepoImpl implements BellvilleAccountantRepository {
    private static BellvilleAccountantRepoImpl repository = null;
    private Set<BellvilleAccountant> bellAccount;

    private BellvilleAccountantRepoImpl(){
        this.bellAccount = new HashSet<>();
    }

    public static BellvilleAccountantRepoImpl getRepository(){
        if (repository == null) repository = new BellvilleAccountantRepoImpl();
        return repository;
    }


    public BellvilleAccountant create(BellvilleAccountant accountant){
        this.bellAccount.add(accountant);
        return accountant;
    }

    public BellvilleAccountant read(String accountantId){
        // find the Accountant that matches the id and return it if exist
        return null;
    }

    public void delete(String accountantId) {
        // find the Accountant, delete it if it exist
    }

    public BellvilleAccountant update(BellvilleAccountant accountant){
        // find the Accountant, update it and delete it if it exists
        return accountant;
    }


    public Set<BellvilleAccountant> getAll(){
        return this.bellAccount;
    }
}
