
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hi nama ku irsyad");
//		Nomorsatu.hitungsampeseratus();
//		Nomordua.segitigagenapharis();
//		NomorTiga.rapihinDataTrailer();
//		System.out.println("-------------------------------------------------pg");
//		Nomorsatupg.satuaja();
		
//		int a = 10;
//		int b = 2;
//		int c = 0;
//		do {
//			if(a%b==0) {
//				if()
//			}
//		} while (condition);
		
//		String saldo = "1,000,000.00";
//		String temp = "Rp "+saldo.replace(",", "");
//		temp = temp.replace(".", ";");
//		String[] tempnew = temp.split(";");
//		System.out.println(tempnew[0]+".00");
		
		
//		for(int i=1;i<5;i++) {
//			for(2) {
//				System.err.println("*");
//			}else {
//				System.out.println("");
//			}
//		}
		
	
		int a = 10;
		int b = 50;
		
		do {
			if(jumlah(a, b)>30) {
				kurang(a, b);
			}else {
				kali(a, b);
				
			}
			
			b = kurang(5, b);
			
		} while (b>10);
		
		
		
	}
	public static int jumlah(int a,int b) {
		a = a+b;
		return a;
	}
	public static int kurang(int a,int b) {
		b = b-a;
		return b;
	}
	public static void kali(int a,int b) {
		a = a*b;
		System.out.println(a);
	}

	

}
