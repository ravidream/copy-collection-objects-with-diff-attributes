package com.lambdaexpressions.example.dto;

/**
 * 
 * @author ravi.thapa
 *
 */
public class SecondDTO {
	private int rollNo;
	private String studentName;
	private Boolean attendanceStatus;
	
	public SecondDTO(int rollNo, String studentName, Boolean attendanceStatus) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.attendanceStatus = attendanceStatus;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Boolean getAttendanceStatus() {
		return attendanceStatus;
	}
	public void setAttendanceStatus(Boolean attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	
	
}//end of the class
