package Model.Client;

import java.util.ArrayList;
import java.util.Random;

public class ClientBuilder {

    public ArrayList<Client> buildRandomClientList(){
        ArrayList<Client> resultClientList = new ArrayList<>();
        Random random = new Random();
        Client temp;
        for(int i = 0; i < random.nextInt(100) + 5; i++){
            temp = new Client();
            resultClientList.add(temp);
        }
        return resultClientList;
    }
}
