package week03;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = new String[15];
		
		students[0] = "Cody Schliebe";
		students[1] = "Morgan LaFay";
		students[2] = "Clancy Dearborn";
		students[3] = "Harvey Macklemore";
		students[4] = "Spandex Wingspan";
		students[5] = "Renee Boot";
		students[6] = "Whirling Cambridge";
		students[7] = "Stark Contrazzle";
		students[8] = "Pleides Gluhfabber";
		students[9] = "Constance Craving";
		students[10] = "Steve Steve";
		students[11] = "Fabulous Jackoval";
		students[12] = "Hidden Carnival";
		students[13] = "Plops Dervish";
		students[14] = "Whitney Hoosegow";
		
		//for (int i=0; i < students.length; i++) {
		//	System.out.println(students[i]);
		//}
		
		for (String student : students) {
			System.out.println(student);
		}
		
	}

}
