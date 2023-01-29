package week1.day2;

public class TwoWheeler
{
	public void bikeInfo(){
	
	   String bikeName="RX100"; 
	   int noOfWheels=2;
       short noOfMirrors=2;
       long chassisNumber=76543789l;
       boolean isPunctured=false;
       double runningKM=10000;
       System.out.println("bike name :  " +bikeName);
       System.out.println("no of wheels : "+noOfWheels);
       System.out.println("no of mirrors : "+noOfMirrors);
	   System.out.println("Chassis number : "+chassisNumber);
	   System.out.println("two wheeler is punctured : "+isPunctured);
	   System.out.println("running km : "+runningKM);

	}
    public static void main(String[] args) 
      {
       
    	TwoWheeler RX100 = new TwoWheeler();
        RX100.bikeInfo();
       

     }
}
