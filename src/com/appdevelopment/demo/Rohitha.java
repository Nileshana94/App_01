package com.appdevelopment.demo;


public class Rohitha implements Mahinda{

    private IMFService imfService;

    public Rohitha(IMFService imfService) {
        this.imfService = imfService;
    }

    public String steal(){
        return "Rohitha Steal $70000";
    }


    @Override
    public String planningLoan() {
        return imfService.askingMoney();
    }
}
