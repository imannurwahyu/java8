package TugasPT7;
import java.util.*;

public class TOSERBA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI TOKO SERBA ADA");
        System.out.println("********************************");
        
        System.out.println("DAFTAR KODE BARANG:");
        System.out.println("Kode  | Nama Barang | Harga");
        System.out.println("============================");
        System.out.println("001   | Pulpen      | 15000");
        System.out.println("002   | Buku        | 50000");
        System.out.println("003   | Pensil      | 8000");
        System.out.println("004   | Spidol      | 17000");
        System.out.println("005   | Penghapus   | 5000");
        System.out.println("============================");
        
        System.out.print("Masukkan Jumlah Item: ");
        int jumlahItem = scanner.nextInt();
        
        String[] kodeProduk = new String[jumlahItem];
        String[] namaProduk = new String[jumlahItem];
        int[] hargaSatuan = new int[jumlahItem];
        int[] kuantitas = new int[jumlahItem];
        int[] totalHarga = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data Produk ke-" + (i + 1));
            System.out.print("Masukkan Kode Produk: ");
            kodeProduk[i] = scanner.next();
            System.out.print("Masukkan Kuantitas: ");
            kuantitas[i] = scanner.nextInt();

            switch (kodeProduk[i]) {
                case "001":
                    namaProduk[i] = "Pulpen";
                    hargaSatuan[i] = 15000;
                    break;
                case "002":
                    namaProduk[i] = "Buku";
                    hargaSatuan[i] = 50000;
                    break;
                case "003":
                    namaProduk[i] = "Pensil";
                    hargaSatuan[i] = 8000;
                    break;
                case "004":
                    namaProduk[i] = "Spidol";
                    hargaSatuan[i] = 17000;
                    break;
                case "005":
                    namaProduk[i] = "Penghapus";
                    hargaSatuan[i] = 5000;
                    break;
                default:
                    namaProduk[i] = "Tidak Dikenal";
                    hargaSatuan[i] = 0;
                    break;
            }

            totalHarga[i] = hargaSatuan[i] * kuantitas[i];
        }

        System.out.println("\nDAFTAR BELANJA");
        System.out.println("****************");
        System.out.println("No  Kode Produk  Nama Produk  Harga  Kuantitas  Total Harga");
        System.out.println("===========================================================");
        
        int jumlahBayarKeseluruhan = 0;
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-4d%-13s%-14s%-7d%-11d%d\n",
                    (i + 1), kodeProduk[i], namaProduk[i], hargaSatuan[i], kuantitas[i], totalHarga[i]);
            jumlahBayarKeseluruhan += totalHarga[i];
        }

        System.out.println("===========================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t " + jumlahBayarKeseluruhan);
        System.out.println("===========================================================");
    }
}
