package Controller;

import Model.FareEntity.FareList;
import Model.Model;
import View.View;

public class Controller {
    Model model;
    View view;
    FareList fareList;


    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        this.fareList = new FareList();
    }

    public void startAction(){
        view.printMessage(View.bundle.getString(GlobalConstants.HELLO_MESSAGE));
        fareList.createFareList();
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.THERE_IS_RANDOM_LIST),
                                            fareList.toString()));
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.TOTAL_NUMBER_CLIENTS),
                                            String.valueOf(fareList.calculateAllPeople())));
        fareList.sortByMonthPay();
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.SORTED_BY_PAYMENT),
                                            fareList.toString()));
        System.out.println(fareList.findFareClientsLessThen(10));
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.BYE_MESSAGE)));



    }

    /* Help methods */

}