package br.ufrpe.bcc.vendas.model;

import java.util.Objects;
import java.util.Scanner;

public class Produto implements java.io.Serializable{
    private String nome;
    private double preco;
    private double peso;
    private int EstoqueMinimo;
    private int estoqueAtual;
    private String codigo;

    public Produto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do Produto:");
        this.setNome(scanner.nextLine());
        System.out.println("Preço:");
        this.setPreco(scanner.nextDouble());
        System.out.println("Peso:");
        this.setPeso(scanner.nextDouble());
        System.out.println("Estoque Mínimo:");
        this.setEstoqueMinimo(scanner.nextInt());
        System.out.println("Estoque Atual:");
        this.setEstoqueAtual(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Codigo");
        this.setCodigo(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", peso=" + peso +
                ", EstoqueMinimo=" + EstoqueMinimo +
                ", estoqueAtual=" + estoqueAtual +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.preco, preco) == 0 &&
                Double.compare(produto.peso, peso) == 0 &&
                Objects.equals(nome, produto.nome) &&
                Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, preco, peso, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstoqueMinimo() {
        return EstoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        EstoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
