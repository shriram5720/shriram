class MergeArray{
	static int[] mergeTwoArrays(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		int newLength=n+m;
		int result[]=new int[newLength];
		
		int i=0,j=0,k=0;
		while(i<n && j<m){
				if (arr1[i]<arr2[j]){
					result[k]=arr1[i];
					i++;
				}
				else{
					result[k]=arr2[j];
					j++;
				}
				k++;
		}
		while (i<n) result[k++]=arr1[i++];
		while (j<m) result[k++]=arr2[j++];
		return result;
	}
	public static void main (String args[]){
		int arr1[]={2,3,5,7,10,16,25,30};
		 int n = arr1.length;
		int arr2[]={4,6,9,11,13,17,27,35,45,62,85,95,96,98,1000};
		
		int result2[]=mergeTwoArrays(arr1,arr2);
		for(int i=0;i<result2.length;i++){
          System.out.print(result2[i]+" ");
		}
	}
}
	
	