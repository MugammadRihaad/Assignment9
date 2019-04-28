package ac.za.cput.factory;

import ac.za.cput.domain.HeadOffice;

public class FactoryHeadOffice {

    public static HeadOffice getHeadOffice(String officeId,String bellvilleBrId,String townBrId,
                                           String mpBrId){
        return new HeadOffice.Builder()
                    .officeId(officeId)
                    .bellvilleBrId(bellvilleBrId)
                    .townBrId(townBrId)
                    .mpBrId(mpBrId)
                    .build();

    }
}
