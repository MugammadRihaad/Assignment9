package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.bellvilleBaker;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryBellvilleBakerTest {

    @Test
    public void getBellvilleBaker() {
        String bellBakerId="bb456";
        String bellBakerName="bbn780";
        double bellBakerSalary=10000;

        bellvilleBaker hd=FactoryBellvilleBaker.getBellvilleBaker(bellBakerId,bellBakerName,bellBakerSalary);
        System.out.println(hd);
        Assert.assertNotNull(hd.getBellBakerName()+"\n"+hd.getBellBakerId()+"\n"+
                hd.getBellBakerSalary());
    }
}