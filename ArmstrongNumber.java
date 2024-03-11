public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num; // take back up of the number
        int result=0; // to store result number

        while (num>0) {
            int lastDigit=num % 10;
            result = lastDigit*lastDigit*lastDigit + result;
            num = num / 10;
        }

        if (result==temp) {
            System.out.println(temp+" is Armstrong Number");
        } else {
            System.out.println(temp+" is not Armstrong Number");
        }
        
    }
}
