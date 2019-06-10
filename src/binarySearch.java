public class binarySearch {
    public static int binarySearch(int[] nums, int key){
       int l = 0, h = nums.length - 1;
       while( l <=h ){
           int m = (l+h)/2;
           if(nums[m] == key){
               return m;
           }else if(nums[m] > key){
               h = m -1;
           }else {
               l = m + 1;
           }
       }
       return -1;
    }
    public static void main(String[] args){
        int arr[] ={10,20,30,40};
        System.out.println(binarySearch(arr, 40));
    }
}
