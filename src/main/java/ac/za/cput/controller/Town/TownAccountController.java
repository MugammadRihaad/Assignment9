package ac.za.cput.controller.Town;


import ac.za.cput.domain.Town.TownAccountant;
import ac.za.cput.service.TownService.TownAccountantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Accountant")
public class TownAccountController {
    @Autowired
    @Qualifier("TownAccountantImpl")
    private TownAccountantService service;

    @PostMapping("/create")
    @ResponseBody
    public TownAccountant create(TownAccountant accountant) {
        return service.create(accountant);
    }
    @PostMapping("/update")
    @ResponseBody
    public TownAccountant update(TownAccountant accountant) {
        return service.update(accountant);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TownAccountant read(@PathVariable String account) {
        return service.read(account);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<TownAccountant> getAll() {
        return service.getAll();
    }

}
