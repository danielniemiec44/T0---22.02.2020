package com.xdaanielx;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Szescian> szesciany = new ArrayList<Szescian>();
        szesciany.add(new Szescian(5));
        szesciany.add(new Szescian(10));
        szesciany.add(new Szescian(2));

        ArrayList<GraniastoslupPrawidlowyTrojkatny> graniastoslupy = new ArrayList<GraniastoslupPrawidlowyTrojkatny>();
        graniastoslupy.add(new GraniastoslupPrawidlowyTrojkatny(5,7,3));
        graniastoslupy.add(new GraniastoslupPrawidlowyTrojkatny(10, 12, 5));
        graniastoslupy.add(new GraniastoslupPrawidlowyTrojkatny(2, 5, 10));

        for(Szescian szescian : szesciany){
            System.out.println("Objetosc: " + szescian.objetosc());
        }

        for(GraniastoslupPrawidlowyTrojkatny graniastoslup : graniastoslupy){
            System.out.println("Objetosc graniastoslupa: " + graniastoslup.objetosc());
        }
    }
}
