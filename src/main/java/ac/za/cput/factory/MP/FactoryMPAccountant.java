package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPAccountant;

public class FactoryMPAccountant {
    public static MPAccountant getMPAccountant(String mpAccountId, String mpBusinessLId,
                                                      String mpGeneralLId, String mpCreditorsLId){
        return new MPAccountant.Builder()
                .mpAccountId(mpAccountId)
                .mpBusinessLId(mpBusinessLId)
                .mpGeneralLId(mpGeneralLId)
                .mpCreditorsLId(mpGeneralLId)
                .build();



    }
}
