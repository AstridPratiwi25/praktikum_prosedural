package praktikum_oop_kalkulator;

public class MainOOP {
    public static void main(String[] args) {
        // Membuat objek Kalkulator
        Kalkulator k = new Kalkulator(20, 5);

        System.out.println("=== GAYA OOP (Mesin Pintar) ===");
        System.out.println("Tambah   : " + k.tambah());
        System.out.println("Kurang   : " + k.kurang());
        System.out.println("Kali     : " + k.kali());
        System.out.println("Bagi     : " + k.bagi());

        // Contoh kehidupan nyata: besok nilainya berubah
        k.setNilai(30, 6);
        System.out.println("\n--- Nilai diubah (seperti update bahan) ---");
        System.out.println("Bagi baru: " + k.bagi());
    }
}
