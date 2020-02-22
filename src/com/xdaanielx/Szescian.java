package com.xdaanielx;

public class Szescian extends Figura implements Podstawa {
    protected double a;


    Szescian(double a){
        this.h = a;
        this.a = a;
    }


    public void obliczPolePodstawy(){
        this.podstawa = a*a;
    }

    void obliczObjetosc(){
        obliczPolePodstawy();
        this.objetosc = this.podstawa * h;
    }

    double objetosc(){
        obliczObjetosc();
        return this.objetosc;
    }
}
