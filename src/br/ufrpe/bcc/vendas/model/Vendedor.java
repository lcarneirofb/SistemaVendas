package br.ufrpe.bcc.vendas.model;

import java.util.Objects;

public class Vendedor extends PessoaFisica implements java.io.Serializable{
    private String codigo;

    public Vendedor() {
        super();
        this.setCodigo(getCpf());
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() + ", " +
                "codigo='" + codigo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vendedor vendedor = (Vendedor) o;
        return Objects.equals(codigo, vendedor.codigo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
