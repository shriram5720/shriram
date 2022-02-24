class Main{
   static void InsertionSort(int arr[],int n){
       for(int i=0;i<n;i++){
           int curr=arr[i];
           int hole=i;
           while(hole>=1 && arr[hole-1]>curr){
               arr[hole]=arr[hole-1];
               hole--;
           }
           arr[hole]=curr;
       }
   }
      
    
public static void main (String args[]){
    
    int arr[]={2,52,41,12,3,2,10,81,75,25,20};
    int n=arr.length;
    InsertionSort(arr, n);
    for (int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
   }
}
