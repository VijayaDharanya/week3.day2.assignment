// Class: Students
//Methods: getStudentInfo()

//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

package week3.day2;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println(id + "  " + name);
	}

	public void getStudentInfo(String email, long phnum) {
		System.out.println(email + " " + phnum);
	}

	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(456);
		info.getStudentInfo(890, "Praja");
		info.getStudentInfo("fazal94@yahoo.com", 9786357889l);
	}

}
