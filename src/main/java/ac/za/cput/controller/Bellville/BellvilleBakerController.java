package ac.za.cput.controller.Bellville;


import ac.za.cput.domain.Bellville.bellvilleBaker;
import ac.za.cput.service.BellvilleService.BellvilleBakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Baker")
public class BellvilleBakerController {
    @Autowired
    @Qualifier("BellvilleBakerImpl")
    private BellvilleBakerService service;

    @PostMapping("/create")
    @ResponseBody
    public bellvilleBaker create(bellvilleBaker baker) {
        return service.create(baker);
    }
    @PostMapping("/update")
    @ResponseBody
    public bellvilleBaker update(bellvilleBaker baker) {
        return service.update(baker);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public bellvilleBaker read(@PathVariable String baker) {
        return service.read(baker);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<bellvilleBaker> getAll() {
        return service.getAll();
    }

}
