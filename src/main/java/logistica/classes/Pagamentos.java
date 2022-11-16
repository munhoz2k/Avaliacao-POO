
package logistica.classes;

import java.util.List;

public class Pagamentos {

    public static void imprimir(List<Condutor> condutores, int mes, int ano) {

        System.out.println("Folha de Pagamento: " + mes + "/" + ano + "\n");

        for(Condutor condutor: condutores) {
            System.out.println("Condutor - " + condutor.getNome());
            System.out.println("Salario - R$ " + String.format("%.2f", condutor.getSalario()) + "\n");
        }

        System.out.println("Total a pagar = R$ " + String.format("%.2f", totalAPagar(condutores)));
    }

    private static double totalAPagar(List<Condutor> condutores) {
        double total = 0;

        for(Condutor condutor: condutores) {
            total = total + condutor.getSalario();
        }

        return total;
    }

}