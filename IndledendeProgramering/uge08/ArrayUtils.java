package uge08;

import java.util.Arrays;

public class ArrayUtils {

	
	int[] streng;
	
	public ArrayUtils(int[] a) {

	streng = a;
	
	}
	
	public String arrayToString(){
		
		String Nystreng = Arrays.toString(streng);
		
		Nystreng = Nystreng.replace(",", " ");
		Nystreng = Nystreng.replace("[", "{");
		Nystreng = Nystreng.replace("]", "}");
		
		return Nystreng;
	}
	
	public int occurences(int a){
		
		int i = 0;
		int Occurances = 0;
		
		while (i < streng.length){
			
			if (streng[i] == a){
				Occurances++;
				i++;
			}
			else i++;	
		}
	
		return Occurances;
	}
	
	public int sumOfArray(){
		
		int sum = 0;
		
		int i = 0;
		
		while (i < streng.length){
			
			sum = sum + streng[i];
			
			i++;

		}
		
		return sum;
	}
}
