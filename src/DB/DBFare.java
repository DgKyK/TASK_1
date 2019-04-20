package DB;

public enum DBFare {
    FARE_SUPER_MEN("SuperMen",500,150, 100),
    FARE_FEEL_FREE("FeelFree",1000,80, 4000),
    FARE_UNLIM("Unlim", 5000, 125, 300);

    private final String fareName;
    private final int numberOfClients;
    private final int monthPay;
    private final int exclusiveOption;



    DBFare(String fareName, int numberOfClients, int monthPay, int exclusiveOption){
        this.fareName = fareName;
        this.numberOfClients = numberOfClients;
        this.monthPay = monthPay;
        this.exclusiveOption = exclusiveOption;
    }

    public String getFareName() {
        return fareName;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public int getMonthPay() {
        return monthPay;
    }

    public int getExclusiveOption(){
        return exclusiveOption;
    }
}
