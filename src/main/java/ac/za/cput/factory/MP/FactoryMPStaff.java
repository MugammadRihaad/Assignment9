package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPStaff;

public class FactoryMPStaff {
    public static MPStaff getMPStaff(String mpStaffId, String mpAccountID,
                                            String mpDelivId, String mpBakerId ){
        return new MPStaff.Builder()
                .mpStaffId(mpStaffId)
                .mpAccountId(mpAccountID)
                .mpDelivId(mpDelivId)
                .mpBakerId(mpBakerId)
                .build();

    }
}
