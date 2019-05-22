package ac.za.cput.controller.StockDeliveries;


import ac.za.cput.domain.StockDeliveries.Deliveries;
import ac.za.cput.service.StockDeliveriesService.DeliveryService;
import ac.za.cput.service.StockDeliveriesService.StockDeliveriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Delivery")
public class DeliveryController {
    @Autowired
    @Qualifier("DeliveriesImpl")
    private DeliveryService service;

    @PostMapping("/create")
    @ResponseBody
    public Deliveries create(Deliveries deliv) {
        return service.create(deliv);
    }
    @PostMapping("/update")
    @ResponseBody
    public Deliveries update(Deliveries deliv) {
        return service.update(deliv);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Deliveries read(@PathVariable String ledger) {
        return service.read(ledger);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Deliveries> getAll() {
        return service.getAll();
    }

}
