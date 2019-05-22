package ac.za.cput.controller.MP;

import ac.za.cput.domain.MP.MPDelivery;
import ac.za.cput.service.MPService.MPDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Delivery")
public class MPDeliveryController {
    @Autowired
    @Qualifier("MPDeliveryImpl")
    private MPDeliveryService service;

    @PostMapping("/create")
    @ResponseBody
    public MPDelivery create(MPDelivery deliv) {
        return service.create(deliv);
    }
    @PostMapping("/update")
    @ResponseBody
    public MPDelivery update(MPDelivery deliv) {
        return service.update(deliv);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MPDelivery read(@PathVariable String deliv) {
        return service.read(deliv);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<MPDelivery> getAll() {
        return service.getAll();
    }

}
