package ac.za.cput.controller.Bellville;


import ac.za.cput.domain.Bellville.ProductCakes;
import ac.za.cput.service.BellvilleService.ProductCakesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Cakes")
public class ProductCakesController {
    @Autowired
    @Qualifier("ProductCakesImpl")
    private ProductCakesService service;

    @PostMapping("/create")
    @ResponseBody
    public ProductCakes create(ProductCakes cakes) {
        return service.create(cakes);
    }
    @PostMapping("/update")
    @ResponseBody
    public ProductCakes update(ProductCakes cakes) {
        return service.update(cakes);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ProductCakes read(@PathVariable String cakes) {
        return service.read(cakes);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ProductCakes> getAll() {
        return service.getAll();
    }
}
