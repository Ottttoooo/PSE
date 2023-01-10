package de.uni_stuttgart.stud.hardware;

public class ProcessingUnit {

	private final double performance;
	private final String name;

	public ProcessingUnit(final double performance, final String name) {
		this.performance = performance;
		this.name = name;
	}

	public double getPerformance() {
		return this.performance;
	}

	public String getName() {
		return this.name;
	}

}
