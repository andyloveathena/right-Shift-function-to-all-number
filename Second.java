import java.util.ArrayList;

public class Second {
    // %餘數
    // /整數

    public static int[] rightShift(int[] arr,int n){
        for(int k=0;k<n;k++){
            rightShiftonce(arr);
        }
        return arr;




    }

    public static void rightShiftonce(int [] arr) {
        int lastelement = arr[arr.length-1];
        for(int i =arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];


        }
        arr[0]=lastelement;


    }


    public static void main(String[] args) {
        int[] newArr = rightShift(new int[]{4, 21, 4, 3, 6, 7, 12, 43, 11, 233}, 1);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==========================");
        int[] newArr2 = rightShift(new int[]{4, 21, 4, 3, 6, 7, 12, 43, 11, 233}, 4);
        for (int i : newArr2) {
            System.out.print(i + " ");
        }
    }
}








