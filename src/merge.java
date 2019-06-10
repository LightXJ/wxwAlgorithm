import java.lang.reflect.Array;
import java.util.Arrays;

public class merge{
    public static int[] merge(int[] a, int[] b){
        int i = 0, j=0;
        int c = 0;
        int l = a.length + b.length -1;
        int temp[] = new int[l+1];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                temp[c] = a[i++];
                c++;
            }else{
                temp[c] = b[j++];
                c++;
            }
        }
        if(i==a.length) {
            for (; c<=l; c++) {
                temp[c] = b[j++];
            }
        }
        if(j==b.length){
            for(; c<=l; c++){
                temp[c] = a[i++];
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int arr1[] ={3,5,6};
        int arr2[] = {1,2,4};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }

}

