package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownBaker;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTownBakerTest {

    @Test
    public void getTownBaker() {

            String tnBakerId="bb456";
            String tnBakerName="Michelle";
            double tnBakerSalary=10000;

            TownBaker hd=FactoryTownBaker.getTownBaker(tnBakerId,tnBakerName,tnBakerSalary);
            System.out.println(hd);
            Assert.assertNotNull(hd.getTnBakerId()+"\n"+hd.getTnBakerName()+"\n"+
                    hd.getTnBakerSalary());
        }
    }
