public class HargaJual {
    private StrategiPenjualan strategi_penjualan;

    public HargaJual(StrategiPenjualan strategi_penjualan) {
        this.strategi_penjualan = strategi_penjualan;
    }

    public double lakukanStrategiPenjualan(double harga) {
        return strategi_penjualan.penjualan(harga);
    }
}