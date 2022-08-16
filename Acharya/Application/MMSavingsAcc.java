package com.Acharya.Application;
import com.Acharya.Framework.SavingsAcc;
public class MMSavingsAcc extends SavingsAcc{
	private static final float minbal= 10000.0f;
	public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}
	public void  withDraw(float accBal) {
		System.out.println("Hello, salaried user your account balance is : "+  accBal );
	}

	@Override
	public String toString() {
		return "MMSavingsAcc [getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
