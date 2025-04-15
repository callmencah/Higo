Selenium With java And TestNG
Untuk menjalankannya bisa langsung running file “testng.xml”

Berikut penjelasan sederhana dari kode XML di atas:
Ini adalah konfigurasi test automation (pengujian otomatis) untuk website Higo yang terbagi menjadi 2 bagian:
1.	Test untuk Blog Higo (blog.higo.id):
•	TC0001: Mengecek tampilan halaman utama blog
•	TC0002: Menguji filter kategori artikel:
o	Update HIGOes
o	Hangout
o	Lifestyle
o	Tech & Social
o	Business Tip
o	Semua kategori
•	TC0003: Menguji fitur pencarian artikel
2.	Test untuk Website Utama Higo (higo.id):
•	TC0001: Mengecek tampilan halaman utama
•	TC0002: Mengecek menu navigasi
•	TC0003: Mengecek bagian footer website
•	TC0004: Menguji form kontak untuk layanan:
o	HIGOspot
o	Layanan Digital Agency
o	WiFi Advertising
Setiap nomor TC (Test Case) berisi skenario pengujian khusus. Contohnya TC0002 di blog memiliki 6 skenario berbeda untuk menguji filter kategori artikel yang berbeda-beda.
