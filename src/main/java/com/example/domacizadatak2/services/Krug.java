package com.example.domacizadatak2.services;

import com.example.domacizadatak2.Oblik;

import static java.lang.Math.sqrt;

public class Krug implements Oblik {

    int poluprecnik;

    public void setPoluprecnik(int poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public int getPoluprecnik() {
        return poluprecnik;
    }

    public Krug(int poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    @Override
    public float obim() {

        float i = (float) (2*poluprecnik*Math.PI);
        return i;

    }

    @Override
    public float povrsina() {

        return (float) ((float) poluprecnik*poluprecnik*Math.PI);
    }
}
