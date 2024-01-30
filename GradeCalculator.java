package codsoft;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of subjects: ");
		int numSubjects = scanner.nextInt();

		BigDecimal totalMarks = BigDecimal.ZERO;
		for (int i = 1; i <= numSubjects; i++) {
			System.out.print("Enter marks for subject " + i + "(out of 100) : ");
			BigDecimal subjectMarks = scanner.nextBigDecimal();
			totalMarks = totalMarks.add(subjectMarks);
		}

		BigDecimal averagePercentage = totalMarks.divide(new BigDecimal(numSubjects), 3, RoundingMode.UP);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Percentage: " + averagePercentage + "%");

		String grade = calculateGrade(averagePercentage);

		System.out.println("Grade: " + grade);

		scanner.close();
	}

	public static String calculateGrade(BigDecimal percentage) {
		if (percentage.compareTo(new BigDecimal("90")) >= 0) {
			return "A+";
		} else if (percentage.compareTo(new BigDecimal("80")) >= 0) {
			return "A";
		} else if (percentage.compareTo(new BigDecimal("70")) >= 0) {
			return "B";
		} else if (percentage.compareTo(new BigDecimal("60")) >= 0) {
			return "C";
		} else if (percentage.compareTo(new BigDecimal("50")) >= 0) {
			return "D";
		} else {
			return "F";
		}
	}
}


