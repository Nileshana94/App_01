package com.appdevelopment.demo;

public class Namal implements Mahinda {

    private IMFService imfService;

    public Namal(IMFService imfService) {
        this.imfService = imfService;
    }

    public String steal(){
        return "Namal Steal $5000";
    }

    @Override
    public String planningLoan() {
        return imfService.askingMoney();
    }
}
