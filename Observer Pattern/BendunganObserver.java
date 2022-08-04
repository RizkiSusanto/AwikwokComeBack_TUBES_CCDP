public class BendunganObserver extends Observer {
    public BendunganObserver(Bendungan bendungan) {
        this.bendungan = bendungan;
        this.bendungan.attach(this);
    }

    @Override
    public void update() {
        int ketinggian_air = bendungan.getKetinggianAir();
        System.out.println("\nKetinggian air: " + ketinggian_air + "cm");
        if(ketinggian_air<140 && ketinggian_air>0) {
            System.out.println("Status: Normal");
        } else if(ketinggian_air > 140 && ketinggian_air < 200) {
            System.out.println("Status: Siaga");
        } else if(ketinggian_air > 200) {
            System.out.println("Status: Waspada");
        }
    } 
}