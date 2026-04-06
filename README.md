# Praktikum OOP Kalkulator

Program pembelajaran perbedaan antara **Gaya OOP (Object-Oriented Programming)** dan **Gaya Procedural** dalam pembuatan kalkulator sederhana dengan Java.

## 📁 Struktur File

```
praktikum_oop_kalkulator/
├── Kalkulator.java        # Kelas kalkulator (OOP) dengan encapsulation
├── MainOOP.java           # Program utama dengan gaya OOP
├── MainProcedural.java    # Program utama dengan gaya Procedural
├── StudyCase.md           # Penjelasan studi kasus
└── README.md              # File ini
```

## 🎯 Penjelasan Perbedaan Paradigma

### 1️⃣ **Gaya OOP (MainOOP.java + Kalkulator.java)**
- **Konsep**: Membuat objek `Kalkulator` yang menyimpan data (a, b) dan method operasinya
- **Karakteristik**:
  - Data dan method terbungkus dalam class
  - Menggunakan `encapsulation` (getter/setter)
  - Objek bisa digunakan kembali dan diubah valuenya
  - Lebih mirip "mesin pintar" yang punya memori

```java
Kalkulator k = new Kalkulator(20, 5);
System.out.println(k.tambah());    // 25
k.setNilai(30, 6);
System.out.println(k.bagi());      // 5.0
```

### 2️⃣ **Gaya Procedural (MainProcedural.java)**
- **Konsep**: Menggunakan method static yang menerima parameter
- **Karakteristik**:
  - Data disimpan langsung dalam variabel
  - Method static seperti fungsi-fungsi
  - Setiap operasi memerlukan parameter input
  - Lebih mirip "buku catatan + kalkulator manual"

```java
int x = 20, y = 5;
System.out.println(tambah(x, y));    // 25
System.out.println(bagi(x, y));      // 4.0
```

## 🚀 Cara Menjalankan Program

### **Opsi 1: Compile & Run Manual**

#### Di direktori `/home/alee/Destop/PraktikSore/`

**Kompile semua file Java:**
```bash
javac -d . praktikum_oop_kalkulator/*.java
```

**Jalankan MainOOP (Gaya OOP):**
```bash
java -cp . praktikum_oop_kalkulator.MainOOP
```

**Output:**
```
=== GAYA OOP (Mesin Pintar) ===
Tambah   : 25
Kurang   : 15
Kali     : 100
Bagi     : 4.0

--- Nilai diubah (seperti update bahan) ---
Bagi baru: 5.0
```

**Jalankan MainProcedural (Gaya Procedural):**
```bash
java -cp . praktikum_oop_kalkulator.MainProcedural
```

**Output:**
```
=== GAYA PROCEDURAL (Buku Catatan) ===
Tambah   : 25
Kurang   : 15
Kali     : 100
Bagi     : 4.0
```

### **Opsi 2: Quick Run Script**
```bash
cd /home/alee/Destop/PraktikSore && \
javac -d . praktikum_oop_kalkulator/*.java && \
echo "=== MainOOP ===" && java -cp . praktikum_oop_kalkulator.MainOOP && \
echo -e "\n=== MainProcedural ===" && java -cp . praktikum_oop_kalkulator.MainProcedural
```

## 📝 File-File Penjelasan

### **Kalkulator.java** 
Kelas OOP yang menyimpan dua nilai dan operasi matematika:
```java
public class Kalkulator {
    private int a;
    private int b;
    
    public int tambah() { return a + b; }
    public int kurang() { return a - b; }
    public int kali() { return a * b; }
    public double bagi() { ... }
    public void setNilai(int aBaru, int bBaru) { ... }
}
```

### **MainOOP.java**
Menggunakan pendekatan OOP:
- Membuat objek dengan konstruktor
- Memanggil method dari objek
- Mengubah nilai menggunakan setter

### **MainProcedural.java**
Menggunakan pendekatan Procedural:
- Method static seperti fungsi
- Parameter dikirim langsung
- Tidak ada state/memori dalam class

## 💡 Kapan Menggunakan Mana?

| Aspek | OOP | Procedural |
|-------|-----|-----------|
| **Kompleksitas** | Proyek besar, banyak hal | Skrip sederhana, cepat |
| **Data Reuse** | Ada objek yang dipakai berulang | Data satu kali pakai |
| **Maintainability** | Lebih mudah dirawat jangka panjang | Cepat tapi sulit diperbaiki |
| **Learning Curve** | Butuh pemahaman dulu | Bisa langsung dipahami |

## 🔧 Troubleshooting

**Error: `ClassNotFoundException`**
```
Pastikan:
1. Sudah compile dengan: javac -d . praktikum_oop_kalkulator/*.java
2. Path classpath benar: java -cp .
3. Package name sesuai: praktikum_oop_kalkulator
```

**Error: `class file has wrong version`**
```
Update Java atau gunakan versi JDK yang sama saat compile:
javac --version
```

## 📚 Referensi Belajar

- **OOP Concepts**: encapsulation, inheritance, polymorphism, abstraction
- **Java Basics**: classes, objects, constructors, methods
- **Best Practices**: gunakan OOP untuk code reusability & maintainability

---

**Status**: ✅ Kedua program sudah berjalan dan memberikan output yang benar.

*Last Updated: April 6, 2026*
