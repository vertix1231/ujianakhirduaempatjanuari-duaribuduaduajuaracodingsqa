
public class Nomorsatu {
	public static void hitungsampeseratus() {
		System.out.println();
		System.out.println("No. 1");
		System.out.println();

		for (int i = 0; i <= 100; i++) {
			int cetak = i;

			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("BIZZBUZZ");
				} else {
					System.out.println("BIZZ");
				}

			} else if (i % 5 == 0) {
				if (i % 3 == 0) {
					System.out.println("BIZZBUZZ");
				} else {
					System.out.println("BUZZ");
				}
				
			}else {
				System.out.println(cetak);
			}

			
		}
	}
}
