package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownStaff;

public class FactoryTownStaff {
    public static TownStaff getTownStaff(String tnStaffId, String tnAccountID,
                                       String tnDelivId, String tnBakerId ){
        return new TownStaff.Builder()
                .tnStaffId(tnStaffId)
                .tnAccountId(tnAccountID)
                .tnDelivId(tnDelivId)
                .tnBakerId(tnBakerId)
                .build();

    }
}
