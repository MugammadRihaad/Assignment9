package ac.za.cput.factory.Ledger;

import ac.za.cput.domain.Ledger.CreditorsLedger;

public class FactoryCreditorsLedger {
    public static CreditorsLedger getCreditorsLedger(String creditorsLId,
                                                     String supplierName,double suppAmountOwed){
        return new CreditorsLedger.Builder()
                    .creditorsLId(creditorsLId)
                    .supplierName(supplierName)
                    .suppAmountOwed(suppAmountOwed)
                    .build();

    }

}
