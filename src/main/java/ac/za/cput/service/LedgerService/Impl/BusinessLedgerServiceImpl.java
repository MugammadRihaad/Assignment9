package ac.za.cput.service.LedgerService.Impl;

import ac.za.cput.domain.Ledger.BusinessLedger;
import ac.za.cput.service.LedgerService.BusinessLedgerService;

import java.util.HashSet;
import java.util.Set;

public class BusinessLedgerServiceImpl implements BusinessLedgerService {
    private static BusinessLedgerServiceImpl service = null;
    private Set<BusinessLedger> busLedger;

    private BusinessLedgerServiceImpl(){
        this.busLedger = new HashSet<>();
    }

    public static BusinessLedgerServiceImpl getRepository(){
        if (service == null) service = new BusinessLedgerServiceImpl();
        return service;
    }
    private BusinessLedger findBusLedger(String busLedger) {
        return this.busLedger.stream()
                .filter(businessLedger -> businessLedger.getBusniessLId().trim().equals(busLedger))
                .findAny()
                .orElse(null);
    }


    public BusinessLedger create(BusinessLedger ledger){
        this.busLedger.add(ledger);
        return ledger;
    }

    public BusinessLedger read(String ledgerId){
        // find the course that matches the id and return it if exist
        BusinessLedger busLedger = findBusLedger(ledgerId);
        return busLedger;
    }

    public void delete(String ledgerId) {
        // find the course, delete it if it exist
        BusinessLedger busLedger = findBusLedger(ledgerId);
        if (busLedger != null) this.busLedger.remove(busLedger);
    }

    public BusinessLedger update(BusinessLedger ledger){
        // find the course, update it and delete it if it exists
        BusinessLedger toDelete = findBusLedger(ledger.getBusniessLId());
        if(toDelete != null) {
            this.busLedger.remove(toDelete);
            return create(ledger);
        }
        return null;
    }


    public Set<BusinessLedger> getAll(){
        return this.busLedger;
    }
}
