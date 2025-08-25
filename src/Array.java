import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[] = {7,2,3,8,4,5,6};
        int[] arr1 = {2,3,4,5,6,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,4));
        System.out.println(Arrays.equals(arr,arr1));
//        char[] array = new char[3];
////        int[] arr1 = arr;
////        System.out.println(Arrays.toString(arr1));
////        Arrays.fill(arr, 7);
////        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
//        int[][] arr = {{0,0,1},{0,1},{0}};
//        int[][] arr1 = arr;
//
//        System.out.println(Arrays.equals(arr,arr1));
//        int[][] arr = new int[3][];
//        arr[0] = new int[3];
//        arr[1] = new int[2];
//        arr[2] = new int[3];
//
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 1;
//        arr[1][0] = 2;
//        arr[1][1] = 1;
//        arr[2][0] = 2;
//        arr[2][1] = 1;
//        arr[2][2] = 2;

//        System.out.println(arr[0][1]);
//        for (int i = 0; i< arr.length; i++){
//            for (int j= 0; j<arr[i].length ; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
