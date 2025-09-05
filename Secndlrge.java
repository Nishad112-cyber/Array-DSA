import java.util.*;
public class Secndlrge {

    public static int secondlarge(int arr[]){
        int n= arr.length;
        Arrays.sort(arr);
        for(int i= n-2; i>=0; i--){
            if(arr[i] != arr[n-1]){
                return arr[i];

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {11,121,22,1211,56};
        System.out.println(secondlarge(arr));
    }
}