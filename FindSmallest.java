public class FindSmallest{
    public static void main(String[] args){
        int arr[] = {1,2,3,1,2,4,5,7,6,5,6};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min<arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}