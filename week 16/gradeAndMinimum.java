import java.util.ArrayList;
import java.util.Scanner;
public class gradeAndMinimum {
public static float minimum_grade(ArrayList<student> s) {
	float minimum =(float)3.99;
	float sgrade;
	for (student x : s) {
		sgrade = x.getGrade();
		if (sgrade < minimum) {
			minimum = sgrade;
		}
	}
	return minimum;
	
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String name_grade;
	String[] parts;
	String name;
	float grade = 0;
	ArrayList<student> students = new ArrayList<student>();
	while(count < 10) {
		System.out.print("Please enter the student's name and grade: ");
		name_grade = sc.nextLine();
		parts = name_grade.split(" ");
		name = parts[0];
		grade = Float.parseFloat(parts[1]);
		student s = new student(grade, name);
		students.add(s);
		count++;
	}
	System.out.printf("\nThe students are: ");
	for(student s : students) {
		System.out.print(s);
	}
	float minimum = minimum_grade(students);
	System.out.printf("The minimum grade is: %.2f", minimum);

	
}
}
