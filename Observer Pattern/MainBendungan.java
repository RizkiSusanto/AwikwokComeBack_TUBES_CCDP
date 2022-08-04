public class MainBendungan {
    public static void main(String[] args) throws InterruptedException {
        Bendungan bendungan = new Bendungan();
        int ketinggian;

        new BendunganObserver(bendungan);

        for( ketinggian=135; ketinggian < 210; ketinggian=ketinggian+10 ) {
            bendungan.setKetinggianAir(ketinggian);
            Thread.sleep(1000);
        }
    }
}