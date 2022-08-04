abstract class OrderProcessTemplate{
    public boolean isGift;
 
    public abstract void doSelect();
    public abstract void doPayment();
    public abstract void doDelivery();
 
    public final void Pesanan(){
        try{
            System.out.println("Pesanan sukses");
        }
        catch (Exception e){
            System.out.println("Pesanan gagal");
        }
    }
 
 
    public final void processOrder(boolean isGift){
        doSelect();
        doPayment();
        if (isGift) {
            Pesanan();
        }
        doDelivery();
    }
}

class OnlineOrder extends OrderProcessTemplate{
    @Override
    public void doSelect(){
        System.out.println("Barang telah masuk ke dalam keranjang");
        System.out.println("Pilih barang untuk di check out");
        System.out.println("Silahkan masukan alamat.");
    }
 
    @Override
    public void doPayment(){
        System.out.println("Silahkan pilih metode pembayaran");
    }
 
    @Override
    public void doDelivery(){
        System.out.println("Pengiriman akan dikirm ke alamat yang telah tercatat");
    }
 
}
class StoreOrder extends OrderProcessTemplate{

    @Override
    public void doSelect(){
        System.out.println("Silahkan memilih barang.");
    }
 
    @Override
    public void doPayment(){
        System.out.println("Silahkan Melakukan Pembayaran");
    }
 
    @Override
    public void doDelivery(){
        System.out.println("Barang berhasil diantarkan.");
    }
}
public class Template {
    public static void main(String args[]){
        OrderProcessTemplate OnlineOrder = new OnlineOrder();
        OnlineOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
    
}
