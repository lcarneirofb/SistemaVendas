package br.ufrpe.bcc.vendas.model;

import java.util.*;

public class Cliente extends PessoaFisica implements java.io.Serializable{
    private double limiteCartao;


    public Cliente(){
        super();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Limite Crédito:");
            this.setLimiteCartao(scanner.nextDouble());
        }catch(InputMismatchException ex){
            System.out.println("Valor Inválido, digite novamente\nLimite Crédito:");
            this.setLimiteCartao(scanner.nextDouble());
        }

    }

    @Override
    public String toString() {
        return "Cliente{\n\t" +
                "SUPER=" + super.toString() + ", \n\t" +
                "limiteCartao=" + limiteCartao +
                '}';
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
}
