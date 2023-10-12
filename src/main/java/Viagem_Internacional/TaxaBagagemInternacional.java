package Viagem_Internacional;

import Interface.TaxaBagagem;

public class TaxaBagagemInternacional implements TaxaBagagem {
    @Override
    public double getTaxaBagagem() {
        return 0.05;
    }
}