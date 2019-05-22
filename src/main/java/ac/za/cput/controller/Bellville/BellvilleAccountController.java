package ac.za.cput.controller.Bellville;

import ac.za.cput.domain.Bellville.BellvilleAccountant;
import ac.za.cput.service.BellvilleService.BellvilleAccountantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Accountant")
public class BellvilleAccountController {
    @Autowired
    @Qualifier("BellvilleAccountantImpl")
    private BellvilleAccountantService service;

    @PostMapping("/create")
    @ResponseBody
    public BellvilleAccountant create(BellvilleAccountant accountant) {
        return service.create(accountant);
    }
    @PostMapping("/update")
    @ResponseBody
    public BellvilleAccountant update(BellvilleAccountant accountant) {
        return service.update(accountant);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BellvilleAccountant read(@PathVariable String account) {
        return service.read(account);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BellvilleAccountant> getAll() {
        return service.getAll();
    }

}
