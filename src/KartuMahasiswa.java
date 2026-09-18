import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIK: ");
        long nik = scanner.nextLong();
        //NIK: 1234567891012131415
        //Exception in thread "main" java.util.InputMismatchException: For input string: "1234567891012131415"
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2273)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        //	at KartuMahasiswa.main(KartuMahasiswa.java:10)
        //
        //Process finished with exit code 1

        System.out.print("Umur: ");
        int umur = scanner.nextInt();

        System.out.print("Tinggi Badan: ");
        double tinggi_Badan = scanner.nextDouble();

        System.out.print("Golongan Darah : ");
        char golongan_Darah = scanner.next().charAt(0);

        System.out.print("Status Menikah : ");
        boolean status_Menikah = scanner.nextBoolean();

        //Hal ini diperlukan agar karakter enter dapat dihapus sehingga user dapat mengisi Nama lengkap, jika karakter enter tidak dihapus,
        //Setelah user memasukkan status menikah maka kode akan langsung selesai.
        scanner.nextLine();

        System.out.print("Nama Lengkap: ");
        String nama_Lengkap = scanner.nextLine();

        System.out.println("==== KARTU MAHASISWA ====");
        System.out.println("Nama : " + nama_Lengkap);
        System.out.println("NIK : " + nik);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi" + tinggi_Badan);
        System.out.println("Gol. Darah : " + golongan_Darah);
        System.out.println("Menikah : " + status_Menikah);

    }
}


