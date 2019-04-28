package ac.za.cput.factory.MP;

import ac.za.cput.domain.MP.MPBranch;

public class FactoryMPBranch {
    public static MPBranch getMPBranch(String mpBrId, String mpStaffId){
        return new MPBranch.Builder()
        .mpBrId(mpBrId)
        .mpStaffId(mpStaffId)
        .build();

        }
        }
