package Model.FareEntity;

public class SuperMenFare extends MoBilFare {
    private int numberOfSms;

    public SuperMenFare(){

    }

    public SuperMenFare(String fareName, int monthPay, int numberOfSms){
        super(fareName, monthPay);
        this.numberOfSms = numberOfSms;
    }

    public int getNumberOfSms() {
        return numberOfSms;
    }

    @Override
    public String showInfoByString() {
        return "\n------------\nFare name : " + this.getFareName() +
                "\nNumber of clients : " + this.calculateClients() +
                "\nMonth pay : " + this.getMonthPay() +
                "\nNumber of SMS : " + this.getNumberOfSms();
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
