import java.util.Scanner;

/**
 * Kelas penghitungan menyediakan metode untuk menghitung volume dari beberapa bangun ruang,
 * seperti Kubus, Balok, dan Bola.
 */

public class penghitungan {

    /**
     * Menghitung dan menampilkan volume kubus.
     *
     * @param scanner Scanner untuk menerima input pengguna.
     */

    protected static void hitungVolumeKubus(Scanner scanner) {
        System.out.print("Masukkan sisi kubus: ");
        double volumeKubus = penghitungan.getVolumeKubus(scanner.nextDouble());
        System.out.println(String.format("Volume Kubus: %.2f", volumeKubus));
    }

    /**
     * Menghitung volume kubus berdasarkan panjang sisi.
     *
     * @param sisi Panjang sisi kubus.
     * @return Volume kubus.
     */

    private static double getVolumeKubus(double sisi) {
        double volumeKubus = Math.pow(sisi, 3);
        return volumeKubus;
    }

    /**
     * Menghitung dan menampilkan volume balok.
     *
     * @param scanner Scanner untuk menerima input pengguna.
     */

    protected static void hitungVolumeBalok(Scanner scanner) {
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double volumeBalok = penghitungan.getVolumeBalok(panjang, lebar, scanner.nextDouble());
        System.out.println(String.format("Volume Balok: %.2f", volumeBalok));
    }

    /**
     * Menghitung volume balok berdasarkan panjang, lebar, dan tinggi.
     *
     * @param panjang Panjang balok.
     * @param lebar Lebar balok.
     * @param tinggi Tinggi balok.
     * @return Volume balok.
     */

    private static double getVolumeBalok(double panjang, double lebar, double tinggi) {
        double volumeBalok = panjang * lebar * tinggi;
        return volumeBalok;
    }

    /**
     * Menghitung dan menampilkan volume bola.
     *
     * @param scanner Scanner untuk menerima input pengguna.
     */

    protected static void hitungVolumeBola(Scanner scanner) {
        System.out.print("Masukkan jari-jari bola: ");
        double volumeBola = penghitungan.getVolumeBola(scanner.nextDouble());
        System.out.println(String.format("Volume Bola: %.2f", volumeBola));
    }

    /**
     * Menghitung volume bola berdasarkan jari-jari.
     *
     * @param jariJari Jari-jari bola.
     * @return Volume bola.
     */

    private static double getVolumeBola(double jariJari) {
        double volumeBola = penghitungan.getVolumeBalok((4 / 3.0), Math.PI, Math.pow(jariJari, 3));
        return volumeBola;
    }

}
