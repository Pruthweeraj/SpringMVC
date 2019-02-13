package beans;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Student {

	String studentName;

	// @Size(min=2 , max=10 , message="Please, enter the RollNumber in valid
	// range 2 and 10)")
	// @Size(min=2 , max=10 , message="Please, enter the RollNumber in valid
	// range {min} and {max} .")
	@Size(min = 2, max = 10)
	String studentRollNumber;

	long studentMobile;

	@Past
	Date studentDOB;

	List<String> studentSkills;

	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(String studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public List<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

}
