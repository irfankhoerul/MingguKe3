package Test4;
import java.util.Scanner;
public class CobaSoal4 {
	public static void main(String[] args) {
		double gaji = 500000;
		double bonus;
		Scanner sc = new Scanner(System.in);
		System.out.print("Jumlah Penjualan: ");
		int penjualan = sc.nextInt();
		sc.close();
		if(penjualan >= 80) {
			bonus = 0.35 * (penjualan*50000);
			gaji = gaji + bonus;
		}else if(penjualan >= 40) {
			bonus = 0.25 * (penjualan*50000);
			gaji = gaji + bonus;
		}else if(penjualan < 15) {
			bonus = 0.15 * ((15-penjualan)*50000);
			gaji = gaji - bonus;
		}else {
			bonus = 0.10 * (penjualan*50000);
			gaji = gaji + bonus;
		}
		System.out.println(gaji);
	}
}
