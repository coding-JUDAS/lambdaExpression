package com.java8.funcProgramming.realExample;

public interface IAccountFactory {
    public BankAccount getBankAccount(int id, double balance, String accountName);
}
