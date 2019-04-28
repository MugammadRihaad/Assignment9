package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownAccountant;

public class FactoryTownAccountant {
    public static TownAccountant getTownAccountant(String tnAccountId, String tnBusinessLId,
                                                 String tnGeneralLId, String tnCreditorsLId){
        return new TownAccountant.Builder()
                .tnAccountId(tnAccountId)
                .tnBusinessLId(tnBusinessLId)
                .tnGeneralLId(tnGeneralLId)
                .tnCreditorsLId(tnCreditorsLId)
                .build();



    }
}
