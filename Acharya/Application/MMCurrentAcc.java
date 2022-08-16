package com.Acharya.Application;
import com.Acharya.Framework.CurrentAcc;
public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);		
	}
	public void  withDraw(float accBal) {
		System.out.println("Hello,current account  user your account balance is: " + getAccBal()+ " and your credit limit is :"+getcreditLimit());
		
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
