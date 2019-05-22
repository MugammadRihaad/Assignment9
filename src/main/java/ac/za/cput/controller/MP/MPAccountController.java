package ac.za.cput.controller.MP;

import ac.za.cput.domain.MP.MPAccountant;
import ac.za.cput.service.MPService.MPAccountantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Accountant")
public class MPAccountController {
    @Autowired
    @Qualifier("MPAccountantImpl")
    private MPAccountantService service;

    @PostMapping("/create")
    @ResponseBody
    public MPAccountant create(MPAccountant accountant) {
        return service.create(accountant);
    }
    @PostMapping("/update")
    @ResponseBody
    public MPAccountant update(MPAccountant accountant) {
        return service.update(accountant);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MPAccountant read(@PathVariable String account) {
        return service.read(account);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MPAccountant> getAll() {
        return service.getAll();
    }

}
