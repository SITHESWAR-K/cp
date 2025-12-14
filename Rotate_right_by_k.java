import java.util.*;
public class Rotate_right_by_k{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();     
        int len = scan.nextInt(); 
        d = d%len;    
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<=d/2;i++){
            int temp = arr[i];
            arr[i] = arr[d-i];
            arr[d-i] = temp; 
        }
        for(int i=0;i<(len-d-1)/2;i++){
            int temp = arr[d+i+1];
            arr[d+i+1] = arr[len-1-i];
            arr[len-1-i] = temp; 
        }
        for(int i=0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp; 
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}