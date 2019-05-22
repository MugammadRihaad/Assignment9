package ac.za.cput.controller.Town;

import ac.za.cput.domain.Town.TownBranch;
import ac.za.cput.service.TownService.TownBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Branch")
public class TownBranchController {
    @Autowired
    @Qualifier("TownBranchImpl")
    private TownBranchService service;

    @PostMapping("/create")
    @ResponseBody
    public TownBranch create(TownBranch branch) {
        return service.create(branch);
    }
    @PostMapping("/update")
    @ResponseBody
    public TownBranch update(TownBranch branch) {
        return service.update(branch);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TownBranch read(@PathVariable String branch) {
        return service.read(branch);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<TownBranch> getAll() {
        return service.getAll();
    }

}
