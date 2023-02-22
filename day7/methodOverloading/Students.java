package Assignment;

public class Students {
	
     public void getStudentInfo(int id)
     {
    	 System.out.println("Student id : "+id);
     }
     public void getStudentInfo(int id,String Name)
     {
    	 System.out.println("Student id : "+id+"\n"+"Student name : "+Name);
     }
     public void getStudentInfo(String Name,String email,long phoneNum)
     {
    	 System.out.println("Student name : "+Name+"\n"+"Student email : "+email+"\n"+"Student PhoneNum : "+phoneNum);
     }
     public static void main(String[] args) {
    	 
    	 Students info=new Students();
    	 info.getStudentInfo(24);
    	 info.getStudentInfo(24,"Murali");
    	 info.getStudentInfo("Murali","abc123@gmail.com", 9876543210l);
    	 
    	 }

}
