package Viagem_Nacional;

import Interface.TaxaEmbarque;

public class TaxaEmbarqueNacional implements TaxaEmbarque {

    @Override
    public double getTaxaEmbarque() {
        return 0.05;
    }
}