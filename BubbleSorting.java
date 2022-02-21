class BubbleSorting{
   static void SortBubble(int arr [],int n){
    for(int i=0;i<n;i++){  
	for (int j=0;j<n-1;j++){
	     if(arr[j]>arr[j+1]){
		   int temp=arr[j];
		   arr[j]=arr[j+1];
		   arr[j+1]=temp;
		 }
		}
	}
	
   
}	
	public static void main (String args[]){
		int arr[]={25,5,4,12,1,16};
		int n=6;
       SortBubble(arr,n);
	   for (int i=0;i<6;i++){
		   System.out.println(arr[i]);
	   }
	}
}