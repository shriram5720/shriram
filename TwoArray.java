import java.util.Scanner;
class TwoArray{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and cols ");
		int row=sc.nextInt();
		int cols=sc.nextInt();
		int [][]arr=new  int[row][cols];
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Show arry");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
