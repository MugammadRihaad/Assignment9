package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.bellvilleBaker;

public class FactoryBellvilleBaker {
    public static bellvilleBaker getBellvilleBaker(String bellBakerId, String bellBakerName,
                                                   double bellBakerSalary){
        return new bellvilleBaker.Builder()
                .bellBakerId(bellBakerId)
                .bellBakerName(bellBakerName)
                .bellBakerSalary(bellBakerSalary)
                .build();





    }
}
