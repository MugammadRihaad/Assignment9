package ac.za.cput.service.LedgerService.Impl;

import ac.za.cput.domain.Ledger.Ledger;
import ac.za.cput.service.LedgerService.LedgerService;

import java.util.HashSet;
import java.util.Set;

public class LedgerServiceImpl implements LedgerService {
    private static LedgerServiceImpl service = null;
    private Set<Ledger> ledger;

    private LedgerServiceImpl(){
        this.ledger = new HashSet<>();
    }

    public static LedgerServiceImpl getRepository(){
        if (service == null) service = new LedgerServiceImpl();
        return service;
    }
    private Ledger findLedger(String ledger) {
        return this.ledger.stream()
                .filter(ledger1 -> ledger1.getLedgerId().trim().equals(ledger))
                .findAny()
                .orElse(null);
    }

    public Ledger create(Ledger ledger){
        this.ledger.add(ledger);
        return ledger;
    }

    public Ledger read(String ledgerId){
        // find the course that matches the id and return it if exist
        Ledger ledg = findLedger(ledgerId);
        return ledg;
    }

    public void delete(String ledgerId) {
        // find the course, delete it if it exist
        Ledger accountings = findLedger(ledgerId);
        if (ledger != null) this.ledger.remove(ledger);
    }

    public Ledger update(Ledger ledger){
        // find the course, update it and delete it if it exists
        Ledger toDelete = findLedger(ledger.getLedgerId());
        if(toDelete != null) {
            this.ledger.remove(toDelete);
            return create(ledger);
        }
        return null;
    }


    public Set<Ledger> getAll(){
        return this.ledger;
    }
}

