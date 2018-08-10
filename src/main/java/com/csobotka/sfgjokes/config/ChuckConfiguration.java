package com.csobotka.sfgjokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
