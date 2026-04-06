package praktikum_oop_kalkulator;

public class MainProcedural {
    // Semua method static → gaya procedural
    public static int tambah(int a, int b) {
        return a + b;
    }
    public static int kurang(int a, int b) {
        return a - b;
    }
    public static int kali(int a, int b) {
        return a * b;
    }
    public static double bagi(int a, int b) {
        if (b == 0) {
            System.out.println("❌ Tidak bisa dibagi nol!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int x = 20;  // contoh: uang kamu hari ini
        int y = 5;   // contoh: jumlah teman

        System.out.println("=== GAYA PROCEDURAL (Buku Catatan) ===");
        System.out.println("Tambah   : " + tambah(x, y));
        System.out.println("Kurang   : " + kurang(x, y));
        System.out.println("Kali     : " + kali(x, y));
        System.out.println("Bagi     : " + bagi(x, y));
    }
}