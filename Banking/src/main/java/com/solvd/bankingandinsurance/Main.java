
package com.solvd.bankingandinsurance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bankingandinsurance.bankingservice.CheckingAccount;
import com.solvd.bankingandinsurance.bankingservice.PersonalLoanAccount;
import com.solvd.bankingandinsurance.bankingservice.SavingsAccount;
import com.solvd.bankingandinsurance.client.BankingClient;
import com.solvd.bankingandinsurance.client.Client;
import com.solvd.bankingandinsurance.company.Bank;
import com.solvd.bankingandinsurance.company.generics.PersonalBanker;
import com.solvd.bankingandinsurance.employee.EntryLevel;
import com.solvd.bankingandinsurance.exception.DownPaymentException;
import com.solvd.bankingandinsurance.exception.RequiredPaperworkException;
import com.solvd.bankingandinsurance.interfaces.IDiscussLoanRisks;
import com.solvd.bankingandinsurance.interfaces.lambda.Starting;
import com.solvd.bankingandinsurance.interfaces.lambda.Stopping;
import com.solvd.bankingandinsurance.utilities.DateUtil;
import com.solvd.bankingandinsurance.utilities.FullName;
import com.solvd.bankingandinsurance.utilities.LinkedList;
import com.solvd.bankingandinsurance.utilities.Node;
import com.solvd.bankingandinsurance.utilities.Credit.CreditRunner;
import com.solvd.bankingandinsurance.utilities.address.Address;
import com.solvd.bankingandinsurance.utilities.address.CONTINENT;
import com.solvd.bankingandinsurance.utilities.address.City;
import com.solvd.bankingandinsurance.utilities.address.Country;
import com.solvd.bankingandinsurance.utilities.address.STATE;

public class Main {
	private static final Logger log = LogManager.getLogger(Main.class.getName());

	public static void main(String[] args) {

		Starting start = message -> log.debug(message);
		start.sayMessage("Application Starting");
		/*************** Override done in Company.java and BankAccount ******/
		/**************** Generic in generic package ***************************/
		/***************
		 * Enums in BankAccount Saving AccountCreditRunner, Continent, State
		 ****/
		/*************** Generics and linked list in main *********/
		/**************** Lambda and stream() in main *******************/

		Country newCountry = new Country("United States of America", "N/A", STATE.NEW_YORK);
		City newCityManhattan = new City("Manhattan", "10001");
		Address newAddressBank = new Address("1", "Main Street", newCityManhattan, STATE.NEW_YORK, newCityManhattan,
				newCountry, newCountry, CONTINENT.NORTH_AMERICA);

		City newCityChristmas = new City("Christmas", "32709");
		Address newAddressFL = new Address("1", "Main Street", newCityChristmas, STATE.FLORIDA, newCityChristmas,
				newCountry, newCountry, CONTINENT.NORTH_AMERICA);

		Address newAddressNY = new Address("1500", "Brooklyn Way", newCityManhattan, STATE.NEW_YORK, newCityManhattan,
				newCountry, newCountry, CONTINENT.NORTH_AMERICA);

		DateUtil newDateFounded = new DateUtil(05, 14, 1960);
		Bank newBank = new Bank("Bank of Manhattan", newAddressBank, "631-555-9865", "WWW.BankOfManhattan.Com",
				"Bank in Central Park Manhattan", newDateFounded, "Manhattan, New York", "Bank");

		CheckingAccount newCheckingAccountMike = new CheckingAccount();
		CheckingAccount newCheckingAccountFred = new CheckingAccount();

		SavingsAccount newSavingsAccountFred = new SavingsAccount();
		SavingsAccount newSavingsAccountMike = new SavingsAccount();

		FullName newFullNameMichael = new FullName("Smith", "Michael", "Robert");
		DateUtil newBirthDateMike = new DateUtil(01, 01, 1970);

		Client newClientMike = new Client(newFullNameMichael, newAddressFL, 9865875, "Male", newBirthDateMike);

		BankingClient newBankingClientMike = new BankingClient(newClientMike, newCheckingAccountMike,
				newSavingsAccountMike, null, 150);

		newCheckingAccountMike.deposit(30000);

		FullName newFullNameFred = new FullName("Smith", "Fred", "William");
		DateUtil newBirthDateFred = new DateUtil(8, 30, 1960);
		Client newClientFred = new Client(newFullNameFred, newAddressNY, 98568745, "Male", newBirthDateFred);

		BankingClient newBankingClientFred = new BankingClient(newClientFred, newCheckingAccountFred,
				newSavingsAccountFred, null, 220);

		// Mike personal loan
		PersonalLoanAccount newPersonalLoanAccountMike = new PersonalLoanAccount(newBankingClientMike, 300000, 6,
				300000, 0);

		FullName newFullNameSam = new FullName("Smith", "Sam", "Walter");
		EntryLevel newEntryLevelSam = new EntryLevel(newFullNameSam, newAddressNY, 652156, "Female", newBirthDateFred,
				"Personal Banker", "068554", newBirthDateMike, "Sam@BankingEmail.Com", "1254");

		Map<Integer, String> checkingAccountMap = new HashMap<Integer, String>();
		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.setCustomerId(1001254);
		checkingAccountMap.put(checkingAccount.getCustomerId(), "1001254");

		Map<Integer, String> savingsAccountMap = new HashMap<Integer, String>();
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setCustomerId(9876542);
		savingsAccountMap.put(savingsAccount.getCustomerId(), "9876542");

		/********************** Generics ***************************/
		FullName newFullNameNick = new FullName("Shoemaker", "Nick", "Walter");
		EntryLevel newEntryLevelNick = new EntryLevel(newFullNameNick, newAddressNY, 652156, "Male", newBirthDateFred,
				"Personal Banker", "068554", newBirthDateMike, "Nick@BankingEmail.Com", "5487");

		FullName newFullNameMichelle = new FullName("Lawson", "Michelle", "Sara");
		EntryLevel newEntryLevelMichelle = new EntryLevel(newFullNameMichelle, newAddressNY, 652156, "Female",
				newBirthDateFred, "Personal Banker", "068554", newBirthDateMike, "Michelle@BankingEmail.Com", "5632");

		FullName newFullNameTyson = new FullName("Powers", "Tyson", "Ryan");
		EntryLevel newEntryLevelTyson = new EntryLevel(newFullNameTyson, newAddressNY, 652156, "Male", newBirthDateFred,
				"Personal Banker", "068554", newBirthDateMike, "Tyson@BankingEmail.Com", "5478");

		/***************************** LinkedList ***********************************/
		PersonalBanker<EntryLevel> personalBankerSam = new PersonalBanker<EntryLevel>(newEntryLevelSam);
		PersonalBanker<EntryLevel> personalBankerTyson = new PersonalBanker<EntryLevel>(newEntryLevelTyson);
		PersonalBanker<EntryLevel> personalBankerMichelle = new PersonalBanker<EntryLevel>(newEntryLevelMichelle);
		PersonalBanker<EntryLevel> personalBankerNick = new PersonalBanker<EntryLevel>(newEntryLevelNick);

		LinkedList<PersonalBanker<EntryLevel>> list = new LinkedList<>();

		list.add(new Node<PersonalBanker<EntryLevel>>(personalBankerSam));
		list.add(new Node<PersonalBanker<EntryLevel>>(personalBankerTyson));
		list.add(new Node<PersonalBanker<EntryLevel>>(personalBankerMichelle));
		list.add(new Node<PersonalBanker<EntryLevel>>(personalBankerNick));
		list.print();

		/*********************
		 * Simulated establishing a line of credit at a bank and deposit a down-payment
		 ********************/

		log.debug(newBankingClientMike.getFullName() + newBankingClientMike.ANSWERABLE_QUESTION);

		log.debug(newEntryLevelSam.getFullName() + newEntryLevelSam.ANSWER_QUESTION);
		log.debug(newBankingClientMike.getFullName() + newBankingClientMike.GIVE_INFO);

		try {
			if (newBankingClientMike.getTaxIdNumber() == null && newBankingClientMike.getCreditScore() == 0) {
				throw new RequiredPaperworkException();
			}

		} catch (RequiredPaperworkException e) {
			log.error(e.getMessage());
		}

		newBankingClientMike.giveFinacialInfo();

		log.debug(newEntryLevelSam.getFullName() + newEntryLevelSam.COLLECT_AND_INPUT_DATA);
		CreditRunner.creditRunner(newBankingClientMike.getCreditScore());

		log.debug(IDiscussLoanRisks.LOAN_RISK_ASSESMENT);

		log.debug(newEntryLevelSam.getFullName() + newEntryLevelSam.PRESENT_TERMS);
		log.debug(newBankingClientMike.getFullName() + newBankingClientMike.ACCEPT_OR_DECLINE);
		newCheckingAccountMike.withdraw(35000); // throws insufficient funds exception
		newPersonalLoanAccountMike.setDownPayment(25000);

		int percentOfStartLoanAmount = newPersonalLoanAccountMike.getStartingLoanAmount() / 10;

		if (percentOfStartLoanAmount > newPersonalLoanAccountMike.getDownPayment()) {
			try {

				throw new DownPaymentException();
			} catch (DownPaymentException e) {
				log.error(e.getMessage());
			}
		}

		/********************************
		 * Lambda expressions
		 ********************************/
//1
		List<Address> addresses = new ArrayList<>();
		addresses.add(newAddressBank);
		addresses.add(newAddressFL);
		addresses.add(newAddressNY);

		Collections.sort(addresses, (a1, a2) -> {
			return a1.getState().compareTo(a2.getState());
		});
		for (Address p : addresses) {
			log.debug(p.getState());

		}

		Address newRandomAddress = new Address("1313", "Mocking Bird Ln", newCityChristmas, STATE.FLORIDA,
				newCityChristmas, newCountry, newCountry, CONTINENT.NORTH_AMERICA);

		Consumer<Address> newAddress = a -> log.debug(a);
		// Implement address using accept()
		newAddress.accept(newRandomAddress);

		Consumer<List<Address>> dispList = address -> address.stream().forEach(a -> log.debug(a + " "));

		List<Address> address = new ArrayList<Address>();
		address.add(newAddressFL);
		address.add(newAddressNY);
		address.add(newAddressBank);

		dispList.accept(address);

		Consumer<List<Address>> modify = newaddress -> {
			address.add(newRandomAddress);
		};

		// Implement dispList using accept()
		modify.accept(address);

		// Implement dispList using accept()

		dispList.accept(address);

		List<BankingClient> newBankingPeople = new ArrayList<>();
		newBankingPeople.add(newBankingClientMike);
		List<BankingClient> bankingClientel = new ArrayList<>();
		bankingClientel.add(newBankingClientFred);

		Collections.copy(bankingClientel, newBankingPeople);

		// printing the bankingClientel
		log.debug("Value of source list: " + bankingClientel);

		// printing the newBankingPeople after copying
		log.debug("Value of destination list: " + newBankingPeople);

		List<Client> clientCheck = new ArrayList<>();
		clientCheck.add(newClientFred);
		clientCheck.add(newClientMike);

		Collections.reverseOrder();
		log.debug(clientCheck);

		Stopping stopping = message -> log.debug(message);
		stopping.sayMessage("Application Stopping");

		/*************** optional<> ************************/
		log.debug(newBankingClientFred.getGender().map(String::toUpperCase).orElse("Gender Not Specified"));

		if (newBankingClientMike.getClient().isPresent()) {
			Client bankClient = newBankingClientMike.getClient().get();
			log.debug(bankClient);
		}
		if (newRandomAddress.getContinent().isPresent()) {
			CONTINENT continentString = newRandomAddress.getContinent().get();
			log.debug(continentString);
		}

		log.debug(newEntryLevelSam.getEmployeeID().orElseThrow().replaceAll("6", "1"));

		if (newRandomAddress.getCity().isPresent()) {
			City cityString = newRandomAddress.getCity().get();
			log.debug(cityString);
		}

	}
}
