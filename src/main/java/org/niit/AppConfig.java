package org.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("m1")
    public Movie getMovie1(){
        return new Movie(101,"Bhool Bulaiyaa",2022,2.50,"Kartik Aryan","Kiara Advani","Horror Comedy ");

    }
    @Bean("m2")
    public Movie getMovie2(){
        return new Movie(201,"Student of the year",2015,2.15,"Shiddhart malhotara","alia bhatt","romantic");

    }
    @Bean("m3")
    public Movie getmovie3(){
        return new Movie(301,"Rocketry:The Nambi Effect",2022,2.37,"R madhavan","","Dram/action");
    }
}
