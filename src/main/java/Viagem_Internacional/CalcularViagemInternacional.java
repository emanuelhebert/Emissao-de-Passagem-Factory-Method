package Viagem_Internacional;
import Interface.CalculoFactory;
import Interface.TaxaBagagem;
import Interface.TaxaEmbarque;


public class CalcularViagemInternacional implements CalculoFactory {


    @Override
    public TaxaBagagem criarTaxaBagagem() {
        return new TaxaBagagemInternacional();
    }

    @Override
    public TaxaEmbarque criarTaxaEmbarque() {
        return new TaxaEmbarqueInternacional();
    }
}