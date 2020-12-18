package datastructure;

public class Student implements Comparable {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	int stuId;
	String studentName;
	String studentCity;
	String studentSubject;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentSubject() {
		return studentSubject;
	}
	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}
	public Student(int stuId, String studentName, String studentCity, String studentSubject) {
		super();
		this.stuId = stuId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentSubject = studentSubject;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentSubject=" + studentSubject + "]";
	}
	
	

}
