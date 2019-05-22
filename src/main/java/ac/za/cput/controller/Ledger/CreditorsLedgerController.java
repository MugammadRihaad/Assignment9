package ac.za.cput.controller.Ledger;


import ac.za.cput.domain.Ledger.CreditorsLedger;
import ac.za.cput.service.LedgerService.CreditorsLedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/CreditorsLedger")
public class CreditorsLedgerController {
    @Autowired
    @Qualifier("CreditorsLedgerImpl")
    private CreditorsLedgerService service;

    @PostMapping("/create")
    @ResponseBody
    public CreditorsLedger create(CreditorsLedger cLedger) {
        return service.create(cLedger);
    }
    @PostMapping("/update")
    @ResponseBody
    public CreditorsLedger update(CreditorsLedger cLedger) {
        return service.update(cLedger);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public CreditorsLedger read(@PathVariable String cLedger) {
        return service.read(cLedger);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<CreditorsLedger> getAll() {
        return service.getAll();
    }

}
