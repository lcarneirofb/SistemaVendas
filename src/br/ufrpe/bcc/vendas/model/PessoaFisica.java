package br.ufrpe.bcc.vendas.model;

import java.util.Objects;
import java.util.Scanner;

public class PessoaFisica extends Pessoa implements java.io.Serializable{
    private String cpf;

    public PessoaFisica(){
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.println("CPF:");
        this.setCpf(scanner.nextLine());
    }


    @Override
    public String toString() {
        return "PessoaFisica{\n\t" +
                super.toString() + ", \n" +
                "cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
