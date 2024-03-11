public class SearchElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,8,9,11,12};
        int element = 11; // element to find out
        int count=0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element) {
                count=i;
            }
        }
        if (count>0) {
            System.out.println(element+" found at "+count);
        } else {
            System.out.println(element+" not found");
        }
    }
}
