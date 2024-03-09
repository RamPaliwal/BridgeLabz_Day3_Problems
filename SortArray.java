import java.util.Arrays;
public class SortArray{
    public static void main(String[] args){
    int arr[]={3,5,1,2,8,7};
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<=arr.length-1;j++){
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	//Arrays.sort(arr6);
	System.out.println(Arrays.toString(arr));
    }
}