package ac.za.cput.factory.Ledger;

import ac.za.cput.domain.Ledger.Ledger;

public class FactoryLedger {
    public static Ledger getLedger(String ledgerId,String generalLId,
                                   String businessLId,String creditorsLId){
        return new Ledger.Builder()
                    .ledgerId(ledgerId)
                    .generalLId(generalLId)
                    .businessLId(businessLId)
                    .creditorsLId(creditorsLId)
                    .build();

    }
}
