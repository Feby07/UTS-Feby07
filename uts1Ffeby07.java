import java.util.Scanner;

public class uts1Ffeby07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        double nilai;
        double totalNilai = 0;
        double rataRata = 0;
        int jumlahSiswa = 0;
        int diatasRataRata = 0;
        int dibawahRataRata = 0;
        boolean mayoritas;

        while (true) {
            System.out.println("Masukkan nama siswa: (ketik 'Selesai' untuk berhenti)");
            nama = sc.nextLine();
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.println("Masukkan nilai siswa: ");
            nilai = sc.nextDouble();
            sc.nextLine();

            jumlahSiswa++;
            totalNilai += nilai;
            rataRata = totalNilai / jumlahSiswa;
            if (nilai >= rataRata) {
                diatasRataRata++;
            } else {
                dibawahRataRata++;
            }
        }

        if (jumlahSiswa > 0) {
            System.out.println("\nRrata rata nilai kelas: " + rataRata);
            System.out.println("Jumlah siswa di atas rata rata: " + diatasRataRata);
            System.out.println("Jumlah siswa dibawah rata rata: " + dibawahRataRata);

            mayoritas = (diatasRataRata > jumlahSiswa / 2);
            if (mayoritas) {
                System.out.println("Mayoritas siswa yang memiliki nilai di atas rata rata: ");
            } else {
                System.out.println("Mayoritas siswa yang memiliki nilai di bawah rata rata: ");
            }
        } else {
            System.out.println("Tidak ada data yang dimasukkan");
        }
    }
}