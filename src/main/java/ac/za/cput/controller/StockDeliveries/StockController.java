package ac.za.cput.controller.StockDeliveries;

import ac.za.cput.domain.StockDeliveries.Stock;
import ac.za.cput.service.StockDeliveriesService.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Stock")
public class StockController {
    @Autowired
    @Qualifier("StockImpl")
    private StockService service;

    @PostMapping("/create")
    @ResponseBody
    public Stock create(Stock stock) {
        return service.create(stock);
    }
    @PostMapping("/update")
    @ResponseBody
    public Stock update(Stock stock) {
        return service.update(stock);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Stock read(@PathVariable String stock) {
        return service.read(stock);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Stock> getAll() {
        return service.getAll();
    }

}
