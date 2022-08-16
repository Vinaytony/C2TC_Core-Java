package com.Acharya.Application;
import com.Acharya.Framework.BankFactory;
import com.Acharya.Framework.SavingsAcc;
import com.Acharya.Framework.CurrentAcc;
public class MMBankFactory extends BankFactory {

	@Override
	public SavingsAcc getNewSavingsAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingsAcc mmsavings = new MMSavingsAcc(accNo,accNm,accBal,isSalaried);
		return mmsavings;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return mmcurrent;
	}



}
