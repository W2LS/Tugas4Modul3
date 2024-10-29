import java.util.Scanner;

/**
 * Kelas KalkulatorBangunRuang merupakan aplikasi sederhana untuk menghitung volume berbagai bangun ruang,
 * seperti Kubus, Balok, dan Bola. Kelas ini mengimplementasikan penghitungan volume dari kelas parent
 * penghitungan.
 */

public class KalkulatorBangunRuang extends penghitungan {

    /**
     * Metode utama yang digunakan untuk menjalankan aplikasi kalkulator bangun ruang.
     * Meminta input pengguna untuk memilih bangun ruang dan menghitung volumenya.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Bangun Ruang:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.print("Bangun Ruang: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungVolumeKubus(scanner);
                break;
            case 2:
                hitungVolumeBalok(scanner);
                break;
            case 3:
                hitungVolumeBola(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }

}
