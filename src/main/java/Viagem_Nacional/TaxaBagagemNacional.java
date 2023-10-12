package Viagem_Nacional;

import Interface.TaxaBagagem;

public class TaxaBagagemNacional implements TaxaBagagem {
    @Override
    public double getTaxaBagagem() {
        return 0.03;
    }
}