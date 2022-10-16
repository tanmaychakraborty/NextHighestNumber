package com.test.find;

import java.util.Arrays;

public class GenerateNextHighestNumber {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println("The command line input is:");
			for (String inputNumber : args){
				System.out.println(inputNumber);
				String output=findNext(inputNumber);
				System.out.println("output is ::"+output);
			}
		}else{
			System.out.println("No command line input is present");
			System.exit(0);
		}
	}



	public static String findNext(String inputNumber)
	{
		String regex = "[0-9]+";
		if(inputNumber.matches(regex)){
			char inputDigits[]=inputNumber.toCharArray();
			int lengthOfDigits = inputDigits.length;
			int i;
			String outputDigits ="" ; 
			//Start from the last digit and find the first digit that is smaller than the digit last -1.
			for (i = lengthOfDigits - 1; i > 0; i--)
			{
				if (inputDigits[i] > inputDigits[i - 1]) {
					break;
				}
			}
			//if not found
			if (i == 0)
			{
				return "Not possible";
			}
			else
			{
				int x = inputDigits[i - 1], min = i;

				// Find the smallest digit on right side of (i-1)'th digit that is > number[i-1]
				for (int j = i + 1; j < lengthOfDigits; j++)
				{
					if (inputDigits[j] > x && inputDigits[j] < inputDigits[min])
					{
						min = j;
					}
				}

				// Swap the first found smallest digit with number[i-1]
				swap(inputDigits, i - 1, min);

				//sort digits ascending
				Arrays.sort(inputDigits, i, lengthOfDigits);
				for (i = 0; i < lengthOfDigits; i++){
					outputDigits=outputDigits+inputDigits[i];
				}
				return outputDigits;  

			}
		}else{
			return "Input is not a number";
		}



	}
	//swapping code
	static void swap(char inputDigits[], int i, int min)
	{
		char temp = inputDigits[i];
		inputDigits[i] = inputDigits[min];
		inputDigits[min] = temp;
	}




}
