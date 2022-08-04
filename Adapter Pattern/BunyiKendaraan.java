public class BunyiKendaraan implements SuaraKendaraan {
    AdapterSuara adapter_suara;

    @Override
    public void suara(String jenis_kendaraan, String nama_kendaraan) {
        if(jenis_kendaraan.equalsIgnoreCase("Sepeda") || jenis_kendaraan.equalsIgnoreCase("Sepeda Motor")) {
            adapter_suara = new AdapterSuara(jenis_kendaraan);
            adapter_suara.suara(jenis_kendaraan, nama_kendaraan);
        } else {
            System.out.println("Jenis kendaraan tidak diketahui.");
        }
    }
}