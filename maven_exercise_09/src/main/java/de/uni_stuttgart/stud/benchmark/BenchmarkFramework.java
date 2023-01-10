package de.uni_stuttgart.stud.benchmark;

import java.util.Arrays;
import java.util.List;

import de.uni_stuttgart.stud.hardware.Learnditch;
import de.uni_stuttgart.stud.hardware.ProcessingUnit;
import de.uni_stuttgart.stud.hardware.Studystation;
import de.uni_stuttgart.stud.software.Software;

public class BenchmarkFramework {

	public static void main(String[] args) {

		ProcessingUnit intelProcessingUnit = new ProcessingUnit(25.0, "intel");
		ProcessingUnit amdProcessingUnit = new ProcessingUnit(30.0, "AMD");

		Software T1 = new Software("T1", 13.0);
		Software T2 = new Software("T2", 24.0);
		Software T3 = new Software("T3", 30.0);

		List<Software> softwareList = Arrays.asList(T1, T2, T3);

		Studystation studystation = new Studystation(142, intelProcessingUnit, softwareList);
		Learnditch learnditch = new Learnditch(294, amdProcessingUnit, softwareList);

		CheatBenchmark benchmark1 = new CheatBenchmark(softwareList, studystation);
		CheatBenchmark benchmark2 = new CheatBenchmark(softwareList, learnditch);

		System.out.println(benchmark1.executeBenchmark());
		System.out.println(benchmark2.executeBenchmark());

	}
}
