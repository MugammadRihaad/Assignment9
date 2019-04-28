package ac.za.cput.repository.MPRepo.Impl;

import ac.za.cput.domain.MP.MPAccountant;
import ac.za.cput.repository.MPRepo.MPAccountantRepository;

import java.util.HashSet;
import java.util.Set;

public class MPAccountantRepositoryImpl implements MPAccountantRepository {
    private static MPAccountantRepositoryImpl repository = null;
    private Set<MPAccountant> mpAccount;

    private MPAccountantRepositoryImpl(){
        this.mpAccount = new HashSet<>();
    }

    public static MPAccountantRepositoryImpl getRepository(){
        if (repository == null) repository = new MPAccountantRepositoryImpl();
        return repository;
    }


    public MPAccountant create(MPAccountant accountant){
        this.mpAccount.add(accountant);
        return accountant;
    }

    public MPAccountant read(String accountantId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String accountantId) {
        // find the course, delete it if it exist
    }

    public MPAccountant update(MPAccountant accountant){
        // find the course, update it and delete it if it exists
        return accountant;
    }


    public Set<MPAccountant> getAll(){
        return this.mpAccount;
    }
}
