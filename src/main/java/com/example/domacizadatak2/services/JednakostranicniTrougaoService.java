package com.example.domacizadatak2.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service

public class JednakostranicniTrougaoService {

    public static final Log LOG = LogFactory.getLog(JednakostranicniTrougaoService.class);
    public void prikaziPodatke(JednakostranicniTrougao jtrougao) {
        LOG.info("Podaci o jednakostranicnom trouglu: O: " + jtrougao.obim()+ " P: " + jtrougao.povrsina());
    }

}