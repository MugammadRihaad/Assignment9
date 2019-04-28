package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPBaker;

public class FactoryMPBaker {
    public static MPBaker getMPBaker(String mpBakerId, String mpBakerName,
                                            double mpBakerSalary){
        return new MPBaker.Builder()
                .mpBakerId(mpBakerId)
                .mpBakerName(mpBakerName)
                .mpBakerSalary(mpBakerSalary)
                .build();





    }
}
