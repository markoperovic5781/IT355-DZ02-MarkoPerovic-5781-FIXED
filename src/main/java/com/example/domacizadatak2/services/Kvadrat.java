package com.example.domacizadatak2.services;

import com.example.domacizadatak2.Oblik;

import static java.lang.Math.sqrt;

public class Kvadrat implements Oblik {

    int stranica;

    public void setStranica(int stranica) {
        this.stranica = stranica;
    }

    public int getStranica() {
        return stranica;
    }

    public Kvadrat(int stranica) {
        this.stranica = stranica;
    }

    @Override
    public float obim() {

        int i = stranica * 4;
        return i;

    }

    @Override
    public float povrsina() {

        return stranica*stranica;
    }
}
