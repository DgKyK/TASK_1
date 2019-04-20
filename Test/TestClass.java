import Model.FareEntity.FareList;
import Model.FareEntity.MoBilFare;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestClass {
    @Test
    public void testFareList(){
        FareList test1 = new FareList();
        test1.createFareList();
        FareList test2 = new FareList();
        test2.createFareList();
        Assert.assertNotEquals(test1,test2);
    }

    @Test
    public void testClientBuilderRandom(){
        FareList testFarlist = new FareList();
        ArrayList<MoBilFare> temp;
        for (int i = 0; i < 1000; i++){
            testFarlist.createFareList();
            temp = testFarlist.findFareClientsLessThen(1);
            Assert.assertEquals(temp.size(), 0);
        }
    }
}
