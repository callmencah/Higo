Selenium With java And TestNG
Untuk menjalankannya bisa langsung running file “testng.xml”

Berikut penjelasan sederhana dari kode XML di atas:
Ini adalah konfigurasi test automation (pengujian otomatis) untuk website Higo yang terbagi menjadi 2 bagian:
<p>1.	Test untuk Blog Higo (blog.higo.id):
<p>•	TC0001: Mengecek tampilan halaman utama blog
<p>•	TC0002: Menguji filter kategori artikel:
<p>o	Update HIGOes
<p>o	Hangout
<p>o	Lifestyle
<p>o	Tech & Social
<p>o	Business Tip
<p>o	Semua kategori
<p>•	TC0003: Menguji fitur pencarian artikel
<p>2.	Test untuk Website Utama Higo (higo.id):
<p>•	TC0001: Mengecek tampilan halaman utama
<p>•	TC0002: Mengecek menu navigasi
<p>•	TC0003: Mengecek bagian footer website
<p>•	TC0004: Menguji form kontak untuk layanan:
<p>o	HIGOspot
<p>o	Layanan Digital Agency
<p>o	WiFi Advertising
<p>Setiap nomor TC (Test Case) berisi skenario pengujian khusus. Contohnya TC0002 di blog memiliki 6 skenario berbeda untuk menguji filter kategori artikel yang berbeda-beda.
