package ac.za.cput.service.LedgerService.Impl;

import ac.za.cput.domain.Ledger.GeneralLedger;
import ac.za.cput.service.LedgerService.GeneralLedgerService;

import java.util.HashSet;
import java.util.Set;

public class GeneralLedgerServiceImpl implements GeneralLedgerService {
    private static GeneralLedgerServiceImpl service = null;
    private Set<GeneralLedger> genLedger;

    private GeneralLedgerServiceImpl(){
        this.genLedger = new HashSet<>();
    }

    public static GeneralLedgerServiceImpl getRepository(){
        if (service == null) service = new GeneralLedgerServiceImpl();
        return service;
    }
    private GeneralLedger findGenLedger(String genLedger) {
        return this.genLedger.stream()
                .filter(generalLedger -> generalLedger.getGeneralLId().trim().equals(genLedger))
                .findAny()
                .orElse(null);
    }

    public GeneralLedger create(GeneralLedger ledger){
        this.genLedger.add(ledger);
        return ledger;
    }

    public GeneralLedger read(String ledgerId){
        // find the course that matches the id and return it if exist
        GeneralLedger geneLedger = findGenLedger(ledgerId);
        return geneLedger;
    }

    public void delete(String ledgerId) {
        // find the course, delete it if it exist
        GeneralLedger ledger = findGenLedger(ledgerId);
        if (genLedger != null) this.genLedger.remove(genLedger);
    }

    public GeneralLedger update(GeneralLedger ledger){
        // find the course, update it and delete it if it exists
        GeneralLedger toDelete = findGenLedger(ledger.getGeneralLId());
        if(toDelete != null) {
            this.genLedger.remove(toDelete);
            return create(ledger);
        }
        return null;
    }


    public Set<GeneralLedger> getAll(){
        return this.genLedger;
    }
}
