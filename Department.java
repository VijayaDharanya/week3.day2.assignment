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
package org.department;

import org.college.College;

public class Department extends College {
	public void deptName() {
		System.out.println("DeptName is " + "CSE");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
