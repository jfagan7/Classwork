package runner;
import binarysearch.BinarySearch;
public class Runner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int[] test1= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] test2= {0, 1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i=-1;i<test1.length+1;i++)
		{
			System.out.print(bs.binarySearch(test1,i,0,test1.length));
		}
		System.out.println();
		for(int i=-1;i<test2.length+1;i++)
		{
			System.out.print(bs.binarySearch(test2,i,0,test2.length));
		}
	}
}
