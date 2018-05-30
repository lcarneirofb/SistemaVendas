package br.ufrpe.bcc.vendas.view;

import br.ufrpe.bcc.vendas.model.*;

import java.util.ArrayList;

public class View implements java.io.Serializable{

    public static void mostrarMenu(){
        System.out.println("-----------------------------");
        System.out.println("----- Sistema de Vendas -----");
        System.out.println("-----------------------------");
        System.out.println("(1) -\tCadastrar Cliente;\n{2} -\tListar Clientes;\n{3) -\tCadastrar Vendedor;" +
                "\n(4) -\tListar Vendedores;\n(5) -\tCadastrar Produto;\n(6) -\tListar Produtos;\n" +
                "(7) -\tRegistrar Venda;\n(8) -\tRelatorio de Vendas;\n(9) -\tSair e Salvar.");
    }

    public void listarClientes(ArrayList<Cliente> clientes){
        System.out.println("-----------------------------");
        System.out.println("----- Sistema de Vendas -----");
        System.out.println("---------- CLIENTES ---------");
        System.out.println("-----------------------------");

        for (Cliente cliente : clientes) {
            System.out.println("Nome: \t" + cliente.getNome());
            System.out.println("Email: \t" + cliente.getEmail());
            System.out.println("Telefone: \t" + cliente.getTelefone());
            System.out.println("Endereço: \t" + cliente.getEndereco());
            System.out.println("CPF: \t" + cliente.getCpf());
            System.out.println("Limite de Credito: \t" + cliente.getLimiteCartao());
            System.out.println("-----------------------------");
        }
    }

    public void listarVendedores(ArrayList<Vendedor> vendedores){
        System.out.println("-----------------------------");
        System.out.println("----- Sistema de Vendas -----");
        System.out.println("--------- VENDEDORES --------");
        System.out.println("-----------------------------");
        for(Vendedor vendedor: vendedores){
            System.out.println("Nome: \t" + vendedor.getNome());
            System.out.println("Email: \t" + vendedor.getEmail());
            System.out.println("Telefone: \t" + vendedor.getTelefone());
            System.out.println("Endereço: \t" + vendedor.getEndereco());
            System.out.println("CPF: \t" + vendedor.getCpf());
            System.out.println("Código: \t" + vendedor.getCodigo());
            System.out.println("-----------------------------");
        }
    }

    public void listarProdutos(ArrayList<Produto> produtos){
        System.out.println("-----------------------------");
        System.out.println("----- Sistema de Vendas -----");
        System.out.println("--------- PRODUTOS ----------");
        System.out.println("-----------------------------");

        for(Produto produto: produtos){
            System.out.println("Nome do Produto: \t" + produto.getNome());
            System.out.println("Preço: \t" + produto.getPreco());
            System.out.println("Peso:: \t" + produto.getPeso());
            System.out.println("Estoque Atual: \t" + produto.getEstoqueAtual());
            System.out.println("-----------------------------");
        }
    }

    public void relatorioVendas(ArrayList<Venda> vendas){
        System.out.println("-----------------------------");
        System.out.println("----- Sistema de Vendas -----");
        System.out.println("---- Relatório de Vendas ----");
        System.out.println("-----------------------------");
        for(Venda venda: vendas){
            System.out.println("Cliente: \t" +venda.getCliente().getNome());
            System.out.println("Produto: \t" + venda.getProduto().getNome() + "\tQuantidade: \t" + venda.getQuantidade());
            System.out.println("Data: \t" + venda.getDataDaVenda());
            System.out.println("-----------------------------");
        }
    }
}
