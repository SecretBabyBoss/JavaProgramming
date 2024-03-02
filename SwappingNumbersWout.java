public class SwappingNumbersWout {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // swapping numbers without extra variable
        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println(x);
        System.out.println(y);
    }
}
