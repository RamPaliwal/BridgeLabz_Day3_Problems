public class Find2ndLargest{
    public static void main(String[] args){
        int arr[]={1,3,2,6,5,7,8,9,10};
        int largest=Integer.MIN_VALUE, slargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                int temp=largest;
                largest=arr[i];
                slargest=temp;
            }
        }
        System.out.println(slargest);
    }
} 