/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic05.mvc;


public class CalculatorControllerCMD {
    
    private CalculatorViewCMD theView;
    private CalculatorModel theModel;

    public CalculatorControllerCMD(CalculatorViewCMD theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }

    public CalculatorViewCMD getTheView() {
        return theView;
    }

    public void setTheView(CalculatorViewCMD theView) {
        this.theView = theView;
    }

    public CalculatorModel getTheModel() {
        return theModel;
    }

    public void setTheModel(CalculatorModel theModel) {
        this.theModel = theModel;
    }
    
    
    public void calculate(int a, int b){
        theModel.addTwoNumbers(a, b);
        theView.printOperation(a, b, theModel.getCalculationValue());
    }
    
    
}
