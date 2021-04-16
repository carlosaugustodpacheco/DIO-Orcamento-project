package com.carlos.bankaccount;

public enum TransactionType {

    INCOME, EXPENSE;

    public boolean isIncome() {
        return this == INCOME;
    }

}