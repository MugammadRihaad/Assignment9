package ac.za.cput.controller.Ledger;


import ac.za.cput.domain.Ledger.GeneralLedger;
import ac.za.cput.service.LedgerService.GeneralLedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/GeneralLedger")
public class GeneralLedgerCreditors {
    @Autowired
    @Qualifier("GeneralLedgerImpl")
    private GeneralLedgerService service;

    @PostMapping("/create")
    @ResponseBody
    public GeneralLedger create(GeneralLedger gLedger) {
        return service.create(gLedger);
    }
    @PostMapping("/update")
    @ResponseBody
    public GeneralLedger update(GeneralLedger gLedger) {
        return service.update(gLedger);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public GeneralLedger read(@PathVariable String gLedger) {
        return service.read(gLedger);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<GeneralLedger> getAll() {
        return service.getAll();
    }

}
