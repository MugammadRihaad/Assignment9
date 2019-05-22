package ac.za.cput.controller.Town;

import ac.za.cput.domain.Town.TownBaker;
import ac.za.cput.service.TownService.TownBakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Baker")
public class TownBakerController {
    @Autowired
    @Qualifier("TownBakerImpl")
    private TownBakerService service;

    @PostMapping("/create")
    @ResponseBody
    public TownBaker create(TownBaker baker) {
        return service.create(baker);
    }
    @PostMapping("/update")
    @ResponseBody
    public TownBaker update(TownBaker baker) {
        return service.update(baker);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TownBaker read(@PathVariable String baker) {
        return service.read(baker);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<TownBaker> getAll() {
        return service.getAll();
    }

}
