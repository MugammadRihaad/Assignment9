package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleAccountant;

public class FactoryBellvilleAccountant {
    public static BellvilleAccountant getBellvilleAccountant(String bellAccountId, String bellLedgerId,String bellBusinessLId,
                                               String bellGeneralLId, String bellCreditorsLId){
        return new BellvilleAccountant.Builder()
                .bellAccountId(bellAccountId)
                .bellLedgerId(bellLedgerId)
                .bellBusinessLId(bellBusinessLId)
                .bellGeneralLId(bellGeneralLId)
                .bellCreditorsLId(bellCreditorsLId)
                .build();



    }
}
