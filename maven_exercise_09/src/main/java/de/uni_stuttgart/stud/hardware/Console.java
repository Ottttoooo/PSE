package de.uni_stuttgart.stud.hardware;

import de.uni_stuttgart.stud.provider.Producer;

public abstract class Console {

	public abstract Producer getProducer();

	public abstract ProcessingUnit getProcessingUnit();

	public abstract double getPerformance();

	public abstract int getVersionNumber();
}
