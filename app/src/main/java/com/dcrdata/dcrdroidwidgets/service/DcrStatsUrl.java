package com.dcrdata.dcrdroidwidgets.service;

import java.util.Random;

public class DcrDataUrl {

    private String baseUrl;
    private static final Random RANDOM = new Random();

    public DcrDataUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    private String getNonce() {
        return String.format("%010d", RANDOM.nextInt(Integer.MAX_VALUE));
    }

    @Override
    public String toString() {
        return baseUrl + "/api/v1/get_stats?origin=jamie_holdstocks_app&nonce=" + getNonce();
    }
}
