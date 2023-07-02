package seleniumtraining;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		
		//array need size at the time initialization
		// once you array
		
		int[][] marks = new int[3][2];
		marks[0][0] =10;
		marks[0][1] =20;
		marks[0][2] =30;
		
		marks[1][0] =40;
		marks[1][1] =50;
		marks[1][2] =90;
		
		marks[2][0] =100;
		marks[2][1] =120;
		marks[2][2] =150;
		
		
//		System.out.println(marks[2][3]);
		
		//update value in array
		//marks[2] =160;
	//	System.out.println(marks[2]);
	
	//Iterate
//for(int i =0; i < marks.length; i++) {
	//		System.out.println(marks[i]);
		//}
		
		// for each loop, collection, list, set, map, array, queue
	for( int[] a : marks) {
		System.out.println("-------------");
		for( int k : a) {
			System.out.println(k);
		}
	}
	
	
	System.out.println(Arrays.toString(marks[0]));

	}
}
