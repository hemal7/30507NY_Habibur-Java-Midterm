package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

                int ct=0,n=0,i=1,j=1;
                while(n<25)
                {
                    j=1;
                    ct=0;
                    while(j<=i)
                    {
                        if(i%j==0)
                            ct++;
                        j++;
                    }
                    if(ct==2)
                    {
                        System.out.printf("%d ",i);
                        n++;
                    }
                    i++;
                }
            }
        }