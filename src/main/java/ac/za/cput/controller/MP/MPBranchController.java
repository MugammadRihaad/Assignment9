package ac.za.cput.controller.MP;

import ac.za.cput.domain.MP.MPBranch;
import ac.za.cput.service.MPService.MPBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Branch")
public class MPBranchController {
    @Autowired
    @Qualifier("MPBranchImpl")
    private MPBranchService service;

    @PostMapping("/create")
    @ResponseBody
    public MPBranch create(MPBranch branch) {
        return service.create(branch);
    }
    @PostMapping("/update")
    @ResponseBody
    public MPBranch update(MPBranch branch) {
        return service.update(branch);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MPBranch read(@PathVariable String branch) {
        return service.read(branch);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MPBranch> getAll() {
        return service.getAll();
    }

}
