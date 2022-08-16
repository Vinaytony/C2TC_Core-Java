package com.Acharya.Client;
import com.Acharya.Application.MMCurrentAcc;
import com.Acharya.Application.MMSavingsAcc;
import com.Acharya.Application.MMBankFactory;
import com.Acharya.Framework.BankFactory;
import com.Acharya.Framework.CurrentAcc;
import com.Acharya.Framework.SavingsAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingsAcc sa = new MMSavingsAcc(21,"Vinay",10000,true);
		CurrentAcc ca = new MMCurrentAcc(33,"Chandru",500000,100000);
		sa.withDraw(sa.getAccBal());
		sa.toString();
		ca.withDraw(ca.getcreditLimit());
		ca.toString();
	}

}
