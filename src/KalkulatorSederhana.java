import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu kalkulator
        showKalkulator();

        System.out.print("Pilih operasi (1-4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil Penjumlahan: " + addPenjumlahan(a, b));
                System.out.println("Terima Kasih telah mencoba !");
                break;
            case 2:
                System.out.println("Hasil Pengurangan: " + subtract(a, b));
                System.out.println("Terima Kasih telah mencoba !");
                break;
            case 3:
                System.out.println("Hasil Perkalian: " + multiply(a, b));
                System.out.println("Terima Kasih telah mencoba !");
                break;
            case 4:
                try {
                    System.out.println("Hasil Pembagian: " + divide(a, b));
                    System.out.println("Terima Kasih telah mencoba !");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }

    // Business Logic

    /**
     * Menampilkan Kalkulator
     */
    public static void showKalkulator(){
        System.out.println("Kalkulator Sederhana:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
    }

    /**
     * Penjumlahan
     */
    public static int addPenjumlahan(int a, int b){
        return a + b;
    }

    /**
     * Pengurangan
     */
    public static int subtract(int a, int b){
        return a - b;
    }

    /**
     * Perkalian
     */
    public static int multiply(int a, int b){
        return a * b;
    }

    /**
     * Pembagian
     */
    public static double divide(int a, int b){
        if(b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }
}
