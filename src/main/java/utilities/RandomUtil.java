package utilities;

import java.util.Random;
import java.util.UUID;

public class RandomUtil {
    public static String generateRandomName() {
        // Ambil 6 karakter dari UUID, bisa kamu sesuaikan
        String random = UUID.randomUUID().toString().replace("-", "").substring(0, 6);
        return "test" + random;
    }

    public static String generateRandomPhoneNumber() {
        Random rand = new Random();
        StringBuilder phone = new StringBuilder("+62");

        // Buat 9–11 digit acak setelah +62
        int length = 9 + rand.nextInt(3); // 9 sampai 11 digit
        for (int i = 0; i < length; i++) {
            phone.append(rand.nextInt(10)); // 0-9
        }

        return phone.toString();
    }

    public static String generateRandomMessage() {
        String[] samples = {
                "Test,Halo, saya tertarik dengan layanan HIGO.",
                "Test,Mohon info lebih lanjut tentang produk Anda.",
                "Test,Saya ingin konsultasi digital marketing.",
                "Test,Apakah HIGO bisa bantu pembuatan website?",
                "Test,Tolong hubungi saya secepatnya, terima kasih!",
                "Test,Saya ingin bekerja sama dengan HIGO untuk proyek bisnis saya.",
                "Test,Boleh tahu lebih lanjut soal layanan HIGOspot?",
                "Test,Apakah HIGO melayani pembuatan aplikasi mobile?",
                "Test,Tolong kirimkan penawaran untuk Integrated Digital Agency.",
                "Test,Saya butuh solusi digital untuk bisnis saya."
        };

        int idx = new Random().nextInt(samples.length);
        return samples[idx];
    }
}
