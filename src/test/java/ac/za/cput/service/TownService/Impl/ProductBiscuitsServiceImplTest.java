package ac.za.cput.service.TownService.Impl;

import ac.za.cput.domain.Town.ProductBiscuits;
import ac.za.cput.factory.Town.FactoryProductBiscuits;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ProductBiscuitsServiceImplTest {

    private ProductBiscuitsServiceImpl service;
    private ProductBiscuits productBiscuits;


    private ProductBiscuits getSaved(){
        return this.service.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.service = (ProductBiscuitsServiceImpl) ProductBiscuitsServiceImpl.getRepository();
        this.productBiscuits = FactoryProductBiscuits.getProductBiscuits("pb345","butter",3000);
    }

    @Test
    public void create() {
        ProductBiscuits created = this.service.create(this.productBiscuits);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.productBiscuits);
    }

    @Test
    public void read() {
        ProductBiscuits saved = getSaved();
        ProductBiscuits read = this.service.read(saved.getProductBiscuitsId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void delete() {
        ProductBiscuits saved = getSaved();
        this.service.delete(((ProductBiscuits) saved).getProductBiscuitsId());
        getAll();
    }

    @Test
    public void update() {
        String productBiscuitsId="pc956",category="icing";
        int amount=2300;


        ProductBiscuits updated = new ProductBiscuits.Builder().copy(getSaved())
                .productBiscuitsId(productBiscuitsId)
                .category(category)
                .amount(amount)
                .build();
        System.out.println("In update, updated = " + updated);
        this.service.update(updated);
        Assert.assertSame(productBiscuitsId, updated.getProductBiscuitsId());
    }

    @Test
    public void getAll() {
        Set<ProductBiscuits> courses = this.service.getAll();
        System.out.println("In getall, all = " + courses);
    }
}