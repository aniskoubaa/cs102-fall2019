package topic04.genericclasses;


public class GenericClass {
    
    
    public static void main(String []args){
        
        Pair<Integer, String> pair = new Pair<Integer, String>(100,"Anis");
        Pair<Double,Double> pair2 = new Pair<Double,Double>(1.9,6.8);
        
        Pair <String, String> strPair = new Pair<String,String>("AB", "CH");
        
        System.out.println(strPair.getKey());
        System.out.println(strPair.getValue());
        
        
    }
    
}
