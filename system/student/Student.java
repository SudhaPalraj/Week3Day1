package org.student;

import org.department.Department;
import org.college.College;

public class Student extends Department {

	public void studentName() {
		System.out.println("Print studentName");

	}

	public void studentDept() {
		System.out.println("Print studentDept");

	}

	public void studentId() {
		System.out.println("Print studentId");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentId();
		st.studentName();

	}

}
