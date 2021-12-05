package com.solvd.bankingandinsurance.utilities.Credit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.bankingandinsurance.exception.BadCreditException;

public class CreditRunner {
	private static boolean isBad;
	private static boolean isFair;
	private static boolean isExcellent;
	private static boolean isGood;

	private static final Logger log = LogManager.getLogger(CreditRunner.class.getName());

	public static void creditRunner(int creditscore) {

		enum CREDITRATING {
			BAD, GOOD, FAIR, EXCELLENT
		}

		class CreditRatingString {
			public final static String BAD = "Bad Crdit";
			public final static String GOOD = "Good Credit";
			public final static String FAIR = "Fair Credit";
			public final static String EXCELLENT = "Excellent credit";

		}

		int num = (creditscore >= 300) && (creditscore <= 629) ? 1 : 1;
		num = (creditscore >= 630) && (creditscore <= 689) ? 2 : num;
		num = (creditscore >= 690) && (creditscore <= 719) ? 3 : num;
		num = (creditscore >= 720) && (creditscore <= 850) ? 4 : num;
		switch (num) {
		case 1:
			try

			{
				setIsBad(true);
				if (setIsBad(true)) {
					throw new BadCreditException();
				}
			} catch (BadCreditException e) {
				log.error(e.getMessage());
			}
			log.debug(CREDITRATING.BAD);
			break;
		case 2:
			setFair(true);
			log.debug(CREDITRATING.FAIR);
			break;
		case 3:
			setGood(true);
			log.debug(CREDITRATING.GOOD);
			break;
		case 4:
			setExcellent(true);
			log.debug(CREDITRATING.EXCELLENT);
			break;
		default:

		}

	}

	public boolean getIsBad() {
		return isBad;
	}

	public static boolean setIsBad(boolean isBad) {
		return CreditRunner.isBad = isBad;
	}

	public boolean getIsFair() {
		return isFair;
	}

	public static void setFair(boolean isFair) {
		CreditRunner.isFair = isFair;
	}

	public boolean getIsGood() {
		return isGood;
	}

	public static void setGood(boolean isGood) {
		CreditRunner.isGood = isGood;
	}

	public boolean getIsExcellent() {
		return isExcellent;
	}

	public static void setExcellent(boolean isExcellent) {
		CreditRunner.isExcellent = isExcellent;
	}

	public static boolean isBad() {
		return isBad = true;
	}

	public static boolean isFair() {
		return isFair = true;
	}

	public static boolean isGood() {
		return isGood = true;
	}

	public static boolean isExcellent() {
		return isExcellent = true;
	}

}