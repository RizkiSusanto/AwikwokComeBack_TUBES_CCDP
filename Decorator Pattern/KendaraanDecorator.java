public abstract class KendaraanDecorator implements Kendaraan {
    protected Kendaraan decorated_kendaraan;

    public KendaraanDecorator(Kendaraan decorated_kendaraan) {
        this.decorated_kendaraan = decorated_kendaraan;
    }

    public void maju() {
        decorated_kendaraan.maju();
    }
}