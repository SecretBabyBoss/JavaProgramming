public class BiggestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,9,11,23,8};
        int big = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>big) {
                big = arr[i];
            }
        }
        System.out.println("Biggest element in an array is "+big);
    }
}
