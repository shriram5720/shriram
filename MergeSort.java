class MergeS{
	boolean FindPrime(int n){
       for (int i=2;i<n;i++){
		   if(n%i==0) return false;
		   else return true;
	   }
	}
}
class MergeSort{
	public static void main(String args[]){
		MergeS sc=new MergeS();
           boolean a=sc.FindPrime(14);
     if(a==true)System.out.println("prime");
	 else System.out.println("not prime");
	}
}
