public class PenjualanDiskon implements StrategiPenjualan {
    @Override
    public double penjualan(double harga) {
        return harga - (harga*18)/100;
    }
}