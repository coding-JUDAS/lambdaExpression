package com.java8.funcProgramming.realExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BankTransfer {
    public static void main(String[] args) {
        IAccountFactory accountFactory = BankAccount::new;
        BankAccount studentBankAccount = accountFactory.getBankAccount(1, 50000, "Student A");
        BankAccount universityBankAccount = accountFactory.getBankAccount(2, 100000, "University");

        BiPredicate<Double, Double> balanceCheck = (balance, amount) -> balance>amount;

        BiConsumer<String, Double> printer = (x,y) -> System.out.println(x + y);
        BiConsumer<BankAccount, BankAccount> printer2 = (student, university) ->
                System.out.println("Ending balance of Student Account: " + student.getBalance() +
                        "\n University Account: " + university.getBalance());


        ExecutorService pool = Executors.newFixedThreadPool(10);

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " says :: Executing Transfer");
            try {
                double amount = 1000;
                if(!balanceCheck.test(studentBankAccount.getBalance(), amount)){
                    printer.accept(Thread.currentThread().getName() + " says :: balance insufficient, ", amount);
                    return;
                }
                while(!studentBankAccount.transfer(universityBankAccount, amount)){
                    TimeUnit.MILLISECONDS.sleep(100);
                    continue;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer.accept(Thread.currentThread().getName() + " says transfer successful: Balance in account ",
                    universityBankAccount.getBalance());
        });

        for(int i = 0; i < 20; i++){
            pool.submit(t1);
        }
        pool.shutdown();


        try {
            while(!pool.awaitTermination(24L, TimeUnit.HOURS)){
                System.out.println("Not Yet. Still awaiting for termination");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printer2.accept(studentBankAccount, universityBankAccount);

    }
}
