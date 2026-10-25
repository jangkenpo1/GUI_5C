# Latihan Materi GUI - 5C (Konversi Ukuran)

- **NIM** : F1D02410064
- **Nama** : Lalu Galang Abdullah

Aplikasi **Java Swing** untuk mengonversi satuan panjang. Isi angka, pilih satuan asal dan satuan tujuan, lalu klik **Convert** (atau tekan **Enter**). Hasil tampil di kolom sebelah kiri satuan tujuan.

Satuan yang digunakan: km, hm, dam, m, dm, cm, mm.

## Komponen GUI yang digunakan

### 1. Top Level Container
- `JFrame` (`frame`) sebagai jendela utama ("Pengubah Satuan").
- `JDialog` (lewat `JOptionPane.showMessageDialog`) untuk peringatan jika input kosong atau bukan angka yang valid.

### 2. Intermediate Component
- `JPanel` (`p1`): label "Asal:", input angka (`txtInput`), dan pilihan satuan asal (`cbAsal`).
- `JPanel` (`p2`): label "Tujuan:", kolom hasil (`txtHasil`), dan pilihan satuan tujuan (`cbTujuan`).
- `JPanel` (`p3`): tombol Convert (`btnConvert`).

### 3. Atomic Component
- `JLabel`: teks penanda "Asal:" dan "Tujuan:".
- `JTextField`: input angka (`txtInput`) dan kolom hasil (`txtHasil`).
- `JComboBox`: pilihan satuan asal (`cbAsal`) dan tujuan (`cbTujuan`).
- `JButton`: tombol Convert (`btnConvert`).

### 4. Layout Manager
- `GridLayout`: mengatur jendela utama `frame` menjadi 3 baris dan 1 kolom (`new GridLayout(3, 1)`).
- `FlowLayout`: menyusun komponen secara berurutan dari kiri ke kanan di dalam panel `p1`, `p2`, dan `p3`.

### 5. Event Handling (2 interface)
- `ActionListener`: menangani klik tombol Convert (`btnConvert`) melalui method `actionPerformed`.
- `KeyListener`: tekan Enter di kolom angka (`txtInput`) sama dengan klik Convert melalui method `keyPressed`.

## Screenshot

![Contoh tampilan]tampilan.png)