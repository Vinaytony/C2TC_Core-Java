package com.Acharya.Framework;

public abstract  class  SavingsAcc extends BankAcc {
	boolean isSalaried;
	private static  float minbal;
	public SavingsAcc(int accNo,String accNm, float accBal,boolean isSalaried){
		super(accNo,accNm,accBal);
		this.isSalaried = isSalaried;
	}
	public void  withDraw(float accBal) {
		System.out.println("Hello salaried user your  account balance is : "+ accBal);
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public static float getSalary() {
		return minbal;
	}
	public void setSaving(boolean isSaving) {
		this.isSalaried = isSaving;
	}
	@Override
	public String toString() {
		return "SavingsAcc [isSalary=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
