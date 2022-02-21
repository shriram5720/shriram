class InsertionSort{
	static void Insertion(int arr [], int n){
		for (int i=0;i<n;i++){
			int currValue=arr[i];
			int hole=i;
			while(hole>=1 && arr[hole-1]>currValue){
				arr[hole]=arr[hole-1];
				hole--;
			}
			arr[hole]=currValue;
		}
	}
	public static void main (String []args){
		int arr[]={25,45,14,39,78,1,45,96,100}
		int n=arr.length;
		Insertion(arr,n);
        for (int i=0;i<n;i++){
			System.out.println(arr[i]);
		}		
		}

}