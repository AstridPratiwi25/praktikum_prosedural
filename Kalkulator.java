package praktikum_oop_kalkulator;

public class Kalkulator {
    // Data (atribut) disimpan di dalam objek
    private int a;
    private int b;

    // Constructor
    public Kalkulator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method-method jadi perilaku objek
    public int tambah() {
        return a + b;
    }
    public int kurang() {
        return a - b;
    }
    public int kali() {
        return a * b;
    }
    public double bagi() {
        if (b == 0) {
            System.out.println("❌ Tidak bisa dibagi nol!");
            return 0;
        }
        return (double) a / b;
    }

    // Encapsulation: method untuk mengubah nilai nanti
    public void setNilai(int aBaru, int bBaru) {
        this.a = aBaru;
        this.b = bBaru;
    }
}
