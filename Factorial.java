public class Factorial {
    public static void main(String[] args) {
        int x=5; // let's find factorial of 5
        int result = 1 ; // for storing result

        for (int i = x; i > 1; i--) {
            result = result * i;
        }

        System.out.println("factorial of "+x+" is "+result);
    }
}
