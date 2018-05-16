package it.polito.tdp.borders.model;

public class Border {
	
	private int firstCountryCode;
	private int secondCountryCode;
	private int year;
	
	public Border(int firstCountryCode, int secondCountryCode, int year) {
		super();
		this.firstCountryCode = firstCountryCode;
		this.secondCountryCode = secondCountryCode;
		this.year = year;
	}

	public int getFirstCountryCode() {
		return firstCountryCode;
	}

	public void setFirstCountryCode(int firstCountryCode) {
		this.firstCountryCode = firstCountryCode;
	}

	public int getSecondCountryCode() {
		return secondCountryCode;
	}

	public void setSecondCountryCode(int secondCountryCode) {
		this.secondCountryCode = secondCountryCode;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstCountryCode;
		result = prime * result + secondCountryCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Border other = (Border) obj;
		if (firstCountryCode != other.firstCountryCode)
			return false;
		if (secondCountryCode != other.secondCountryCode)
			return false;
		return true;
	}
	
	public String toString() {
		return this.firstCountryCode + " " + this.secondCountryCode + " " + this.year;
	}
	

}
