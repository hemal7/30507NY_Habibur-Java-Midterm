package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     * e.g. - 0, 1, 1, 2,3,5,8,13,21,34,55,89,134,
     **/

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibonacciSeriesMethod(100);

    }

    public void fibonacciSeriesMethod(int fibSeriesResult){
        int fib1=0;
        int fib2=1;
        int fibSeries;
        System.out.print(fib1 + ", " +fib2);
        if(fibSeriesResult>0) {
            fibSeries = fib1 + fib2;
            fib1=fib2;
            fib2=fibSeries;
            System.out.print(", "+fibSeries);
            fibonacciSeriesMethod(fibSeriesResult-1);
        }

    }
}
