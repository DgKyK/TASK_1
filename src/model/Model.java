package model;

import DB.DBFare;
import controller.GlobalConstants;
import model.client.ClientBuilder;
import model.fare.FareList;
import model.fare.FeelFreeFare;
import model.fare.MoBilFare;
import view.View;

import java.util.ArrayList;
import java.util.List;

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
        int result = 0;
        for(MoBilFare current : fareList.getFareList()){
            result += current.calculateClients();
        }
        return result;
    }

    public List<MoBilFare> findFareClientsLessThen(int numberOfClient){
       /* view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.FIND_FARE),
                String.valueOf(numberOfClient)));*/
        List<MoBilFare> result = new ArrayList<>();
        for(int i = 0; i < fareList.getFareList().size(); i++){
            if(numberOfClient > fareList.getFareList().get(i).calculateClients()){
                result.add(fareList.getFareList().get(i));
            }
        }
        return result;
    }

    public void sortByMonthPay(){
        fareList.getFareList().sort(((o1, o2) -> (int)(o1.getMonthPay() - o2.getMonthPay())));
    }

    public FareList getFareList() {
        return fareList;
    }
}
