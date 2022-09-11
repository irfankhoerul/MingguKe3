package CobaHitung;
import java.util.Arrays;
import java.util.Scanner;

public class Itung {
	public static void main (String[] args){
		
		
		Scanner nilaiA = new Scanner(System.in);
		System.out.println("Masukan operasi A : ");
		
		String baris = nilaiA.nextLine();
		String[] operasi = baris.split("\\s+");
		
		int index = 0;
		int[] numbers = new int[operasi.length];
		for(int i = 0;i < operasi.length;i++)
		{
		    try
		    {
		        numbers[index] = Integer.parseInt(operasi[i]);
		        index++;
		    }
		    catch (NumberFormatException nfe)
		    {
		        //Do nothing or you could print error if you want
		    }
		}
		
		char Operator = operasi[1].charAt(0);
		int Count = 0 ;
		
		numbers = Arrays.copyOf(numbers, index);
		int[] temp = new int[numbers.length];
		temp = numbers;
		if (Operator == '+') {
			Count = numbers[0] + numbers[1];
		} else if (Operator == '-') {
			Count = numbers[0] - numbers[1];
		} else if (Operator == '*') {
			Count = numbers[0] * numbers[1];
		}else if (Operator == '/') {
			Count = numbers[0] % numbers[1];	
		}
	   
	    System.out.println(Count);
	}
}

