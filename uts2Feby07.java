import java.util.Scanner;

public class uts2Feby07 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaBarang = "";
        int jumlahStok = 0 ;
        int pilihan;
        int penyesuaian;
        int permintaan; 
        double hargaPerUnit;
        boolean selesai = false;

        System.out.println("Masukkan nama barang: ");
        namaBarang = sc.nextLine();

        System.out.println("Masukkan jumlah stok barang: ");
        jumlahStok = sc.nextInt();

        System.out.println("Masukkan harga per unit: ");
        hargaPerUnit = sc.nextDouble();

        do {
            System.out.println("\n=== Menu Stok Barang ===");
            System.out.println("1. Cek Stok");
            System.out.println("2. penyesuaian Stok (Tambah/Kurangi)");
            System.out.println("3. Kelola Permintaan Produk");
            System.out.println("4. Keluar dan Tampilkan Hasil");
            System.out.println("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Stok barang '" + namaBarang + "': " + jumlahStok + " unit.");
                    System.out.println("Total nilai stok: Rp" + (jumlahStok * hargaPerUnit));
                    break;
                case 2: 
                    System.out.print("Masukkan jumlah stok yang ingin ditambahkan/dikurangi (gunakan angka negatif untuk pengurangan): ");
                    penyesuaian = sc.nextInt();
                    jumlahStok += penyesuaian;

                    if (jumlahStok < 0) {
                        jumlahStok = 0;
                        System.out.println("Stok tidak boleh krang dari 0");
                    }
                    System.out.println("Stok baru: " + jumlahStok + " unit");
                    break;
                case 3:
                    System.out.println("Masukkan jumlah permintaan produk: ");
                    permintaan = sc.nextInt();

                    if (permintaan <= jumlahStok) {
                        System.out.println("Permintaan dapat dipenuhi, stok berkurang.");
                        jumlahStok -= permintaan;
                    } else {
                        System.out.println("Stok tidak mencukupi.");
                    }
                    System.out.println("Sisa stok: " + jumlahStok + " unit. ");
                    break;
                case 4: 
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            } 
        } while (!selesai);
        System.out.println("\n=== Informasi Akhir Stok Barang ===");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Sisa Stok: " + jumlahStok + " unit.");
        System.out.println("Harga per Unit: Rp" + hargaPerUnit);
        System.out.println("Total Nilai Stok: Rp" + (jumlahStok * hargaPerUnit));
   } 
}
