package br.com.alura.limitecompras.modelo;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra: descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }


}
