import java.util.Arrays;
public class Duplicate{
    public static void main(String[] args){
        int arr[] = {1,2,3,1,2,4,5,7,6,5,6};
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            else{
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
            System.out.println(arr[i]+"->"+count);
            }
            }
        }
    }
}