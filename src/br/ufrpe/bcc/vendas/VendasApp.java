package br.ufrpe.bcc.vendas;

import br.ufrpe.bcc.vendas.controller.Controller;
import br.ufrpe.bcc.vendas.files.SalvarController;

public class VendasApp implements java.io.Serializable{

    public static void main(String[] args) {

        SalvarController in = new SalvarController();
        Controller principal = null;
        if(in.lerController().equals(null)){
            principal = new Controller();
        }
        else{
            principal = in.lerController();
        }

        principal.rodar();
    }
}
