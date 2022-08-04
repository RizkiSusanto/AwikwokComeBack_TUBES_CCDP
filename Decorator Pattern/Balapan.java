public class Balapan {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan mobil_turbo = new TurboDecorator(new Mobil());
        Kendaraan motor_turbo = new TurboDecorator(new Motor());

        System.out.println("Peserta No 1:");
        mobil.maju();

        System.out.println("Peserta No 2:");
        mobil_turbo.maju();

        System.out.println("Peserta No 3:");
        motor_turbo.maju();
    }
}