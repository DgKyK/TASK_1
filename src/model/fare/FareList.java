package model.fare;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class FareList {
    private View view;
    private List<MoBilFare> fareList;

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

    public List<MoBilFare> getFareList() {
        return fareList;
    }

    @Override
    public String toString(){
        return "{" + "FareList : \n" + fareList + "}";
    }
}
