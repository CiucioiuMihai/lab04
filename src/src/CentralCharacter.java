package src;

public class CentralCharacter {
    public static void getTheMid(String word){
        if(word.length()%2 == 0){
            int pozition1 = word.length()/2-1;
            int pozition2 = word.length()/2;
            String result =String.valueOf(word.charAt(pozition1)) + String.valueOf(word.charAt(pozition2)) ;
            System.out.println(result);
        }
        else{
            int pozition = word.length()/2;
            String result = String.valueOf(word.charAt(pozition));
            System.out.println(result);
        }
    }
    public static void main(String[] args){
        getTheMid("dog");
    }
}
