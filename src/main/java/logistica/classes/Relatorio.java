package logistica.classes;

import logistica.veiculos.*;

import java.util.Collections;
import java.util.List;

public class Relatorio {

//  Printa todos os condutores em ordem de CPF
    public static void imprimeCondutores(List<Condutor> condutores) {
        Collections.sort(condutores);

        System.out.println("\n\n--------------Condutores--------------");

        for(Condutor condutor: condutores) {
            System.out.println(condutor);
        }

        System.out.println("\n\n--------------------------------------");
    }

//  Imprime todos os veículos de todos os tipos (moto, carro, caminhão) ordenados por nome
    public static void imprimeVeiculos(List<IVeiculo> veiculos) {
        Collections.sort(veiculos, (veiculo1, veiculo2) -> {
            return veiculo1.getNome().compareToIgnoreCase(veiculo2.getNome());
        });

        System.out.println("\n\n--------------Veiculos--------------");

        for(IVeiculo veiculo: veiculos) {
            System.out.println(veiculo);
        }

        System.out.println("\n\n------------------------------------");
    }

    public static void imprimeViagens(List<Viagem> viagens) {
//        imprime todas as viagens ordenadas pelo custo
        Collections.sort(viagens);

        System.out.println("\n\n--------------Viagens--------------");

        for(Viagem viagem: viagens) {
            System.out.println(viagem);
        }

        System.out.println("\n--------------------------------------");
    }

}
