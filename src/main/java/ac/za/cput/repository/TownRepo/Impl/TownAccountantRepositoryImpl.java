package ac.za.cput.repository.TownRepo.Impl;

import ac.za.cput.domain.Town.TownAccountant;
import ac.za.cput.repository.TownRepo.TownAccountantRepository;

import java.util.HashSet;
import java.util.Set;

public class TownAccountantRepositoryImpl implements TownAccountantRepository {
    private static TownAccountantRepositoryImpl repository = null;
    private Set<TownAccountant> tnAccount;

    private TownAccountantRepositoryImpl(){
        this.tnAccount = new HashSet<>();
    }

    public static TownAccountantRepositoryImpl getRepository(){
        if (repository == null) repository = new TownAccountantRepositoryImpl();
        return repository;
    }


    public TownAccountant create(TownAccountant accountant){
        this.tnAccount.add(accountant);
        return accountant;
    }

    public TownAccountant read(String accountantId){
        // find the course that matches the id and return it if exist
        return this.repository.read(accountantId);
    }

    public void delete(String accountantId) {
        // find the course, delete it if it exist
         this.repository.delete(accountantId);
    }

    public TownAccountant update(TownAccountant accountant){
        // find the course, update it and delete it if it exists
        return this.repository.update(accountant);
    }


    public Set<TownAccountant> getAll(){
        return this.tnAccount;
    }
}
