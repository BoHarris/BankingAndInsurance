package com.solvd.bankingandinsurance.client;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bankingandinsurance.bankingservice.CheckingAccount;
import com.solvd.bankingandinsurance.bankingservice.PersonalLoanAccount;
import com.solvd.bankingandinsurance.bankingservice.SavingsAccount;
import com.solvd.bankingandinsurance.interfaces.IAcceptOrDecline;
import com.solvd.bankingandinsurance.interfaces.IGiveFinancialInfo;
import com.solvd.bankingandinsurance.interfaces.IInquire;

public class BankingClient extends Client implements IInquire, IAcceptOrDecline, IGiveFinancialInfo {
	private Client client;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	private PersonalLoanAccount personalLoanAccount;
	private int creditScore;

	private static final Logger log = LogManager.getLogger(BankingClient.class.getName());

	public BankingClient(Client client, CheckingAccount checkingAccount, SavingsAccount savingsAccount,
			PersonalLoanAccount personalLoanAccount, int creditScore) {
		this.client = client;
		this.checkingAccount = checkingAccount;
		this.savingsAccount = savingsAccount;
		this.personalLoanAccount = personalLoanAccount;
		this.creditScore = creditScore;
	}

	public Optional<Client> getClient() {
		return Optional.ofNullable(client);
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public PersonalLoanAccount getPersonalLoanAccount() {
		return personalLoanAccount;
	}

	public void setPersonalLoanAccount(PersonalLoanAccount personalLoanAccount) {
		this.personalLoanAccount = personalLoanAccount;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	@Override
	public void checkServices() {

	}

	@Override
	public void giveFinacialInfo() {

	}

	@Override
	public void acceptOrDeclineTerms() {

	}

	@Override
	public String toString() {
		return "BankingClient [client=" + client + ", checkingAccount=" + checkingAccount + ", savingsAccount="
				+ savingsAccount + ", personalLoanAccount=" + personalLoanAccount + ", creditScore=" + creditScore
				+ "] \n";
	}

}
