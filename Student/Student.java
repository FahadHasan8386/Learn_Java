
public class Student{
		int id ;
		String name ;
		double cgpa;
		
		public Student(int i , String na, double cg){
			id = i;
			name = na;
			cgpa = cg;
		}
		public void displayinfo(){
			System.out.println("Id is : " +id);
			System.out.println("Name is : "+name);
			System.out.println("Cgpa is : "+cgpa);
		}

	public static void main(String[]args){
		Student fahad = new Student (22,"Fahad",3.45);
		fahad.displayinfo();
	}
}