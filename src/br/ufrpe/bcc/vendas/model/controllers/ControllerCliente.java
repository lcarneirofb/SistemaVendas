package br.ufrpe.bcc.vendas.model.controllers;

import br.ufrpe.bcc.vendas.model.Cliente;

import java.util.ArrayList;

public class ControllerCliente implements java.io.Serializable{
    private ArrayList<Cliente> clientes;

    public ControllerCliente(){
        this.clientes = new ArrayList<Cliente>();
    }

    public boolean clienteExiste(String cpf){
        for(Cliente cliente: clientes){
            if(cpf.equals(cliente.getCpf())){
                return true;
            }
        }
        return false;
    }

    public Cliente procurarCliente(String cpf){
        for(Cliente cliente: clientes){
            if(cpf.equals(cliente.getCpf())){
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }



    public void novoCliente(){
        Cliente c = new Cliente();
        if(clienteExiste(c.getCpf())){
            System.out.println("Já existe um Cliente com esse CPF");
            return;
        }
        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
