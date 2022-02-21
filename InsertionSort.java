class InsertionSort{
	// static void Insertion(int arr [], int n){
	// 	for (int i=0;i<n;i++){
	// 		int currValue=arr[i];
	// 		int hole=i;
	// 		while(hole>=1 && arr[hole-1]>currValue){
	// 			arr[hole]=arr[hole-1];
	// 			hole--;
	// 		}
	// 		arr[hole]=currValue;
	// 	}
	// }
 static void sortArray(int arr[], int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            // left half 
            sortArray(arr, l, mid);
            //right half
            sortArray(arr, mid+1, r);
            // merge the results
            mergeResult(arr, l, mid, r);            
        }
    }

	

	public static void main (String []args){
		int arr[]={25,45,14,39,78,1,45,96,100};
		int r=arr.length-1;
		int l=0;
		//Insertion(arr,n);
		sortArray(arr, l, r);
        for (int i=0;i<n;i++){
			System.out.println(arr[i]);
		}		
		}

}