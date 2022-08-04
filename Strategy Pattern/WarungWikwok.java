import java.util.Scanner;

public class WarungWikwok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double harga;
        int bulan;
        HargaJual harga_jual;

        System.out.print("Masukkan harga barang: ");
        harga = in.nextDouble();
        System.out.print("Masukkan bulan sekarang dalam angka: ");
        bulan = in.nextInt();
        if(bulan==1 || bulan==7) {
            harga_jual = new HargaJual(new PenjualanDiskon());
        } else
        {
            harga_jual = new HargaJual(new PenjualanNormal());
        }
        System.out.println("Harga barang pada bulan ini adalah: Rp." + harga_jual.lakukanStrategiPenjualan(harga));
    }
}