package ac.za.cput.repository.LedgerRepo.Impl;

import ac.za.cput.domain.Ledger.BusinessLedger;
import ac.za.cput.repository.LedgerRepo.BusinessLedgerRepository;

import java.util.HashSet;
import java.util.Set;

public class BusinessLedgerRepositoryImpl implements BusinessLedgerRepository {
    private static BusinessLedgerRepositoryImpl repository = null;
    private Set<BusinessLedger> busLedger;

    private BusinessLedgerRepositoryImpl(){
        this.busLedger = new HashSet<>();
    }

    public static BusinessLedgerRepositoryImpl getRepository(){
        if (repository == null) repository = new BusinessLedgerRepositoryImpl();
        return repository;
    }


    public BusinessLedger create(BusinessLedger ledger){
        this.busLedger.add(ledger);
        return ledger;
    }

    public BusinessLedger read(String ledgerId){
        // find the course that matches the id and return it if exist
        return this.repository.read(ledgerId);
    }

    public void delete(String ledgerId) {
        // find the course, delete it if it exist
         this.repository.delete(ledgerId);
    }

    public BusinessLedger update(BusinessLedger ledger){
        // find the course, update it and delete it if it exists
        return this.repository.update(ledger);
    }


    public Set<BusinessLedger> getAll(){
        return this.busLedger;
    }
}
