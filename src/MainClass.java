import controller.Controller;
import model.Model;
import view.View;

public class MainClass {
    public static void main(String[] args){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.startAction();
    }
}
