package br.ufrpe.bcc.vendas.model;

import java.util.Objects;
import java.util.Scanner;

public class Pessoa implements java.io.Serializable{

    private String nome;
    private String telefone;
    private String endereco;
    private String email;
    private int idade;


    public Pessoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome:");
        this.setNome(scanner.nextLine());
        System.out.println("Telefone: (xx)XXXXXXXXX");
        this.setTelefone(scanner.nextLine());
        System.out.println("E-mail:");
        this.setEmail(scanner.nextLine());
        System.out.println("Endereço:");
        this.setEndereco(scanner.nextLine());
        System.out.println("Idade:");
        this.setIdade(scanner.nextInt());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(telefone, pessoa.telefone) &&
                Objects.equals(endereco, pessoa.endereco) &&
                Objects.equals(email, pessoa.email);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, telefone, endereco, email, idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
