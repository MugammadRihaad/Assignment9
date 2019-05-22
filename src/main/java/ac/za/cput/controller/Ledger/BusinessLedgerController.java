package ac.za.cput.controller.Ledger;

import ac.za.cput.domain.Ledger.BusinessLedger;
import ac.za.cput.service.LedgerService.BusinessLedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/BusinessLedger")
public class BusinessLedgerController {
    @Autowired
    @Qualifier("BusinessLedgerImpl")
    private BusinessLedgerService service;

    @PostMapping("/create")
    @ResponseBody
    public BusinessLedger create(BusinessLedger bLedger) {
        return service.create(bLedger);
    }
    @PostMapping("/update")
    @ResponseBody
    public BusinessLedger update(BusinessLedger bLedger) {
        return service.update(bLedger);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BusinessLedger read(@PathVariable String bLedger) {
        return service.read(bLedger);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BusinessLedger> getAll() {
        return service.getAll();
    }

}
