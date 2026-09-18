import java.util.Scanner;
import java.util.InputMismatchException;

public class KartuMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIK: ");
        long nik = scanner.nextLong();

        //! "NOT" Membalikkan nilai yang masuk dari class ValdasiNIK, jika dikirim nilai True maka yang masuk adalah false
        while (!ValidasiNIK.cekNIK(nik)) {
            System.out.println("NIK harus terdiri dari 16 digit!");

            System.out.print("NIK: ");
            nik = scanner.nextLong();
        }
        //NIK: 1234567891012131415
        //Exception in thread "main" java.util.InputMismatchException: For input string: "1234567891012131415"
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2273)
        //	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
        //	at KartuMahasiswa.main(KartuMahasiswa.java:10)
        //
        //Process finished with exit code 1

        int umur;

        while (true) {
            try { //mencoba menjalankan dan mengecek apakah ada error
                System.out.print("Umur: ");
                umur = scanner.nextInt();

                if (umur > 0) {
                    break;
                }

                System.out.println("Umur harus lebih dari 0!");

            } catch (InputMismatchException e) { //menangkap kode error agar program tidak langsung berhenti
                System.out.println("Umur harus berupa integer!");
                scanner.next(); // membuang input yang salah
            }
        }

        double tinggi_Badan;

        while (true) {
            try {
                System.out.print("Tinggi Badan: ");
                tinggi_Badan = scanner.nextDouble();

                if (tinggi_Badan > 0) {
                    break;
                }

                System.out.println("Tinggi badan harus lebih dari 0!");

            } catch (InputMismatchException e) {
                System.out.println("Tinggi badan harus berupa angka!");
                scanner.next(); // membuang input yang salah
            }
        }

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

    //class digunakan untuk validasi nik
    //&& "operator AND" bahwa semua nilai harus bernilai true, 1 false semua false
    class ValidasiNIK {

        public static boolean cekNIK(long nik) {
            return nik >= 1000000000000000L
                    && nik <= 9999999999999999L;
        }
    }
}


