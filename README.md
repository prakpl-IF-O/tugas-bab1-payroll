# Latihan Class dan Object

## Deskripsi Soal ##

Buatlah simulasi sederhana dari aplikasi Payroll dimana data absensi karyawan dan data karyawan ditentukan sendiri dan disimpan kedalam struktur data (array statis maupun list).

Aplikasi bersifat batch sehingga tidak diperlukan interverensi dari user.

Contoh data karyawan (comma separated values)

```
nik,	nama,	gaji,	tunjangan,	bonus,		denda // column header, tidak disimpan
101,	paijo,	900,	200,		150,		75
102,	lulu,	875,	200,		100,		100
103,	lala,	1000,	350,		200,		125
```

Contoh data absensi

```
nik,tanggal,jam_masuk,jam_pulang // column header, tidak disimpan
101,2016-01-15,08:00,17:00
101,2016-01-16,08:00,18:30
102,2016-01-15,08:00,15:00
103,2016-01-15,08:00,17:00
```

Proses bisnis dari program ini

* Asumsikan jam masuk adalah jam 08.00, jika jam masuk melebihi jam 08.00, maka dikenakan denda dikalikan berapa jam dia terlambat.

* Asumsikan jam pulang adalah jam 17.00, jika jam pulang melebihi jam 17.00, maka diberikan bonus dikalikan berapa jam dia lembur, jika pulang lebih dahulu maka dikenakan denda.

* Hari Sabtu dan Minggu adalah hari libur, maka akan mendapatkan bonus sesuai berapa jam ia kerja di hari tersebut.

* Penghitungan total gaji, `totalGaji = (gaji + tunjangan + bonus) - denda`. `tunjangan` dan `gaji` hanya dijumlahkan sekali.

Contoh data hasil pengolahan total gaji

```
nik,nama,gaji,tunjangan,bonus,denda,total_gaji
101,paijo,900,200,150,75,2600
102,lulu,875,200,100,100,875
103,lala,1000,350,200,125,1350
```

## Prosedur Pengumpulan ##

* Baca dahulu ketentuan umum pengumpulan tugas [disini](https://github.com/prakpl-IF-O/tugas).
* Fork dahulu repository ini ke akun Github masing-masing.
* Lakukan clone dari repo hasil forking, lalu open project pada hasil clone, lakukan coding di Netbeans sesuai spesifikasi tugas yang telah ditentukan.
* Simpan screenshoot dari hasil run program dalam folder `ss/`
* Edit dahulu file PERNYATAAN.md, isi sesuai biodata.
* Lakukan commit dan push TIAP KALI melakukan perubahan dalam code SEBELUM deadline berakhir, jika hanya melakukan commit dan push hanya sekali dan perubahan yang sangat besar, akan memengaruhi penilaian.
* Deadline 4 Maret 2016 pukul 00.01, jika ada salah satu commit yang melampaui tanggal deadline, maka tidak diikutkan dalam penilaian, alias mendapat 0.
* Setelah menyelesaikan tugas, maka lakukan **Pull Request** untuk dilakukan penilaian. Setelah mengirim pull request, Anda tidak diperkenankan mengubah lagi isi dari repository.
* **Tidak ada toleransi duplikasi**, jika terdeteksi maka akan mendapat nilai 0 bagi semua yang terlibat.
