import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{ "abc","efght","td","jhgfdsa","edff"} ;
        int i, j;
        String temp;
        int n = arr.length;

        System.out.println("The original array "+ Arrays.toString(arr) );

        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                if (arr[j - 1].length() > arr[j].length()) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted array "+ Arrays.toString(arr) );
    }
}