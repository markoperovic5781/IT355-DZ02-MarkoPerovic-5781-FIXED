package com.example.domacizadatak2.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service

public class KvadratService {

    public static final Log LOG = LogFactory.getLog(KvadratService.class);
    public void prikaziPodatke(Kvadrat kvadrat) {
        LOG.info("Podaci o kvadratu: O: " + kvadrat.obim()+ " P: " + kvadrat.povrsina());
    }

}
