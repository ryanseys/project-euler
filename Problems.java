import java.util.ArrayList;
/**
 * Write a description of class Problems here.
 * 
 * @author Ryan Seys
 * @version 1.0
 */
public class Problems
{
    /**
     * Constructor for objects of class Problems
     */
    public Problems()
    {
        // initialise instance variables
    }

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * 
     * Find the sum of all the multiples of 3 or 5 below 1000. 
     * 
     * Answer: 233168
     */
    public int problemOne()
    {
        int val = 3;
        int val2 = 5;
        int count = 1;
        ArrayList<Integer> used = new ArrayList<Integer>();
        while((count*val < 1000) || (count*val2 < 1000)) {
            if(count*val < 1000) {
                if(!(used.contains(Integer.valueOf("" + count*val)))) {
                    used.add(Integer.valueOf("" + count*val));
                }
            }
            if(count*val2 < 1000) {
                if(!(used.contains(Integer.valueOf("" + count*val2)))) {
                    used.add(Integer.valueOf("" + count*val2));
                }
            }
            count++;
        }
        
        int sum = 0;
        for(Integer num : used) {
            sum+=num.intValue();
        }
        return sum;
    }
    /**
     * Each new term in the Fibonacci sequence is generated by adding 
     * the previous two terms. By starting with 1 and 2, 
     * the first 10 terms will be:

     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

     * By considering the terms in the Fibonacci sequence whose values 
     * do not exceed four million, find the sum of the even-valued terms.
     * 
     * Answer: 4613732
     */
    public int problemTwo()
    {
        int limit = 4000000;
        int val1 = 1;
        int val2 = 2;
        int sum = 0;
        int temp;
        while(val1 < limit) {
            if(val1 % 2 == 0) {
                sum+=val1;
            }
            temp = val2;
            val2 += val1;
            val1 = temp;
        }
        return sum;
    }
}
