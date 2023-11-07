package src;

public class SumOfDigit {
    public static int sum(int number){
        int digitSum = 0;
        while(number != 0){
            digitSum = digitSum + number%10;
            number = number/10;
        }
        return digitSum;
    }
    public static void main(String[] args){
        int result = sum(254);
        System.out.print(result);
    }
}
