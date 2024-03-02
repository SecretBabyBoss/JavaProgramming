public class Fibonacci {
    public static void main(String[] args) {
        int fno = 0; //first number
        int sno = 1; //second number
        System.out.println(fno);
        System.out.println(sno);

        int result = fno+sno;

        // keep printing fibonacci series until it reaches 100
        while (result<100) {
            System.out.println(result);

            fno=sno;
            sno=result;
            result=fno+sno;
        }

    }
}
