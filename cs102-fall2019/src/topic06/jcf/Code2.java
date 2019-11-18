public class Code2 {
    public static void main(String[] args) {
        String statement = "CS102 is a good course. I like the CS102 course.";
       
        statement = statement.trim();
       
        System.out.println(statement);
       
        String[] words = statement.split(" ");

//make a program the counts how many words in the sentence
       
        /* Expected output:
        CS102 = 2
        is = 1
        good = 1
        course = 2
        ...
        */
       
        int count = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(words[i].equals(words[j]) && i!=0){
                    count++;
                }
            }
           
            for(int k = i; k >= 0; k--){
                if(!words[k].equals(words[i])){
                    System.out.println(words[i]+"="+count);
                    count = 0;
                    break;
                }
            }
           
        }
    }
}
