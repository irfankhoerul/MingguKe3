package Test4;

import java.util.Scanner;

public class BigInteger {

		public static void main(String[] args){
			
			
			java.math.BigInteger A;
			java.math.BigInteger B;
			 
			 Scanner in = new Scanner(System.in);
			 
			 A = in.nextBigInteger();
			 B = in.nextBigInteger();
			
			 System.out.println(A.add(B));
			 System.out.println(A.multiply(B));
		}
	}
