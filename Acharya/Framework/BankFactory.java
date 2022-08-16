package com.Acharya.Framework;

 public abstract class BankFactory {
	 public abstract SavingsAcc getNewSavingsAccount(int accNo,String accNm,float accBal,boolean isSalaried);
	 public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal, float creditLimit);
	 

}
