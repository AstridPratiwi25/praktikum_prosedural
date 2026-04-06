# Penjelasan Perbedaan Output MainOOP vs MainProcedural

## 📊 Perbandingan Output

### **MainOOP Output:**
```
=== GAYA OOP (Mesin Pintar) ===
Tambah   : 25
Kurang   : 15
Kali     : 100
Bagi     : 4.0

--- Nilai diubah (seperti update bahan) ---
Bagi baru: 5.0
```

### **MainProcedural Output:**
```
=== GAYA PROCEDURAL (Buku Catatan) ===
Tambah   : 25
Kurang   : 15
Kali     : 100
Bagi     : 4.0
```

---

## 🎯 Perbedaan Utama

### 1️⃣ **MainOOP Punya "Bagian Bonus"**

MainOOP menampilkan:
```
--- Nilai diubah (seperti update bahan) ---
Bagi baru: 5.0
```

**Mengapa?** Lihat kode MainOOP.java:

```java
// Pertama: Kalkulator dengan nilai 20 dan 5
Kalkulator k = new Kalkulator(20, 5);
System.out.println("Bagi     : " + k.bagi());  // 20 / 5 = 4.0

// KEDUA: Nilai dalam objek DIUBAH menjadi 30 dan 6
k.setNilai(30, 6);  // ← HANYA bisa di OOP!
System.out.println("Bagi baru: " + k.bagi());  // 30 / 6 = 5.0
```

Objek `k` **menyimpan state (nilai)** yang bisa diubah kapanpun!

---

### 2️⃣ **MainProcedural Tidak Punya Data Berubah**

Lihat kode MainProcedural.java:

```java
int x = 20, y = 5;
System.out.println("Tambah   : " + tambah(x, y));    // 25
System.out.println("Kurang   : " + kurang(x, y));    // 15
System.out.println("Kali     : " + kali(x, y));      // 100
System.out.println("Bagi     : " + bagi(x, y));      // 4.0
```

**Tidak ada** `setNilai()` atau mengubah `x` dan `y`, hanya perhitungan statis dari nilai awal.

---

## 💡 Analogi Simpel

### **OOP = Mesin Pintar (Memiliki Memori)**
```
┌─────────────────────┐
│   Objek Kalkulator  │
│  [Memori: a=20, b=5]│  ← Data tersimpan di dalam objek
│  • tambah()         │
│  • setNilai()       │  ← Bisa ubah datanya
│  • bagi()           │
└─────────────────────┘

✓ Pertama:  a=20, b=5  → bagi() hasilnya 4.0
✓ Ubah ke:  a=30, b=6  → bagi() hasilnya 5.0 (BERUBAH!)
```

### **Procedural = Buku Catatan + Kalkulator Manual**
```
Variabel: x=20, y=5

Operasi:
- tambah(20, 5) = 25
- kurang(20, 5) = 15
- kali(20, 5) = 100
- bagi(20, 5) = 4.0

Selesai. Tidak ada perubahan nilai.
```

---

## 🔍 Perbedaan Teknis

| Aspek | OOP | Procedural |
|-------|-----|-----------|
| **State (Memori)** | ✅ Disimpan dalam objek | ❌ Hanya variabel sementara |
| **Bisa Diubah** | ✅ `setNilai()` mengubah state | ❌ Hanya bisa pass parameter baru |
| **Reusability** | ✅ Objek bisa digunakan berulang | ⚠️ Harus definisikan variabel ulang |
| **Jumlah Output** | ✅ 2 set hasil (before & after) | ❌ 1 set hasil (static) |

---

## 📌 Kesimpulan

**MainOOP menunjukkan keunggulan OOP:**
- Objek bisa **menyimpan state** (nilai a dan b)
- Value bisa **diubah dengan metode** (`setNilai()`)
- Hasil perhitungan **memberikan output berbeda** ketika state berubah

**MainProcedural menunjukkan gaya klasik:**
- Hanya gunakan **variabel dan fungsi**
- Tidak ada "tempat penyimpanan" state
- Lebih **sederhana tapi kurang fleksibel**

Itulah mengapa OOP disebut "Mesin Pintar" - dia bisa mengingat dan mengubah dirinya sendiri! 🧠
