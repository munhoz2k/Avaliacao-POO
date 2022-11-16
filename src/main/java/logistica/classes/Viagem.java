package logistica.classes;

import logistica.veiculos.*;

import static java.lang.Math.ceil;

public class Viagem implements Comparable<Viagem> {

    private String origem;
    private String destino;
    private double distancia;
    private double diariasCondutor;

    private IVeiculo veiculo;
    private Condutor condutor;

    private double custos;

    public Viagem(Condutor condutor, IVeiculo veiculo, double diariasCondutor, String origem, String destino, double distancia) {
        this.condutor = condutor;
        this.veiculo = veiculo;
        this.diariasCondutor = diariasCondutor;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;

        this.custos = ceil(this.distancia / 700) * diariasCondutor;
    }

    public double custo(double valorCombustivel) {
        double custoCombustivel = (this.distancia / this.veiculo.getConsumo()) * valorCombustivel;
        return this.custos = this.custos + custoCombustivel;
    }

    @Override
    public String toString() {
        return "\n\n**Viagem " +
                "\n\n Condutor: " + condutor +
                "\n\n Veiculo: " + veiculo +
                "\n\n *Diarias do Condutor: R$ " + String.format("%.2f", diariasCondutor) +
                "\n *Origem: " + origem +
                "\n *Destino: " + destino +
                "\n *Distancia: " + distancia + " km" +
                "\n *Custo da viagem: R$ " + String.format("%.2f", custos);
    }

    public double getCustos() {
        return custos;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDiariasCondutor() {
        return diariasCondutor;
    }

    public IVeiculo getVeiculo() {
        return veiculo;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    @Override
    public int compareTo(Viagem viagem) {
        return Double.valueOf(this.custos).compareTo(Double.valueOf(viagem.getCustos()));
    }

}