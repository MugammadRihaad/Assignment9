package ac.za.cput.factory.Bellville;

import ac.za.cput.domain.Bellville.BellvilleBranch;

public class FactoryBellvilleBranch {
    public static BellvilleBranch getBellvillBranch(String bellBrId, String bellStaffId){
       return new BellvilleBranch.Builder()
                 .bellBrId(bellBrId)
                 .bellStaffId(bellStaffId)
                  .build();

    }
}
