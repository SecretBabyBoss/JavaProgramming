public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int temp = num; // take a back up of the number
        int rev = 0; // is used to stored reversed num
      
        while (num > 0) {
      
          int lastDigit = num % 10;
          rev = rev * 10 + lastDigit;
          num = num / 10;
        }

        if (rev==temp) {
            System.out.println(temp+" is palindrome number");
        } else {
            System.out.println(temp+" is not palindrome number");
        }
    }
}