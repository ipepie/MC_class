import java.util.*;
public class Main {
    public static void main(String[] args){
        int n= 10;
        int[] arr = {5,1,8,3,0,4,6,2,7,9}
    
        for(int i = 0; i<n; i++){
            int min_index = i; // 가장 작은 원소 인덱스
            for(int j = i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }
            }
            //스왑
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}