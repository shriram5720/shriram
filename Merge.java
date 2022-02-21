class Merge{
static int[] mergeTwoArrays(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int newLength = n+m;
        int result [] = new int[newLength];

        int i = 0, j = 0, k = 0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k] = arr1[i];
                i = i+1;
                // result[k++]=arr[i++];
            }
            else {
                result[k] = arr2[j];
                j = j+1;
                // result[k++] = arr2[j++];
            }
            k = k+1;
        }
        while(i<n) result[k++]= arr1[i++];
        while(j<m) result[k++] = arr2[j++];
        return result;
    }
	 public static void main(String args[]){ 
        int arr3[] = {29, 21, 19, 4};
        int n = arr3.length;
         int arr4[] = {1,3,17,25,33,99, 107,1001, 5005};
         int arr5[] = mergeTwoArrays(arr3, arr4);
        for(int i=0;i<arr5.length;i++){
            System.out.print(arr5[i]+ " ");
        }
		

        System.out.println("End of program");
    }
}