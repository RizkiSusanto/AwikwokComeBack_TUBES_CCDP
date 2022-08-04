public class BelSepeda implements DetailSuaraKendaraan {
    @Override
    public void SuaraSepedaMotor(String nama_kendaraan) {}

    @Override
    public void SuaraSepeda(String nama_kendaraan) {
        System.out.println(nama_kendaraan + " berbunyi Kring Kring ~");
    }
}