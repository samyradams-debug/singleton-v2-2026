package com.senai.singleton;

public class Launcher {
    public static void main(String[] args) {

       // Application.launch(HelloApplication.class, args);
        Carro c1 = new Carro("prata", "Civic EX Manual Vtec","honda", 1999);
        Carro c2 = new Carro("preto", "VW Beattle TSI EA888","Volkswagen",2013);
        Carro c3 = new Carro( " Laranja","787B", "Mazda", 2008);
        Singleton.getInstancia().carros.add(c1);
        Singleton.getInstancia().carros.add(c2);
        Singleton.getInstancia().carros.add(c3);

        for (Carro c :  Singleton.getInstancia().carros){
            System.out.println(c.getModelo());
        }
        Teste Teste = new Teste();
        com.senai.singleton.Teste.testar();    }
}
