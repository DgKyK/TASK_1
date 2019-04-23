package model;

import DB.DBFare;
import model.client.ClientBuilder;
import model.fare.FareList;
import model.fare.FeelFreeFare;
import model.fare.MoBilFare;

import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private FareList fareList;

    public Model(){
        fareList = new FareList();
    }

    public boolean createFareList(){
        MoBilFare temp ;
        ClientBuilder clientBuilder = new ClientBuilder();
        for(DBFare currentFare : DBFare.values()){
            temp = new FeelFreeFare(currentFare.getFareName(),
                    currentFare.getMonthPay(),
                    currentFare.getExclusiveOption());
            temp.setClientsList(clientBuilder.buildRandomClientList());
            fareList.addFare(temp);
        }
        return true;
    }

    public int calculateAllPeople(){
        return fareList.getFareList().stream().map( x -> x.getClientsList().size()).mapToInt(Integer::intValue).sum();
    }

    public List<MoBilFare> findFareClientsLessThen(int numberOfClient){
        return fareList.getFareList().stream().filter( x -> x.calculateClients() < numberOfClient).collect(Collectors.toList());
    }

    public List<MoBilFare> sortByMonthPay(){
        return fareList.getFareList().stream().sorted((o1, o2) -> (int)(o1.getMonthPay() - o2.getMonthPay())).collect(Collectors.toList());
    }

    public FareList getFareList() {
        return fareList;
    }
}
