public class FindLargest{
    public static void main(String[] args){
        int arr[] = {1,2,3,1,2,4,5,7,6,5,6};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}