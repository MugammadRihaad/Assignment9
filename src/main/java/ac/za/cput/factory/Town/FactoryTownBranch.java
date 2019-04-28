package ac.za.cput.factory.Town;

import ac.za.cput.domain.Town.TownBranch;

public class FactoryTownBranch {
    public static TownBranch getTownBranch(String tnBrId, String tnStaffId){
        return new TownBranch.Builder()
                .tnBrId(tnBrId)
                .tnStaffId(tnStaffId)
                .build();

    }
}
