package com.java8.lambda;

public class IncrementByFiveTraditional implements IIncrementByFive{
    @Override
    public int incrementByFive(int i) {
        return i + 5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional incrementByFiveTraditional = new IncrementByFiveTraditional();
        System.out.println(incrementByFiveTraditional.incrementByFive(10));

        // Increment by Five with Lambda
        System.out.println("Increment by Five Lambda. . .");
        IIncrementByFive iIncrementByFive = (x) -> x + 5;
        System.out.println(iIncrementByFive.incrementByFive(10));
    }
}
