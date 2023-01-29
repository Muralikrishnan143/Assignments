package week1.day2;

public class MobileDetails2 {
	public void redmi() {
		String mobileBrandName="redmi";
		System.out.println("Mobile name :"+mobileBrandName);
		
		char mobileLogo='r';
		System.out.println("Mobile logo :"+mobileLogo);
		
		short noOfMobilePiece=1;
		System.out.println("no of Mobile Piece :"+noOfMobilePiece);
		
		int modelNumber=15;
		System.out.println("Modelnumber :"+modelNumber);
		
		long mobileImeiNumber=65677677656l;
		System.out.println("mobile imei no :"+mobileImeiNumber);
		
		float mobilePrice=15000f;
		System.out.println("mobile price      :"+mobilePrice);
		
		boolean isDamaged=false;
		System.out.println("mobile is damged :"+isDamaged);
	}		
        public static void main(String[] args) {
        	
		MobileDetails2  mi = new MobileDetails2();
		mi.redmi();
	
		
	}

}
