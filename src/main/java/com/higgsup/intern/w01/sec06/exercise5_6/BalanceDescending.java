package com.higgsup.intern.w01.sec06.exercise5_6;

public class BalanceDescending implements MyComparator
{
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        if(a1.getBalance() > a2.getBalance())
        {
            return true;
        }
        else {
                return false;
        }
    }
}
