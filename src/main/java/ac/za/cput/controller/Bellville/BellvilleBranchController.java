package ac.za.cput.controller.Bellville;

import ac.za.cput.domain.Bellville.BellvilleBranch;
import ac.za.cput.service.BellvilleService.BellvilleBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/Accountant")
public class BellvilleBranchController {
    @Autowired
    @Qualifier("BellvilleBranchImpl")
    private BellvilleBranchService service;

    @PostMapping("/create")
    @ResponseBody
    public BellvilleBranch create(BellvilleBranch branch) {
        return service.create(branch);
    }
    @PostMapping("/update")
    @ResponseBody
    public BellvilleBranch update(BellvilleBranch branch) {
        return service.update(branch);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BellvilleBranch read(@PathVariable String branch) {
        return service.read(branch);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BellvilleBranch> getAll() {
        return service.getAll();
    }

}
