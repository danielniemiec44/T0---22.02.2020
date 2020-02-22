package com.xdaanielx;

public class GraniastoslupPrawidlowyTrojkatny extends Figura implements Podstawa {
    protected double a;
    protected double hTrojkata;



    GraniastoslupPrawidlowyTrojkatny(double a, double hTrojkata, double h){
        this.h = h;
        this.a = a;
        this.hTrojkata = hTrojkata;
    }


    public void obliczPolePodstawy(){
        this.podstawa = (a*hTrojkata)/2;
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
