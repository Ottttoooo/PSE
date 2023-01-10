package de.uni_stuttgart.stud.hardware;

import java.util.List;

import de.uni_stuttgart.stud.provider.Producer;
import de.uni_stuttgart.stud.software.Software;

public class Studystation extends Console {

	private final Integer versionNumber;
	private final Producer producer = new Producer("Pansomy");
	private final ProcessingUnit processingUnit;

	public Studystation(final Integer versionNumber, final ProcessingUnit processingUnit,
			final List<Software> softwareList) {
		if (processingUnit == null || softwareList.size() == 0 || producer == null) {
			throw new IllegalArgumentException(
					"A console may not have a null or empty processingunit, and software of the console can´t be null. A console must have a producer");
		}
		this.versionNumber = versionNumber;
		this.processingUnit = processingUnit;
	}

	@Override
	public Producer getProducer() {
		return producer;
	}

	@Override
	public ProcessingUnit getProcessingUnit() {
		return this.processingUnit;
	}

	@Override
	public double getPerformance() {
		return this.processingUnit.getPerformance();
	}

	@Override
	public int getVersionNumber() {
		return this.versionNumber;
	}

}
