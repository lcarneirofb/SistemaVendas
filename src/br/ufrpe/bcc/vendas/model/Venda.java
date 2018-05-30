package br.ufrpe.bcc.vendas.model;

import br.ufrpe.bcc.vendas.model.controllers.ControllerCliente;
import br.ufrpe.bcc.vendas.model.controllers.ControllerProduto;
import br.ufrpe.bcc.vendas.model.controllers.ControllerVendedor;

import java.util.*;


public class Venda implements java.io.Serializable{
    private Date dataDaVenda;
    private Produto produto;
    private int quantidade;
    private Cliente cliente;
    private Vendedor vendedor;

    public Venda(ControllerProduto produtos, ControllerCliente clientes, ControllerVendedor vendedores){
        Scanner scanner = new Scanner(System.in);
        dataDaVenda= new Date();
        System.out.println("Digite o Código do Produto:");
        this.produto = produtos.procurarProduto(scanner.nextLine());
        if(produto.equals(null)){
            return;
        }
        System.out.println("Digite o CPF/CNPJ do Cliente:");
        this.cliente = clientes.procurarCliente(scanner.nextLine());
        if(cliente.equals(null)){
            return;
        }
        System.out.println("Código do Vendedor:");
        this.vendedor = vendedores.procurarVendedor(scanner.nextLine());
        if(vendedor.equals(null)){
            return ;
        }
        System.out.println("Quantidade: \t\tEstoque Atual:\t"+this.produto.getEstoqueAtual());
        this.quantidade = scanner.nextInt();
        while(this.quantidade > produto.getEstoqueAtual()){
            System.out.println("Tente novamente!");
            this.quantidade = scanner.nextInt();
        }
    }


    @Override
    public String toString() {
        return "Venda{" +
                "dataDaVenda=" + dataDaVenda +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return quantidade == venda.quantidade &&
                Objects.equals(dataDaVenda, venda.dataDaVenda) &&
                Objects.equals(produto, venda.produto) &&
                Objects.equals(cliente, venda.cliente) &&
                Objects.equals(vendedor, venda.vendedor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dataDaVenda, produto, quantidade, cliente, vendedor);
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
