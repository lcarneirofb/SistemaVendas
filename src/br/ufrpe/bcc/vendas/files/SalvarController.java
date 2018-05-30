package br.ufrpe.bcc.vendas.files;

import br.ufrpe.bcc.vendas.controller.Controller;

import java.io.*;

public class SalvarController {

    public void salvarController(Controller controller){
        String fileName = "controle.txt";
        FileOutputStream arq = null;
        try {
            arq = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(arq);
            out.writeObject(controller);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public Controller lerController(){
        String fileName = "controle.txt";
        FileInputStream arq = null;
        try {
            arq = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(arq);
            Controller controller= (Controller) in.readObject();
            in.close();
            return controller;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
