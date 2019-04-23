package model.fare;

import controller.GlobalConstants;
import DB.DBFare;
import model.client.ClientBuilder;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class FareList {
    private View view;
    private ArrayList<MoBilFare> fareList;

    public FareList(){
        view = new View();
        fareList = new ArrayList<>();

    }

    public FareList(ArrayList<MoBilFare> fareList){
        this.fareList = fareList;
    }

    public void addFare(MoBilFare anotherFare){
        fareList.add(anotherFare);
    }

    public void removeFare(MoBilFare fareToDelete){
        fareList.remove(fareToDelete);
    }

    public boolean createFareList(){
        MoBilFare temp ;
        ClientBuilder clientBuilder = new ClientBuilder();
        for(DBFare currentFare : DBFare.values()){
            temp = new FeelFreeFare(currentFare.getFareName(),
                    currentFare.getMonthPay(),
                    currentFare.getExclusiveOption());
            temp.setClientsList(clientBuilder.buildRandomClientList());
            this.addFare(temp);
        }
        return true;
    }

    public int calculateAllPeople(){
        int result = 0;
        for(MoBilFare current : fareList){
            result += current.calculateClients();
        }
        return result;
    }

    public List<MoBilFare> findFareClientsLessThen(int numberOfClient){
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.FIND_FARE),
                                            String.valueOf(numberOfClient)));
        List<MoBilFare> result = new ArrayList<>();
        for(int i = 0; i < this.fareList.size(); i++){
            if(numberOfClient >= fareList.get(i).calculateClients()){
                result.add(fareList.get(i));
            }
        }
        return result;
    }

    public void sortByMonthPay(){
        this.fareList.sort(((o1, o2) -> (int)(o1.getMonthPay() - o2.getMonthPay())));
    }
    @Override
    public String toString(){
        return "{" + "FareList : \n" + fareList + "}";
    }
}
