package Viagem_Internacional;


import Interface.TaxaEmbarque;

public class TaxaEmbarqueInternacional implements TaxaEmbarque {

    @Override
    public double getTaxaEmbarque() {
        return 0.1;
    }
}