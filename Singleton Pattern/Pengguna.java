public class Pengguna {
    private static Pengguna objek_pengguna = new Pengguna();

    private Pengguna(){}

    public static Pengguna InstansiasiObjek() {
        return objek_pengguna;
    }

    public void tampilPesan() {
        System.out.println("User sudah terinstansiasikan!");
    }
}