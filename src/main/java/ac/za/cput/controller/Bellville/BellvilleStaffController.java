package ac.za.cput.controller.Bellville;


import ac.za.cput.domain.Bellville.BellvilleStaff;
import ac.za.cput.service.BellvilleService.BellvilleStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Staff")
public class BellvilleStaffController {
    @Autowired
    @Qualifier("BellvilleStaffImpl")
    private BellvilleStaffService service;

    @PostMapping("/create")
    @ResponseBody
    public BellvilleStaff create(BellvilleStaff staff) {
        return service.create(staff);
    }
    @PostMapping("/update")
    @ResponseBody
    public BellvilleStaff update(BellvilleStaff staff) {
        return service.update(staff);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BellvilleStaff read(@PathVariable String staff) {
        return service.read(staff);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BellvilleStaff> getAll() {
        return service.getAll();
    }
}
