package ac.za.cput.controller.Town;

import ac.za.cput.domain.Town.TownDelivery;
import ac.za.cput.service.TownService.TownDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Delivery")
public class TownDeliveryController {
    @Autowired
    @Qualifier("TownDeliveryImpl")
    private TownDeliveryService service;

    @PostMapping("/create")
    @ResponseBody
    public TownDelivery create(TownDelivery deliv) {
        return service.create(deliv);
    }
    @PostMapping("/update")
    @ResponseBody
    public TownDelivery update(TownDelivery deliv) {
        return service.update(deliv);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TownDelivery read(@PathVariable String deliv) {
        return service.read(deliv);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<TownDelivery> getAll() {
        return service.getAll();
    }

}
