package week_12;

public class ques1 {
    public static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;  
        System.out.println(a + " / " + b + " = " + result);
    }

    public static void main(String[] args) {
       for (int i=4 ; i>-1 ; i--){
           try {
               divide(12,i);
           }
           catch (ArithmeticException e){
               System.out.println("Number cannot be divided by zero");
           }
       }
        System.out.println("Program ended sucessfully");
    }
    
}