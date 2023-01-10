package de.uni_stuttgart.stud.benchmark;

import java.util.ArrayList;
import java.util.List;

import de.uni_stuttgart.stud.hardware.Console;
import de.uni_stuttgart.stud.software.Software;

public class Benchmark {

	private final List<Software> softwareList;
	private final Console console;

	public Benchmark(List<Software> softwareList, Console console) {
		this.softwareList = softwareList;
		this.console = console;
	}

	public List<Software> getSoftwater() {
		return this.softwareList;
	}

	public Console getConsole() {
		return this.console;
	}

	private double benchmarkResult;
	private List<Double> resultList = new ArrayList<Double>();

	public List<Double> executeBenchmark() {

		for (Software softwareList : this.softwareList) {
			double computingConsumption = softwareList.getComputingConsumption();
			double performance = console.getPerformance();

			benchmarkResult = performance / computingConsumption;
			resultList.add(benchmarkResult);
		}

		return resultList;
	}
}
