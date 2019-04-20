package Model.FareEntity;

import Model.Client.Client;

import java.util.ArrayList;

public abstract class MoBilFare implements Fare {
    private String fareName;
    private ArrayList<Client> clientsList;
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

    public ArrayList<Client> getClientsList() {
        return clientsList;
    }

    /* Setters */

    public void setFareName(String fareName) {
        this.fareName = fareName;
    }

    public void setClientsList(ArrayList<Client> clientsList) {
        this.clientsList = clientsList;
    }

    public void setMonthPay(int monthPay) {
        this.monthPay = monthPay;
    }


}
