package logistica.veiculos;

public class Caminhao implements IVeiculo {

    private String nome;
    private String tipo;
    private String placa;
    private double combustivel;
    private double consumo;

    private int eixos;

    public Caminhao(String nome, String tipo, String placa, double combustivel, double consumo, int eixos) {
        this.nome = nome;
        this.tipo = tipo;
        this.placa = placa;
        this.combustivel = combustivel;
        this.consumo = consumo;
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "\n  -Nome: " + nome +
                "\n  -Tipo: " + tipo +
                "\n  -Placa: " + placa +
                "\n  -Combustivel: " + combustivel + " L" +
                "\n  -Consumo: " + consumo + " KM/L" +
                "\n  -Eixos: " + eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setPortas(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double getCombustivel() {
        return this.combustivel;
    }

    @Override
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public double getConsumo() {
        return this.consumo;
    }

    @Override
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

}