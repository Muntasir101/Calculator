public class SimpleCalculator {
    public static void main(String[] args) {
        sum(10,5);
        sub(20,10);
        mul(5,5);
    }
    public static void sum(int a, int b){
        int summation=a+b;
        System.out.println(summation);
    }
    public static void sub(int a, int b){
        int subtraction=a-b;
        System.out.println(subtraction);
    }
    public static void mul(int a, int b){
        int multiply=a*b;
        System.out.println(multiply);
    }

}
