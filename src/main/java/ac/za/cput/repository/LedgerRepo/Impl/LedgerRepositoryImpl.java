package ac.za.cput.repository.LedgerRepo.Impl;

import ac.za.cput.domain.Ledger.Ledger;
import ac.za.cput.repository.LedgerRepo.LedgerRepository;

import java.util.HashSet;
import java.util.Set;

public class LedgerRepositoryImpl implements LedgerRepository {
    private static LedgerRepositoryImpl repository = null;
    private Set<Ledger> ledger;

    private LedgerRepositoryImpl(){
        this.ledger = new HashSet<>();
    }

    public static LedgerRepositoryImpl getRepository(){
        if (repository == null) repository = new LedgerRepositoryImpl();
        return repository;
    }


    public Ledger create(Ledger ledger){
        this.ledger.add(ledger);
        return ledger;
    }

    public Ledger read(String ledgerId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String ledgerId) {
        // find the course, delete it if it exist
    }

    public Ledger update(Ledger ledger){
        // find the course, update it and delete it if it exists
        return ledger;
    }


    public Set<Ledger> getAll(){
        return this.ledger;
    }
}
