package controller;

import model.fare.FareList;
import model.Model;
import view.View;

/**
 *
 * @author Alex Tokarenko
 * @version 1.0
 */
public class Controller {
    private Model model;
    private View view;
    private FareList fareList;


    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void startAction(){
        view.printMessage(View.bundle.getString(GlobalConstants.HELLO_MESSAGE));
        model.createFareList();
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.THERE_IS_RANDOM_LIST),
                                            model.getFareList().toString()));
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.TOTAL_NUMBER_CLIENTS),
                                            String.valueOf(model.calculateAllPeople())));
        model.sortByMonthPay();
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.SORTED_BY_PAYMENT),
                                            model.getFareList().toString()));
        view.printMessage(model.findFareClientsLessThen(10).toString());
        view.printMessage(view.stringConcat(View.bundle.getString(GlobalConstants.BYE_MESSAGE)));
    }
}
