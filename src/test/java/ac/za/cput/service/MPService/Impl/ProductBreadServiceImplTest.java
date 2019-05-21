package ac.za.cput.service.MPService.Impl;

import ac.za.cput.domain.MP.ProductBread;
import ac.za.cput.factory.MP.FactoryProductBread;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ProductBreadServiceImplTest {



    private ProductBreadServiceImpl service;
    private ProductBread prodBread;


    private ProductBread getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (ProductBreadServiceImpl) ProductBreadServiceImpl.getRepository();
        this.prodBread = FactoryProductBread.getProductBread("pb345","wheat",3000);
    }

    @Test
    public void create() {
        ProductBread created = this.service.create(this.prodBread);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.prodBread);
    }

    @Test
    public void read() {
        ProductBread saved = getSaved();
        ProductBread read = this.service.read(saved.getProductBreadId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        ProductBread saved = getSaved();
        this.service.delete(((ProductBread) saved).getProductBreadId());
        getAll();
    }

    @Test
    public void update() {
        String productBreadId="pc956",category="icing";
        int amount=2300;


        ProductBread updated = new ProductBread.Builder().copy(getSaved())
                .productBreadId(productBreadId)
                .category(category)
                .amount(amount)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(productBreadId, updated.getProductBreadId());

    }

    @Test
    public void getAll() {
        Set<ProductBread> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}