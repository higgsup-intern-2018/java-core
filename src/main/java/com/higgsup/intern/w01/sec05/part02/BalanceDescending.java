package com.higgsup.intern.w01.sec05.part02;

import com.higgsup.intern.w01.sec05.part02.accounts.BankAccount;

public class BalanceDescending implements MyComparator {
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        if (a1.getBalance() > a2.getBalance()){
            return true;
        }
        return false;
    }
}
