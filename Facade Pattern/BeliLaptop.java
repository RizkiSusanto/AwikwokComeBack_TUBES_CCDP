public class BeliLaptop {
    private Laptop asus;
    private Laptop acer;
    private Laptop lenovo;

    public BeliLaptop() {
        asus = new Asus();
        acer = new Acer();
        lenovo = new Lenovo();
    }

    public void BeliAsus() {
        asus.Beli();
    }

    public void BeliAcer() {
        acer.Beli();
    }

    public void BeliLenovo() {
        lenovo.Beli();
    }
}