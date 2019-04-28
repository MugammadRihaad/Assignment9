package ac.za.cput.factory.Ledger;

import ac.za.cput.domain.Ledger.GeneralLedger;

public class FactoryGeneralLedger {
    public static GeneralLedger getGeneralLedger(String date, String generalLId,
            int totalTransaction,
            double totalAmount){

        return new GeneralLedger.Builder()
                    .date(date)
                    .generalLId(generalLId)
                    .totalTrans(totalTransaction)
                    .totalAmount(totalAmount)
                    .build();

    }
}
