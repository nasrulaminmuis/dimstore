<div align="center">

<img src="app/src/main/res/drawable/logo.png" alt="DimStore Logo" width="120" height="120"/>

# 🛍️ DimStore

### Aplikasi Toko Pakaian Android Modern

[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org)
[![Room](https://img.shields.io/badge/Database-Room-4285F4?style=for-the-badge&logo=google&logoColor=white)](https://developer.android.com/training/data-storage/room)
[![Min SDK](https://img.shields.io/badge/Min%20SDK-24-orange?style=for-the-badge)](https://developer.android.com)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

*Temukan koleksi pakaian terbaik untuk pria, wanita, dan anak-anak* ✨

</div>

---

## 📱 Tentang Aplikasi

**DimStore** adalah aplikasi toko pakaian berbasis Android yang memudahkan pengguna untuk berbelanja pakaian secara mudah dan menyenangkan. Aplikasi ini menawarkan koleksi lengkap untuk **Pria**, **Wanita**, dan **Anak-anak** dengan antarmuka yang modern dan intuitif.

---

## ✨ Fitur Unggulan

| Fitur | Deskripsi |
|-------|-----------|
| 🔐 **Login & Registrasi** | Sistem autentikasi pengguna yang aman |
| 🏠 **Halaman Utama** | Tampilan produk unggulan yang menarik |
| 👔 **Kategori Pria** | Koleksi pakaian khusus pria |
| 👗 **Kategori Wanita** | Koleksi pakaian khusus wanita |
| 👦 **Kategori Anak** | Koleksi pakaian khusus anak-anak |
| 🛒 **Keranjang Belanja** | Kelola produk sebelum checkout |
| 💳 **Checkout** | Proses pembelian yang mudah |
| 📦 **Riwayat Pembelian** | Lacak histori transaksi Anda |
| 👤 **Profil Pengguna** | Kelola informasi akun |
| ⚙️ **Kelola Akun** | Panel admin untuk manajemen akun |

---

## 🏗️ Arsitektur & Teknologi

```
DimStore
├── 🎨 UI Layer
│   ├── Activities (Login, Register, Home, dll.)
│   └── XML Layouts
├── 🗄️ Data Layer
│   ├── Room Database
│   ├── DAO (Data Access Object)
│   └── Entity (User)
└── 🔧 Utils
    └── PrefManager (SharedPreferences)
```

### Tech Stack

- **Bahasa**: Kotlin
- **Database**: Room (SQLite)
- **UI**: XML Layouts, ConstraintLayout
- **Komponen**: AndroidX, AppCompat, Material Design
- **Min SDK**: API 24 (Android 7.0 Nougat)
- **Target SDK**: API 33 (Android 13)

---

## 📂 Struktur Proyek

```
app/
└── src/
    └── main/
        ├── java/com/example/room/
        │   ├── 📱 MainActivity.kt          # Halaman Login
        │   ├── 📝 DaftarActivity.kt        # Halaman Registrasi
        │   ├── 🏠 HalamanUtama.kt          # Halaman Beranda
        │   ├── 🔍 DetailActivity.kt        # Detail Produk
        │   ├── 👔 PriaActivity.kt          # Koleksi Pria
        │   ├── 👗 WanitaActivity.kt        # Koleksi Wanita
        │   ├── 👦 AnakActivity.kt          # Koleksi Anak
        │   ├── 🛒 KeranjangActivity.kt     # Keranjang Belanja
        │   ├── 💳 CheckoutActivity.kt      # Checkout
        │   ├── 📦 RiwayatActivity.kt       # Riwayat Pembelian
        │   ├── 👤 ProfilActivity.kt        # Profil Pengguna
        │   ├── ⚙️ KelolaActivity.kt        # Kelola Akun
        │   ├── 🔑 PrefManager.kt           # Manajemen Preferensi
        │   ├── adapter/
        │   │   └── UserAdapter.kt          # Adapter RecyclerView
        │   └── data/
        │       ├── AppDatabase.kt          # Konfigurasi Database
        │       ├── dao/UserDao.kt          # Data Access Object
        │       └── entity/User.kt          # Model Pengguna
        └── res/
            ├── layout/                     # Layout XML
            ├── drawable/                   # Aset Gambar
            ├── values/                     # Resource Values
            └── font/                       # Font Kustom
```

---

## 🚀 Cara Menjalankan

### Prasyarat

- Android Studio **Hedgehog** atau lebih baru
- JDK 8 atau lebih tinggi
- Android SDK dengan API level 24+

### Langkah Instalasi

1. **Clone repositori ini**
   ```bash
   git clone https://github.com/nasrulaminmuis/dimstore.git
   ```

2. **Buka di Android Studio**
   ```
   File → Open → Pilih folder dimstore
   ```

3. **Sync Gradle**
   ```
   Klik "Sync Now" atau jalankan:
   ./gradlew build
   ```

4. **Jalankan aplikasi**
   - Hubungkan perangkat Android atau buka emulator
   - Klik tombol ▶️ **Run** di Android Studio

---

## 📸 Alur Aplikasi

```
┌─────────────┐     ┌──────────────┐     ┌──────────────────┐
│  Splash/    │────▶│    Login     │────▶│  Halaman Utama   │
│  Login      │     │  Registrasi  │     │  (Beranda)       │
└─────────────┘     └──────────────┘     └────────┬─────────┘
                                                  │
                    ┌─────────────────────────────┼──────────────┐
                    │                             │              │
                    ▼                             ▼              ▼
              ┌──────────┐               ┌──────────────┐  ┌──────────┐
              │ Kategori │               │   Keranjang  │  │  Profil  │
              │ Produk   │               │   Belanja    │  │          │
              └────┬─────┘               └──────┬───────┘  └──────────┘
                   │                             │
                   ▼                             ▼
            ┌──────────────┐           ┌──────────────────┐
            │    Detail    │           │    Checkout &    │
            │    Produk    │           │    Riwayat       │
            └──────────────┘           └──────────────────┘
```

---

## 🗄️ Database

Aplikasi menggunakan **Room Database** (local SQLite) untuk menyimpan data pengguna:

```kotlin
@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val username: String,
    val password: String,
    // ... data pengguna lainnya
)
```

---

## 📦 Dependencies

```kotlin
dependencies {
    // AndroidX Core
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")

    // Material Design
    implementation("com.google.android.material:material:1.10.0")

    // Layout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Room Database
    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
}
```

---

## 👨‍💻 Developer

<div align="center">

| Informasi | Detail |
|-----------|--------|
| 👤 **Nama** | Nasrul Amin Muis |
| 🐙 **GitHub** | [@nasrulaminmuis](https://github.com/nasrulaminmuis) |
| 📱 **Platform** | Android |
| 💻 **Bahasa** | Kotlin |

</div>

---

## 📄 Lisensi

```
MIT License

Copyright (c) 2024 Nasrul Amin Muis

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

<div align="center">

### ⭐ Jika Anda menyukai proyek ini, jangan lupa beri bintang!

[![GitHub stars](https://img.shields.io/github/stars/nasrulaminmuis/dimstore?style=social)](https://github.com/nasrulaminmuis/dimstore/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/nasrulaminmuis/dimstore?style=social)](https://github.com/nasrulaminmuis/dimstore/network/members)

Made with ❤️ in Indonesia 🇮🇩

</div>
