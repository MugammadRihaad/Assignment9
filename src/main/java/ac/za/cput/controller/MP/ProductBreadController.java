package ac.za.cput.controller.MP;

import ac.za.cput.domain.MP.ProductBread;
import ac.za.cput.service.MPService.ProductBreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Bread")
public class ProductBreadController {
    @Autowired
    @Qualifier("ProductBreadImpl")
    private ProductBreadService service;

    @PostMapping("/create")
    @ResponseBody
    public ProductBread create(ProductBread bread) {
        return service.create(bread);
    }
    @PostMapping("/update")
    @ResponseBody
    public ProductBread update(ProductBread bread) {
        return service.update(bread);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ProductBread read(@PathVariable String bread) {
        return service.read(bread);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ProductBread> getAll() {
        return service.getAll();
    }
}
