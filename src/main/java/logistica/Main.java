package logistica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import logistica.veiculos.*;
import logistica.classes.*;

public class Main {

    public static void main(String[] args) {

//      Criando Condutores
        List<Condutor> condutor = new ArrayList<Condutor>() {{
            add(new Condutor("Marcos", "11.111.111-11", LocalDate.of(1865, 05, 20), 4200)); // 0
            add(new Condutor("Gabriel", "22.222.222-22", LocalDate.of(1979, 1, 15), 3700)); // 1
            add(new Condutor("Gustavo", "33.333.333-33", LocalDate.of(1974, 8, 2), 3500)); // 2
        }};

//      Criando Veículos
        List<IVeiculo> veiculo = new ArrayList<IVeiculo>(){{
            add(new Caminhao("Samsung", "Caminhao", "AAA-1111", 200, 9, 7)); // 0
            add(new Carro("Volvo s60 2.0", "Carro", "BBB-2222", 50, 15, 4)); // 1
            add(new Moto("Kawasaki ERn-06", "Moto", "CCC-3333", 8, 30, 650)); // 2
        }};

//      Cria lista de Viagens
        List<Viagem> viagens = new ArrayList<Viagem>() {{
            add(new Viagem(condutor.get(0), veiculo.get(0), 150, "Sorocaba / SP", "Sao Paulo / SP", 110.5));
            add(new Viagem(condutor.get(1), veiculo.get(1), 80, "Sorocaba / SP", "Osasco / SP", 83.8));
            add(new Viagem(condutor.get(2), veiculo.get(2), 40, "Sorocaba / SP", "Barueri / SP", 72.5));
        }};

//      Custos para as Viagens
        viagens.get(0).custo(5.2);
        viagens.get(1).custo(5.1);
        viagens.get(2).custo(5.05);

//      Todos Condutores
        System.out.println("\n\n");
        Relatorio.imprimeCondutores(condutor);

//      Todos Veiculos
        System.out.println("\n");
        Relatorio.imprimeVeiculos(veiculo);

//      Impressão das viagens ordenados por Custos da Viagem
        System.out.println("\n");
        Relatorio.imprimeViagens(viagens);

//      Impressão de Folha de Pagamento dos Condutores
        System.out.println("\n");
        Pagamentos.imprimir(condutor, 8, 2018);

    }
}