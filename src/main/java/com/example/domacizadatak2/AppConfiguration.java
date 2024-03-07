package com.example.domacizadatak2;
import com.example.domacizadatak2.services.JednakostranicniTrougaoService;
import com.example.domacizadatak2.services.KrugService;
import com.example.domacizadatak2.services.KvadratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.domacizadatak2.services"})
public class AppConfiguration {

    @Autowired
    private KrugService krugService;
    @Bean
    public KrugService getKrugServis() {
        return krugService;
    }

    @Autowired
    private KvadratService kvadratService;
    @Bean
    public KvadratService getKvadrateServis() {
        return kvadratService;
    }

    @Autowired
    private JednakostranicniTrougaoService jednakostranicniTrougaoService;
    @Bean
    public JednakostranicniTrougaoService getJednakostranicniTrougaoServis() {
        return jednakostranicniTrougaoService;
    }





}
