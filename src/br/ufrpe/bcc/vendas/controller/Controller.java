package br.ufrpe.bcc.vendas.controller;

import br.ufrpe.bcc.vendas.files.SalvarController;
import br.ufrpe.bcc.vendas.model.*;
import br.ufrpe.bcc.vendas.model.controllers.ControllerCliente;
import br.ufrpe.bcc.vendas.model.controllers.ControllerProduto;
import br.ufrpe.bcc.vendas.model.controllers.ControllerVendedor;
import br.ufrpe.bcc.vendas.view.View;

import java.io.*;
import java.util.*;


public class Controller implements java.io.Serializable{
    private View view;
    private ControllerCliente clientes;
    private ControllerVendedor vendedores;
    private ControllerProduto produtos;
    private ArrayList<Venda> vendas;


    public Controller(){
        this.view = new View();
        this.clientes = new ControllerCliente();
        this.vendedores = new ControllerVendedor();
        this.produtos = new ControllerProduto();
        this.vendas = new ArrayList<>();
    }

    public void rodar(){
        int escolha = 0;
        while(escolha != 9) {
            this.view.mostrarMenu();
            Scanner scanner = new Scanner(System.in);
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1: {
                    this.clientes.novoCliente();
                    break;
                }
                case 2: {
                    this.view.listarClientes(clientes.getClientes());
                    break;
                }
                case 3:{
                    this.vendedores.novoVendedor();
                    break;
                }
                case 4:{
                    this.view.listarVendedores(vendedores.getVendedores());
                    break;
                }
                case 5:{
                    this.produtos.novoProduto();
                    break;
                }
                case 6:{
                    this.view.listarProdutos(produtos.getProdutos());
                    break;
                }
                case 7:{
                    Venda v = new Venda(produtos,clientes,vendedores);
                    if(!(v.getVendedor().equals(null) && v.getCliente().equals(null) && v.getProduto().equals(null))){
                        this.vendas.add(v);
                        break;
                    }
                    System.out.println("A venda não pôde ser registrada!");
                    break;
                }
                case 8:{
                    this.view.relatorioVendas(vendas);
                    break;
                }
                case 9:{
                    SalvarController out = new SalvarController();
                    out.salvarController(this);
                    return;
                }

            }
        }
    }
}
