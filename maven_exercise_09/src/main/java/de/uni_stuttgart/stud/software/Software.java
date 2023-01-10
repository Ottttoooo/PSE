package de.uni_stuttgart.stud.software;

public class Software {

	private final String titel;
	private final double computingConsumption;

	public Software(final String titel, final double computingConsumption) {
		this.titel = titel;
		this.computingConsumption = computingConsumption;
	}

	public String getTitel() {
		return this.titel;
	}

	public double getComputingConsumption() {
		return this.computingConsumption;

	}
}
