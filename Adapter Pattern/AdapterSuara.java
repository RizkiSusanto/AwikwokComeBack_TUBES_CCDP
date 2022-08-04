public class AdapterSuara implements SuaraKendaraan {
    DetailSuaraKendaraan detail_suara_kendaraan;

    public AdapterSuara(String jenis_kendaraan) {
        if(jenis_kendaraan.equalsIgnoreCase("Sepeda")) {
            detail_suara_kendaraan = new BelSepeda();
        } else if(jenis_kendaraan.equalsIgnoreCase("Sepeda Motor")) {
            detail_suara_kendaraan = new KlaksonMotor();
        }
    }

    @Override
    public void suara(String jenis_kendaraan, String nama_kendaraan) {
        if(jenis_kendaraan.equalsIgnoreCase("Sepeda")) {
            detail_suara_kendaraan.SuaraSepeda(nama_kendaraan);
        } else if(jenis_kendaraan.equalsIgnoreCase("Sepeda Motor")) {
            detail_suara_kendaraan.SuaraSepedaMotor(nama_kendaraan);
        }
    }
}