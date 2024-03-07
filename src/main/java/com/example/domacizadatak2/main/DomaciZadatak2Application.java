package com.example.domacizadatak2.main;

import com.example.domacizadatak2.AppConfiguration;
import com.example.domacizadatak2.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class DomaciZadatak2Application {

    public static void main(String[] args) {
        SpringApplication.run(DomaciZadatak2Application.class, args);


        // Unos podataka moze da se uradi i Scanner-om
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite stranicu/poluprecnik figure");
        int vrednost = sc.nextInt();

        ApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfiguration.class);
        System.out.println("----------");
        KrugService krugService = (KrugService) context.getBean("krugService");
        krugService.prikaziPodatke(new

                Krug(vrednost));

        System.out.println("----------");
        KvadratService kvadratService = (KvadratService) context.getBean("kvadratService");
        kvadratService.prikaziPodatke(new

                Kvadrat(vrednost));

        System.out.println("----------");
        JednakostranicniTrougaoService jednakostranicniTrougaoService = (JednakostranicniTrougaoService) context.getBean("jednakostranicniTrougaoService");
        jednakostranicniTrougaoService.prikaziPodatke(new

                JednakostranicniTrougao(vrednost));

    }
}
