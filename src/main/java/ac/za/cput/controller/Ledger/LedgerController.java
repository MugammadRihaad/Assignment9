package ac.za.cput.controller.Ledger;


import ac.za.cput.domain.Ledger.Ledger;
import ac.za.cput.service.LedgerService.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Ledger")
public class LedgerController {
    @Autowired
    @Qualifier("LedgerImpl")
    private LedgerService service;

    @PostMapping("/create")
    @ResponseBody
    public Ledger create(Ledger ledger) {
        return service.create(ledger);
    }
    @PostMapping("/update")
    @ResponseBody
    public Ledger update(Ledger ledger) {
        return service.update(ledger);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Ledger read(@PathVariable String ledger) {
        return service.read(ledger);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Ledger> getAll() {
        return service.getAll();
    }

}
