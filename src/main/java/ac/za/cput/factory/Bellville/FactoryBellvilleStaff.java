package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleStaff;

public class FactoryBellvilleStaff {
    public static BellvilleStaff getBellvilleStaff(String bellStaffId,String bellAccountID,
                                                   String bellDelivId,String bellBakerId ){
        return new BellvilleStaff.Builder()
                    .bellStaffId(bellStaffId)
                    .bellAccountId(bellAccountID)
                    .bellDelivId(bellDelivId)
                    .bellBakerId(bellBakerId)
                    .build();

    }
}
