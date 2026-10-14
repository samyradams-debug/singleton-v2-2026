package com.senai.singleton;

import java.util.ArrayList;

public class Singleton {

    private static Singleton instancia ;
    public ArrayList<Carro> carros = new ArrayList<>();

    private Singleton(){

    }
    public static Singleton getInstancia(){
        if(instancia == null ){
            instancia = new Singleton( );
        }
        return instancia;
    }
}
