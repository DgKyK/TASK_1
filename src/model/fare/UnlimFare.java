package model.fare;

public class UnlimFare extends MoBilFare {
    private int abroadCallMinutes;

    public UnlimFare(){

    }

    public UnlimFare(String fareName, int monthPay, int abroadCallMinutes){
        super(fareName, monthPay);
        this.abroadCallMinutes = abroadCallMinutes;
    }

    public int getAbroadCallMinutes() {
        return abroadCallMinutes;
    }

    @Override
    public String showInfoByString() {
        return "\n------------\nFare name : " + this.getFareName() +
                "\nNumber of clients : " + this.calculateClients() +
                "\nMonth pay : " + this.getMonthPay() +
                "\nAbroad calls minutes : " + this.abroadCallMinutes;
    }

    @Override
    public int calculateClients() {
        return this.getClientsList().size();
    }

    @Override
    public String toString(){
        return this.showInfoByString();
    }
}
