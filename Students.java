package week3.day1;

public class Students {

	public void getStudentInfo(int id) {

		System.out.println("The student id is " + id);

	}

	public void getStudentInfo(int id, String name) {

		System.out.println("The student id is " + id + "\t" +"the Student name is " + name);

	}

	public void getStudentInfo(String email, int phoneNumber) {

		System.out.println("The student email is " + email +" "+ "the Student phoneNumber is " + phoneNumber);

	}

	public static void main(String[] args) {

		Students s1 = new Students();

		s1.getStudentInfo(284782);
		s1.getStudentInfo(284939, "Sudha");

		s1.getStudentInfo("sudha@gmail.com", 035353535);

	}

}
