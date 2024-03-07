package com.example.domacizadatak2.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service

public class KrugService {

    public static final Log LOG = LogFactory.getLog(KrugService.class);
    public void prikaziPodatke(Krug krug) {
        LOG.info("Podaci o krugu: O: " + krug.obim()+ " P: " + krug.povrsina());
    }

}