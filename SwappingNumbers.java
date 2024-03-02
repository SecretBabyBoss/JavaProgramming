public class SwappingNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // swapping numbers with extra variable
        int temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
    }
}
