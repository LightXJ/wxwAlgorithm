import java.util.Arrays;

public class bubbleSort{
    public static int[] bubbleSort(int[] array){
        for(int i=0; i<=array.length-1;i++){
            for(int j=i+1;j<=array.length-1;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args){
        int arr[] ={4, 2, 3,5,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

}

