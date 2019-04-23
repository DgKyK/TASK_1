package model.fare;

public class FeelFreeFare extends MoBilFare {
    private int megabytesOfInternet;

    public FeelFreeFare(String fareName, int monthPay, int megabytesOfInternet) {
        super(fareName,monthPay);
        this.megabytesOfInternet = megabytesOfInternet;
    }

    public double getMegabytesOfInternet() {
        return megabytesOfInternet;
    }

    @Override
    public String showInfoByString() {
        return "\n------------\nFare name : " + this.getFareName() +
                "\nNumber of clients : " + this.calculateClients() +
                "\nMonth pay : " + this.getMonthPay() +
                "\nMegabytes of internet : " + this.getMegabytesOfInternet();
    }

    @Override
    public int calculateClients() {
        return this.getClientsList().size();
    }

    @Override
    public String toString() {
        return this.showInfoByString();
    }
}
