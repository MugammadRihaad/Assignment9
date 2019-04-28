package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownBaker;

public class FactoryTownBaker {
    public static TownBaker getTownBaker(String tnBakerId, String tnBakerName,
                                       double tnBakerSalary){
        return new TownBaker.Builder()
                .tnBakerId(tnBakerId)
                .tnBakerName(tnBakerName)
                .tnBakerSalary(tnBakerSalary)
                .build();





    }
}
