import Viagem_Internacional.CalcularViagemInternacional;
import Viagem_Nacional.CalcularViagemNacional;

public class Main {

    public static void main(String[] args) {

        var passagem1 = new GerarPassagem();

        passagem1.gerarPassagem(200,new CalcularViagemNacional());

        System.out.println("------------------------------------------");

        var passagem2 = new GerarPassagem();

        passagem2.gerarPassagem(300, new CalcularViagemInternacional());


    }
}