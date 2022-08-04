public class TurboDecorator extends KendaraanDecorator {
    public TurboDecorator(Kendaraan decorated_kendaraan) {
        super(decorated_kendaraan);
    }

    @Override
    public void maju() {
        decorated_kendaraan.maju();
        setTurbo(decorated_kendaraan);
    }

    public void setTurbo(Kendaraan decorated_kendaraan) {
        System.out.println("Tambah turbo, gan!");
    }
}