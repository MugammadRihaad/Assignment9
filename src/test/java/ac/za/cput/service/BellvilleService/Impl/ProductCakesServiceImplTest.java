package ac.za.cput.service.BellvilleService.Impl;

import ac.za.cput.domain.Bellville.ProductCakes;
import ac.za.cput.factory.Bellville.FactoryProductCakes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ProductCakesServiceImplTest {

    private ProductCakesServiceImpl service;
    private ProductCakes prodCake;


    private ProductCakes getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (ProductCakesServiceImpl) ProductCakesServiceImpl.getRepository();
        this.prodCake = FactoryProductCakes.getProductCakes("pc345","chocolate",3000);
    }

    @Test
    public void create() {
        ProductCakes created = this.service.create(this.prodCake);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.prodCake);
    }

    @Test
    public void read() {
        ProductCakes saved = getSaved();
        ProductCakes read = this.service.read(saved.getProductCakeId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        ProductCakes saved = getSaved();
        this.service.delete(((ProductCakes) saved).getProductCakeId());
        getAll();
    }

    @Test
    public void update() {
        String productCakeId="pc956",category="icing";
        int amount=2300;


        ProductCakes updated = new ProductCakes.Builder().copy(getSaved())
                .productCakeId(productCakeId)
                .category(category)
                .amount(amount)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(productCakeId, updated.getProductCakeId());
    }

    @Test
    public void getAll() {
        Set<ProductCakes> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}