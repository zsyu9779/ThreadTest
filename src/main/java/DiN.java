import java.util.Stack;

/**
 * @Author: Zsyu
 * @Date: 19-10-19 下午1:33
 */
public class DiN {
    public static void quickSort(int [] arr,int low, int high,int n){
        int i,j,temp,t;
        if(low>high){
            return ;
        }
        i=low;
        j=high;
        temp = arr[low];
        while (i<j){
            while (temp<=arr[j]&&i<j){
                j--;
            }
            while (temp>=arr[i]&&i<j){
                i++;
            }
            if (i<j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;

            }

        }
        arr[low] = arr[i];
        arr[i] = temp;
        if (i<arr.length-n){
            quickSort(arr,j+1,high,n);
        }
        else if (i>arr.length-n){
            quickSort(arr,low,j-1,n);
        }
        else {
            return;
        }

    }

    public static void main(String[] args) {
        int [] arr = {5,7,1,6,4,3,8,9,2};
        quickSort(arr,0,arr.length-1,4);
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //System.out.println(arr[arr.length-2]);

    }

}
