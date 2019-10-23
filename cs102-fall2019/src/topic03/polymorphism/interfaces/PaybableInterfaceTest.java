
package topic03.polymorphism.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class PaybableInterfaceTest {
    public static void main(String [] args){
        //delcare an array of Payable objects (generic container)
        Payable [] payableObjects = new Payable [4];
        ArrayList<Payable> payables = new ArrayList<Payable>();
        
        //create the objects with concrete classes
        Invoice invoice01 = new Invoice ("01234", "seat", 2, 375.00);
        payableObjects[0]= invoice01;
        payableObjects[1]= new Invoice ("56789", "tire", 4, 85.00);
        payableObjects[2]= new SalariedEmployee ("Mohamed", "Ali", "111-11-1111", 100.00);
        payableObjects[3]= new SalariedEmployee ("Ahmed", "Saleh", "222-13-1141", 200.00);
        
        
        payables.add(new Invoice ("01234", "seat", 2, 375.00));
        payables.add(new SalariedEmployee ("Mohamed", "Ali", "111-11-1111", 100.00));
        
        for (int i=0;i<payableObjects.length;i++){
            System.out.printf("payment : %.2f\n", payableObjects[i].getPayment());
            //
            payableObjects[i].print();
            if (payableObjects[i] instanceof Employee){
                System.out.println(((Employee)payableObjects[i]).getFirstName());

            }
            
        }
        
        
        
       
    }
}

/*
 List <Payable> payableList = new ArrayList<Payable>();
        //payableList.add( payableObjects[0]);
        //payableList.add( payableObjects[1]);
        //payableList.add( payableObjects[2]);
        //payableList.add( payableObjects[3]);
        
        //converts a array to a list
        payableList = Arrays.asList(payableObjects);
        
        System.out.printf("payableList: \n%s\n", payableList);
        //Collections.sort(payableList);
        System.out.printf("payableList: \n%s\n", payableList);
        
        System.out.println("Invoices and Employees processed using polymorphism:\n");
        
        //enhanced for statement
        for (Payable currentPayable : payableObjects){
            //print the payable object and its payable amount
            System.out.printf("%s %s %.2f\n\n", currentPayable.toString(), " payment due ", currentPayable.getPayment());
        }
        
        
        //System.out.println(invoices);
        
        //Collections.sort(invoices);
        
        //System.out.println(invoices);
        
        ArrayList<Employee> semps = new ArrayList<Employee>();
        semps.add(new SalariedEmployee ("Mohamed", "Ali", "111-11-1111", 100.00));
        semps.add(new SalariedEmployee ("Salah", "Hamdi", "222-11-1111", 300.00));
        semps.add(new SalariedEmployee ("Salah", "Samir", "333-11-1111", 600.00));
        semps.add(new SalariedEmployee ("Ali", "Hamed", "444-11-1111", 200.00));
        
        for (Employee se : semps)
            System.out.printf("%s %s (%.2f)\n", se.getFirstName(), se.getLastName(), se.getPayment());
        //Collections.sort(semps);
        System.out.println("\n\n");
        for (Employee se : semps)
            System.out.printf("%s %s (%.2f)\n", se.getFirstName(), se.getLastName(), se.getPayment());
    
*/
