package myspring.domain;

import myspring.annotation.MyIoc;

@MyIoc
public class User {
	 private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
