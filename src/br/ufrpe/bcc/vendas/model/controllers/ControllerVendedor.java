package br.ufrpe.bcc.vendas.model.controllers;

import br.ufrpe.bcc.vendas.model.Vendedor;

import java.util.ArrayList;

public class ControllerVendedor implements java.io.Serializable{
    private ArrayList<Vendedor> vendedores;

    public ControllerVendedor(){
        this.vendedores = new ArrayList<>();
    }

    public boolean vendedorExiste(String cpf){
        for(Vendedor vendedor: vendedores){
            if(cpf.equals(vendedor.getCpf())){
                return true;
            }
        }
        return false;
    }

    public Vendedor procurarVendedor(String cpf){
        for(Vendedor vendedor: vendedores){
            if(cpf.equals(vendedor.getCpf())){
                return vendedor;
            }
        }
        System.out.println("Vendedor não encontrado.");
        return null;
    }

    public void novoVendedor(){
        Vendedor v = new Vendedor();
        if(vendedorExiste(v.getCpf())){
            System.out.println("Já existe um Cliente com esse CPF");
            return;
        }
        vendedores.add(v);
        System.out.println("Vendedor cadastrado com sucesso!");
    }

    public void excluirVendedor(String cpf){
        for(Vendedor vendedor: vendedores){
            if(cpf.equals(vendedor.getCpf())){
                vendedores.remove(vendedor);
                return;
            }
        }
        System.out.println("Não foi encontrado nenhum vendedor com esse Código/CPF");
        return;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
}
