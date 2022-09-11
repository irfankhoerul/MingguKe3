package CarMobil;
import java.util.Scanner;
public class CekCar {
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				int car1 = sc.nextInt();
				int car2 = sc.nextInt();
				int car3 = sc.nextInt();
				int car4 = sc.nextInt();
				
				int num = ((car1 + car2 + car3 + car4) - 999999) % 5;
				System.out.println((car1 + car2 + car3 + car4)-999999);
				if(num == 0) {
					System.out.println("Jalan");
				}else {
					System.out.println("Berhenti");
				}
			}
		}
	}
