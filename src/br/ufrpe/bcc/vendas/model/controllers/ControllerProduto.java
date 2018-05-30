package br.ufrpe.bcc.vendas.model.controllers;

import br.ufrpe.bcc.vendas.model.Produto;

import java.util.ArrayList;

public class ControllerProduto implements java.io.Serializable{
    private ArrayList<Produto> produtos;

    public ControllerProduto(){
        this.produtos = new ArrayList<>();
    }

    public boolean produtoExiste(String codigo){
        for(Produto produto: produtos){
            if(codigo.equals(produto.getCodigo())){
                return true;
            }
        }
        return false;
    }

    public Produto procurarProduto(String codigo){
        for(Produto produto: produtos){
            if(codigo.equals(produto.getCodigo())){
                return produto;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    public void novoProduto(){
        Produto p = new Produto();
        if(produtoExiste(p.getCodigo())){
            System.out.println("Esse produto já está cadastrado");
            return;
        }
        produtos.add(p);
        System.out.println("Produto cadastrado com sucesso!");
        return;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

}
