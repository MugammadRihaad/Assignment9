package ac.za.cput.controller.StockDeliveries;

import ac.za.cput.domain.StockDeliveries.StockDeliveries;
import ac.za.cput.service.StockDeliveriesService.StockDeliveriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Stockelivery")
public class StockDeliveriesController {
    @Autowired
    @Qualifier("StockDeliveriesImpl")
    private StockDeliveriesService service;

    @PostMapping("/create")
    @ResponseBody
    public StockDeliveries create(StockDeliveries stockDeliv) {
        return service.create(stockDeliv);
    }
    @PostMapping("/update")
    @ResponseBody
    public StockDeliveries update(StockDeliveries stockDeliv) {
        return service.update(stockDeliv);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public StockDeliveries read(@PathVariable String ledger) {
        return service.read(ledger);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StockDeliveries> getAll() {
        return service.getAll();
    }

}
