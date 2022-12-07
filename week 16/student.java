
public class student {
private float grade;
private String name;
private int totalgrade;
//i have no idea what it means to 'add the grades of ten students'
//do we add the grades of all the students together 
//or add the grades for each of the ten students?
//i think i did some functions that could apply for both situations

//getters and setters
public float getGrade() {
	return grade;
}
public void setGrade(float grade) {
	this.grade = grade;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public student() {
	name = "";
	grade = 0;
}

public student(float grade, String name) {
	setName(name);
	setGrade(grade);
	
}
public void addGrades(int totalgrade, int newgrade){
	this.totalgrade = totalgrade + newgrade;
}

public int return_addGrades(int totalgrade){
	return totalgrade;
}

@Override 
public String toString(){
	return String.format("%-14s %.2f\n", name, grade);
}
}
