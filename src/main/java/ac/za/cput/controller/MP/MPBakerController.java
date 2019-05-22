package ac.za.cput.controller.MP;


import ac.za.cput.domain.MP.MPBaker;
import ac.za.cput.service.MPService.MPBakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Baker")
public class MPBakerController {
    @Autowired
    @Qualifier("MPBakerImpl")
    private MPBakerService service;

    @PostMapping("/create")
    @ResponseBody
    public MPBaker create(MPBaker baker) {
        return service.create(baker);
    }
    @PostMapping("/update")
    @ResponseBody
    public MPBaker update(MPBaker baker) {
        return service.update(baker);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MPBaker read(@PathVariable String baker) {
        return service.read(baker);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MPBaker> getAll() {
        return service.getAll();
    }

}
