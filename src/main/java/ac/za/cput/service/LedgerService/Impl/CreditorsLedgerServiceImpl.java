package ac.za.cput.service.LedgerService.Impl;


import ac.za.cput.domain.Ledger.CreditorsLedger;
import ac.za.cput.repository.LedgerRepo.Impl.CreditorsLedgerRepositoryImpl;
import ac.za.cput.service.LedgerService.CreditorsLedgerService;

import java.util.HashSet;
import java.util.Set;


public class CreditorsLedgerServiceImpl implements CreditorsLedgerService {
    private static CreditorsLedgerServiceImpl service = null;
    private Set<CreditorsLedger> credLedger;

    private CreditorsLedgerServiceImpl(){
        this.credLedger = new HashSet<>();
    }

    public static CreditorsLedgerServiceImpl getRepository(){
        if (service == null) service = new CreditorsLedgerServiceImpl();
        return service;
    }
    private CreditorsLedger findCredLedger(String credLedger) {
        return this.credLedger.stream()
                .filter(creditorsLedger -> creditorsLedger.getCreditorsLId().trim().equals(credLedger))
                .findAny()
                .orElse(null);
    }


    public CreditorsLedger create(CreditorsLedger ledger){
        this.credLedger.add(ledger);
        return ledger;
    }

    public CreditorsLedger read(String ledgerId){
        // find the course that matches the id and return it if exist
        CreditorsLedger crediLedger = findCredLedger(ledgerId);
        return crediLedger;
    }

    public void delete(String ledgerId) {
        // find the course, delete it if it exist
        CreditorsLedger ledger = findCredLedger(ledgerId);
        if (credLedger != null) this.credLedger.remove(credLedger);
    }

    public CreditorsLedger update(CreditorsLedger ledger){
        // find the course, update it and delete it if it exists
        CreditorsLedger toDelete = findCredLedger(ledger.getCreditorsLId());
        if(toDelete != null) {
            this.credLedger.remove(toDelete);
            return create(ledger);
        }
        return null;
    }


    public Set<CreditorsLedger> getAll(){
        return this.credLedger;
    }
}
