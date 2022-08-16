package com.Acharya.Framework;

public abstract class CurrentAcc extends BankAcc {
	protected final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public void withDraw(float creditLimit) {
		System.out.println("Hello,current account  user your account balance is: " + creditLimit);
	}

	public float getcreditLimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
