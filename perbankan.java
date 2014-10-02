import java.io.*;
import java.util.Scanner;

public class perbankan{
	public static void main(String[]args){
		int a,b,c,e;
		char d;
		e=50000;
		Scanner in = new Scanner(System.in);
		do{
			atas:
			System.out.println("======BANK RAKYAT=======");
			System.out.println("========================");
			System.out.println("   Menu Transaksi       ");
			System.out.println("   1. Tarik Tunai       ");
			System.out.println("   2. Setor Uang        ");
			System.out.println("   3. Cek Saldo         ");
			System.out.println("   4. Keluar            ");
			System.out.print(" Pilihan : ");
			a = in.nextInt();
			switch (a){
				case 1 :
				{
					System.out.print("  Berapa jumlah uang yang ingin Anda ambil ? ");
					b = in.nextInt();
					if (e-b<10000){
						System.out.println("  Maaf! Saldo anda tidak mencukupi");
					}
					else{
						e=e-b;
						System.out.println("  Anda berhasil mengambil uang sebesar : Rp. "+b);
					}
					System.out.print("\n\n");
				}
				break;
				case 2 :
				{
					System.out.print("  Berapa jumlah uang yang akan disetorkan ? ");
					c = in.nextInt();
					if(c<0){
						System.out.println(" Gagal, mohon periksa kembali nominal uang Anda !");
					}else{
							e=e+c;
							System.out.println(" Sukses, uang yang Anda setorkan sebesar : Rp. "+c);
							System.out.print("\n\n");
						}
				}
				break;
				case 3:
				{
					System.out.println("  Saldo anda : Rp. "+e);
				}
				case 4:
				{
					System.exit(0);
				}
			}
			System.out.print(" | Kembali ke Menu Utama (Y/T)? ");
			d = in.next().charAt(0);
			System.out.print("\n\n");
		}
		while(d=='Y'||d=='y');
	}
}
