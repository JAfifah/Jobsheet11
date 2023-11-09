import java.util.Scanner;

public class projectkel9BookingHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double saldo = 0;
        String[] daftarKamar = { "Kamar Standar ", "Kamar Deluxe ", "Kamar Suite " };
        double[] hargaKamar = { 200000, 400000, 800000 };
        int pilihanKamar;
        int[] ketersediaanKamar = { 5, 3, 2 };
        String[] kamarTerbooking = new String[10];
        int jumlahKamarTerbooking = 0;
        String next;

        System.out.println();
        System.out.println("Selamat datang di Tidurin.Aja!");

        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Saldo");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. List Kamar Terbooking");
            System.out.println("4. Keluar");
            System.out.print("Pilih nomor (1/2/3/4): ");
            pilihan = input.nextInt();
            System.out.println();
            input.nextLine();

            if (pilihan == 1) {
                System.out.println("Saldo anda sekarang: " + saldo);
                System.out.println("Menu");
                System.out.println("1. Tambah saldo");
                System.out.println("2. Kembali");
                System.out.print("Pilih nomor (1/2): ");
                int pilihanSaldo = input.nextInt();
                input.nextLine();

                if (pilihanSaldo == 1) {
                    System.out.print("Masukkan nominal saldo yang ditambahkan: ");
                    double tambahanSaldo = input.nextDouble();
                    input.nextLine();
                    saldo += tambahanSaldo;
                    System.out.println("Saldo Anda sekarang: " + saldo);
                } else if (pilihanSaldo == 2) {

                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Kamar:");
                for (int i = 0; i < daftarKamar.length; i++) {
                    System.out.println((i + 1) + ". " + daftarKamar[i] + hargaKamar[i] + "/malam - Tersedia: " + ketersediaanKamar[i]);
                }

                System.out.print("Pilih jenis kamar (1/2/3): ");
                pilihanKamar = input.nextInt();
                pilihanKamar--;

                if (pilihanKamar >= 0 && pilihanKamar < daftarKamar.length) {

    if (ketersediaanKamar[pilihanKamar] > 0) {
        System.out.print("Jumlah kamar: ");
        int jumlahKamar = input.nextInt();
        input.nextLine();
        
        if (jumlahKamar <= ketersediaanKamar[pilihanKamar]) { 
            System.out.print("Berapa hari anda akan menginap: ");
            int jumlahHari = input.nextInt();
            input.nextLine();

            double totalPembayaran = hargaKamar[pilihanKamar] * jumlahHari * jumlahKamar;
            System.out.println();
            System.out.println("Total yang harus anda bayar sebesar: " + totalPembayaran);

            if (saldo >= totalPembayaran) {
                saldo -= totalPembayaran;
                ketersediaanKamar[pilihanKamar] -= jumlahKamar;
                kamarTerbooking[jumlahKamarTerbooking] = daftarKamar[pilihanKamar] + " - " + jumlahKamar+ " Kamar - " + jumlahHari + " hari";
                jumlahKamarTerbooking++;
                System.out.println("Pembayaran berhasil!");
                System.out.println("Sisa saldo anda: " + saldo);
                System.out.println("Sisa kamar " + daftarKamar[pilihanKamar] + ": " + ketersediaanKamar[pilihanKamar]);

            } else {
                System.out.println("Saldo tidak mencukupi untuk pembayaran ini.");
            }
        } else {
            System.out.println("Kamar tidak mencukupi untuk pemesanan ini.");
        }
    } else {
        System.out.println("Kamar tidak tersedia.");
    }
} else {
    System.out.println("Pilihan tidak valid.");
}


            } else if (pilihan == 3) {
                System.out.println("Kamar yang sudah terbooking: ");
                       
                if (jumlahKamarTerbooking == 0) {
                    System.out.println("Belum ada kamar yang terbooking.");
                     System.out.println("Kembali ke menu? (y/n)");
                        next = input.nextLine();

                        if (next.equalsIgnoreCase("y")) {
                            continue;
                        }
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                } else {
                    for (int i = 0; i < jumlahKamarTerbooking; i++) {
                        System.out.println(kamarTerbooking[i]);
                        
                    }
                     System.out.println("Kembali ke menu? (y/n)");
                        next = input.nextLine();

                        if (next.equalsIgnoreCase("y")) {
                            continue;
                        }
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                }

            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Sampai jumpa.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");

                input.close();
            }
        }
    }
}