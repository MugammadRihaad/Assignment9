package ac.za.cput.repository.LedgerRepo.Impl;

import ac.za.cput.domain.Ledger.CreditorsLedger;
import ac.za.cput.repository.LedgerRepo.CreditorsLedgerRepository;

import java.util.HashSet;
import java.util.Set;

public class CreditorsLedgerRepositoryImpl implements CreditorsLedgerRepository {
    private static CreditorsLedgerRepositoryImpl repository = null;
    private Set<CreditorsLedger> credLedger;

    private CreditorsLedgerRepositoryImpl(){
        this.credLedger = new HashSet<>();
    }

    public static CreditorsLedgerRepositoryImpl getRepository(){
        if (repository == null) repository = new CreditorsLedgerRepositoryImpl();
        return repository;
    }


    public CreditorsLedger create(CreditorsLedger ledger){
        this.credLedger.add(ledger);
        return ledger;
    }

    public CreditorsLedger read(String ledgerId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String ledgerId) {
        // find the course, delete it if it exist
    }

    public CreditorsLedger update(CreditorsLedger ledger){
        // find the course, update it and delete it if it exists
        return ledger;
    }


    public Set<CreditorsLedger> getAll(){
        return this.credLedger;
    }
}
