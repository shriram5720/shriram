import java.util.*;
class SearchingArray{
	public static void main (String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int size=sc.nextInt();
	System.out.println("Enter thye array ");
	int arr[]=new int[size];
for (int i=0;i<arr.length;i++){
	arr[i]=sc.nextInt();
        }	
	System.out.println("Enter the target ");
	int target= sc.nextInt();
	int n =arr.length;
	int low=0;
	int high = n-1;
	int ans = -1;
	while (high>=low){
		int mid1 = low +(high-low)/3;
		int mid2 = high -(high-low)/3;
		if(arr[mid1]==target ){
			ans=mid1;
			break;
		}
		if(arr[mid2]==target ){
			ans=mid2;
			break;
		}
		
	      if(arr[mid1]>target){
			  low=mid1-1;
		  }
		  if(arr[mid1]<target && target<arr[mid2]){
			  low=mid1+1;
			  high=mid2-1;
		  }
		  else {
			 low=mid2+1;
		  }
	}
	System.out.println("Your are result ");
	System.out.println(ans);
	}
}