package topic06.jcf;


public class WordCount {

    public static void main(String []args){
        
        
        String statement = "CS102 is a good course. I like the CS102 course.";
        
        statement = statement.replaceAll("[^a-zA-Z0-9\\s]", "");
        
        System.out.println(statement);
        String [] words = statement.split(" ");
        
        //make a program that counts how many words appear in this sentence
        
        /*
        CS102 -> 2
        is -> 1
        a -> 1
        good -> 1
        course -> 2
        */
        
        
        
    }
    
}
