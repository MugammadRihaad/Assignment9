package ac.za.cput.repository.LedgerRepo.Impl;

import ac.za.cput.domain.Ledger.GeneralLedger;
import ac.za.cput.repository.LedgerRepo.GeneralLedgerRepository;

import java.util.HashSet;
import java.util.Set;

public class GeneralLedgerRepositoryImpl implements GeneralLedgerRepository {
    private static GeneralLedgerRepositoryImpl repository = null;
    private Set<GeneralLedger> genLedger;

    private GeneralLedgerRepositoryImpl(){
        this.genLedger = new HashSet<>();
    }

    public static GeneralLedgerRepositoryImpl getRepository(){
        if (repository == null) repository = new GeneralLedgerRepositoryImpl();
        return repository;
    }


    public GeneralLedger create(GeneralLedger ledger){
        this.genLedger.add(ledger);
        return ledger;
    }

    public GeneralLedger read(String ledgerId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String ledgerId) {
        // find the course, delete it if it exist
    }

    public GeneralLedger update(GeneralLedger ledger){
        // find the course, update it and delete it if it exists
        return ledger;
    }


    public Set<GeneralLedger> getAll(){
        return this.genLedger;
    }
}
