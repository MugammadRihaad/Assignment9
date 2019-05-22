package ac.za.cput.controller.Town;

import ac.za.cput.domain.Town.ProductBiscuits;
import ac.za.cput.service.TownService.ProductBiscuitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Biscuits")
public class ProductBiscuitsController {
    @Autowired
    @Qualifier("ProductBiscuitsImpl")
    private ProductBiscuitsService service;

    @PostMapping("/create")
    @ResponseBody
    public ProductBiscuits create(ProductBiscuits biscuits) {
        return service.create(biscuits);
    }
    @PostMapping("/update")
    @ResponseBody
    public ProductBiscuits update(ProductBiscuits biscuits) {
        return service.update(biscuits);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ProductBiscuits read(@PathVariable String biscuits) {
        return service.read(biscuits);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ProductBiscuits> getAll() {
        return service.getAll();
    }
}
