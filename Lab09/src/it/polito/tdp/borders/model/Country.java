package it.polito.tdp.borders.model;

public class Country implements Comparable<Country>{
	
	private int countryCode;
	private String stateAbbreviation;
	private String stateName;
	
	public Country(int countryCode, String stateAbbreviation, String stateName) {
		super();
		this.countryCode = countryCode;
		this.stateAbbreviation = stateAbbreviation;
		this.stateName = stateName;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}

	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryCode;
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
		Country other = (Country) obj;
		if (countryCode != other.countryCode)
			return false;
		return true;
	}
	
	public String toString() {
		return this.stateName;
	}

	@Override
	public int compareTo(Country other) {
		return this.stateName.compareTo(other.stateName);
	}
	

}
