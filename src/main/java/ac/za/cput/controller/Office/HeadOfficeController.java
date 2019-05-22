package ac.za.cput.controller.Office;


import ac.za.cput.domain.HeadOffice;
import ac.za.cput.service.HeadOfficeService.HeadOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/HeadOffice")
public class HeadOfficeController {
    @Autowired
    @Qualifier("HeadOfficeImpl")
    private HeadOfficeService service;

    @PostMapping("/create")
    @ResponseBody
    public HeadOffice create(HeadOffice office) {
        return service.create(office);
    }
    @PostMapping("/update")
    @ResponseBody
    public HeadOffice update(HeadOffice office) {
        return service.update(office);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public HeadOffice read(@PathVariable String office) {
        return service.read(office);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<HeadOffice> getAll() {
        return service.getAll();
    }

}
