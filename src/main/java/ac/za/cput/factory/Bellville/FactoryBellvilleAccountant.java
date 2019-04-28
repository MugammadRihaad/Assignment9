package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleAccountant;

public class FactoryBellvilleAccountant {
    public static BellvilleAccountant getBellvilleAccountant(String bellAccountId, String bellBusinessLId,
                                               String bellGeneralLId, String bellCreditorsLId){
        return new BellvilleAccountant.Builder()
                .bellAccountId(bellAccountId)
                .bellBusinessLId(bellBusinessLId)
                .bellGeneralLId(bellGeneralLId)
                .bellCreditorsLId(bellGeneralLId)
                .build();



    }
}
