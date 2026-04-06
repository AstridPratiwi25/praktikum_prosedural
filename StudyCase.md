# 🧪 Study Case Praktikum OOP Java

**Judul:** Sistem Penghitung Ongkos Ojek Online (Jakarta)

**Tujuan:**
- Memahami perbedaan Procedural vs OOP
- Melatih membuat class sendiri dengan constructor, method, dan encapsulation
- Mengaplikasikan konsep ke kehidupan sehari-hari di Jakarta

**Deskripsi Study Case:**

Kamu adalah mahasiswa di Jakarta yang sering naik ojek online (GoJek / Grab).  
Buatlah program sederhana untuk menghitung biaya perjalanan.

**Spesifikasi yang harus dibuat:**

1. **Class `Ojek`** (pakai OOP)
   - Atribut private:
     - `jarak` (double, dalam km)
     - `tarifPerKm` (double, default 2500)
     - `biayaMinimal` (double, default 10000)
   - Constructor: `Ojek(double jarak)`
   - Method:
     - `hitungBiaya()` → mengembalikan biaya total
     - `setTarifPerKm(double tarifBaru)`
     - `tampilkanInfo()` → cetak jarak dan biaya

2. **Main class** (`MainOjek.java`)
   - Buat 2 objek Ojek (contoh: 5 km dan 12 km)
   - Tampilkan hasilnya

**Tugas Tambahan (nilai plus):**
- Buat versi **Procedural** (semua method static di satu class) dan bandingkan dengan OOP
- Tambahkan method `diskonMahasiswa(int persen)` menggunakan encapsulation

**Output contoh yang diharapkan:**

=== OJEK ONLINE JAKARTA ===
Jarak     : 5.0 km
Biaya     : Rp. 12500.0
Jarak     : 12.0 km
Biaya     : Rp. 30000.0