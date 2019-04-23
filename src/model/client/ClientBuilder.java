package model.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClientBuilder {

    public List<Client> buildRandomClientList(){
        List<Client> resultClientList = new ArrayList<>();
        Random random = new Random();
        Client temp;
        for(int i = 0; i < random.nextInt(100) + 5; i++){
            temp = new Client();
            resultClientList.add(temp);
        }
        return resultClientList;
    }
}
