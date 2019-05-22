package ac.za.cput.controller.Town;

import ac.za.cput.domain.Town.TownStaff;
import ac.za.cput.service.TownService.TownStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Staff")
public class TownStaffController {

    @Autowired
    @Qualifier("TownStaffImpl")
    private TownStaffService service;

    @PostMapping("/create")
    @ResponseBody
    public TownStaff create(TownStaff staff) {
        return service.create(staff);
    }
    @PostMapping("/update")
    @ResponseBody
    public TownStaff update(TownStaff staff) {
        return service.update(staff);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TownStaff read(@PathVariable String staff) {
        return service.read(staff);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<TownStaff> getAll() {
        return service.getAll();
    }
}
