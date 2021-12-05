package com.solvd.bankingandinsurance.utilities.address;

public enum CONTINENT {
	AUSTRALIA("Australia"), ASIA("Asia"), EUROPE("Europe"), AFRICA("Africa"), NORTH_AMERICA("North America"),
	SOUTH_AMERICA("South America"), ANTARCTICA("Antartica"), UNKNOWN("Unknown");

	private String name;
	private Object country;

	CONTINENT(String name) {
		this.name = name;
		this.country = country;

	}

	public static CONTINENT valueOfName(final String name) {
		final String enumName = name.toUpperCase().replaceAll(" ", "_");
		try {
			return valueOf(enumName);
		} catch (final IllegalArgumentException e) {
			return CONTINENT.UNKNOWN;
		}
	}
}
