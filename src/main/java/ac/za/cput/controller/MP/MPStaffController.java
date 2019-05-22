package ac.za.cput.controller.MP;

import ac.za.cput.domain.MP.MPStaff;
import ac.za.cput.service.BellvilleService.BellvilleStaffService;
import ac.za.cput.service.MPService.MPStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Staff")
public class MPStaffController {

    @Autowired
    @Qualifier("MPStaffImpl")
    private MPStaffService service;

    @PostMapping("/create")
    @ResponseBody
    public MPStaff create(MPStaff staff) {
        return service.create(staff);
    }
    @PostMapping("/update")
    @ResponseBody
    public MPStaff update(MPStaff staff) {
        return service.update(staff);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MPStaff read(@PathVariable String staff) {
        return service.read(staff);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MPStaff> getAll() {
        return service.getAll();
    }
}
