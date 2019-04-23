package model.fare;

import model.client.Client;

import java.util.ArrayList;
import java.util.List;

public abstract class MoBilFare implements Fare {
    private String fareName;
    private List<Client> clientsList;
    private int monthPay;

    public MoBilFare(){

    }

    public MoBilFare(String fareName, int monthPay){
        this.fareName = fareName;

        this.monthPay = monthPay;
    }


    /* Getters */
    public String getFareName() {
        return fareName;
    }

    public double getMonthPay() {
        return monthPay;
    }

    public List<Client> getClientsList() {
        return clientsList;
    }

    /* Setters */

    public void setFareName(String fareName) {
        this.fareName = fareName;
    }

    public void setClientsList(List<Client> clientsList) {
        this.clientsList = clientsList;
    }

    public void setMonthPay(int monthPay) {
        this.monthPay = monthPay;
    }


}
