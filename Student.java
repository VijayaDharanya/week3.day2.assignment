//Package   :org.college
//Class     :College
//Methods   :collegeName(),collegeCode(),collegeRank()

//Package   :org.department
//Class        :Department
//Methods   :deptName()

//Package   :org.student
//Class        :Student
//Methods   :studentName(),studentDept(),studentId()

//Description:
//create above 3 class and call all your class methods into the Student using multilevel inheritance.
package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("StudentName is " + "Hari");
	}

	public void studentDept() {
		System.out.println("DeptName is " + "IT");
	}

	public void studentId() {
		System.out.println("StudentID is " + "905");
	}

	public static void main(String[] args) {
		Student record = new Student();
		record.collegeName();
		record.collegeCode();
		record.collegeRank();
		record.deptName();
		record.studentName();
		record.studentDept();
		record.studentId();

	}

}
