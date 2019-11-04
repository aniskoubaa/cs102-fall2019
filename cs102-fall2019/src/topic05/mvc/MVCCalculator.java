package topic05.mvc;

public class MVCCalculator {
    
    public static void main(String[] args) {
        
        CalculatorModel theModel = new CalculatorModel();
    	//CalculatorView theView = new CalculatorView();
        //CalculatorController theController = new CalculatorController(theView,theModel);
        //theView.setVisible(true);
        
        CalculatorViewCMD theView = new CalculatorViewCMD();
        CalculatorControllerCMD theController = new CalculatorControllerCMD(theView,theModel);
        
        theController.calculate(3, 5);
    }
}
