package ac.za.cput.factory.Ledger;

import ac.za.cput.domain.Ledger.BusinessLedger;

public class FactoryBusinessLedger {
    public static BusinessLedger getBusinessLedger(String businessLId,
                                                   String custName,double custAmountOwed){
        return new BusinessLedger.Builder()
                    .businessLId(businessLId)
                    .custName(custName)
                    .custAmountOwed(custAmountOwed)
                    .build();

    }
}
