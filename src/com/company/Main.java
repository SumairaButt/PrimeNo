package com.company;

public class Main
{
    public static void main(String[] args)
    {
	// write your code here

        int num= 676876873;
        int divisor =1;
        int sqrtno =  (int)Math.sqrt(num)+1;

        if ((num>2 && num%2==0 )|| num<=1 )
        {
            System.out.println("The number " + num + " is not a Prime Number. It is either less than 1 or divisible by  2");
        }
        else {
            for (int i = 3; i < sqrtno; i += 2) {
                if (num % i == 0) {
                    divisor = divisor + 1;
                }
                if (divisor > 1) {
                    System.out.println("The number " + num + " is not a Prime Number. It is divisible by " + i);
                    break;
                }
            }

            if (num == 2 || divisor == 1) {
                System.out.println("The number " + num + " is a Prime Number");
            }
        }
    }
}
