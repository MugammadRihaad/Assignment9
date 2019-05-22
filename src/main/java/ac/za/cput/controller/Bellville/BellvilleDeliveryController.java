package ac.za.cput.controller.Bellville;


import ac.za.cput.domain.Bellville.BellvilleDelivery;
import ac.za.cput.service.BellvilleService.BellvilleDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Delivery")
public class BellvilleDeliveryController {
    @Autowired
    @Qualifier("BellvilleDeliveryImpl")
    private BellvilleDeliveryService service;

    @PostMapping("/create")
    @ResponseBody
    public BellvilleDelivery create(BellvilleDelivery deliv) {
        return service.create(deliv);
    }
    @PostMapping("/update")
    @ResponseBody
    public BellvilleDelivery update(BellvilleDelivery deliv) {
        return service.update(deliv);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BellvilleDelivery read(@PathVariable String deliv) {
        return service.read(deliv);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BellvilleDelivery> getAll() {
        return service.getAll();
    }

}
