package education.main;
import education.school.*;
//import education.college.*;
public class DemoTest {

	public static void main(String[] args) {
		Attendance att = new Attendance();
		att.display();
		education.college.Attendance att1 = new education.college.Attendance();
		att1.display();
	}

}
