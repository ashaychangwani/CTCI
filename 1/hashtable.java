import java.util.*;


class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of buckets");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		int input=sc.nextInt();
		while(input!=-1){
			
		}
	}
	
	public static int hashingFn(int x, int n){
		return x%n;
	}