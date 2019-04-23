import model.Model;
import model.fare.FareList;
import model.fare.MoBilFare;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    @Test
    public void testFareList(){
        Model test1 = new Model();
        test1.createFareList();
        Model test2 = new Model();
        test2.createFareList();
        Assert.assertNotEquals(test1,test2);
    }

    @Test
    public void testClientBuilderRandom(){
        Model testFarlist = new Model();
        List<MoBilFare> temp;
        for (int i = 0; i < 1000; i++){
            testFarlist.createFareList();
            temp = testFarlist.findFareClientsLessThen(1);
            Assert.assertEquals(temp.size(), 0);
        }
    }

    @Test
    public void testCreateFareList(){
        Model test = new Model();
        Assert.assertTrue(test.createFareList());
    }
}
