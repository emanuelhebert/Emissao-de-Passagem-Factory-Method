package Viagem_Nacional;
import Interface.CalculoFactory;
import Interface.TaxaEmbarque;
import Interface.TaxaBagagem;

public class CalcularViagemNacional implements CalculoFactory {

    @Override
    public TaxaBagagem criarTaxaBagagem() {
        return new TaxaBagagemNacional();
    }

    @Override
    public TaxaEmbarque criarTaxaEmbarque() {
        return new TaxaEmbarqueNacional();
    }
}
