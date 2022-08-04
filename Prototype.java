interface DatabasePrototype{
    Database Database_clone();
}
 
abstract class Database implements DatabasePrototype{
    abstract void PenyimpananData();
}
 
class DatabaseType1 extends Database{
    private int Penyimpanan, Cadangan;
    DatabaseType1(int Penyimpanan,int Cadangan){
        super();
        this.Penyimpanan = Penyimpanan;
        this.Cadangan = Cadangan;
    }
 
    void PenyimpananData(){
        System.out.println("Penyimpanan");
    }
    public Database Database_clone(){
        return new DatabaseType1(this.Penyimpanan,this.Cadangan);
    }
 
    @Override
    public String toString() {
        String str = "Penyimpanan: " + this.Penyimpanan + " Cadangan: " + this.Cadangan;
        return str;
    }
 
 
}
public class Prototype {
    public static void main(String args[]){
        Database v = new DatabaseType1(100, 150);
        System.out.println(v);
        Database clone = v.Database_clone();
        System.out.println(clone);
    }
 
}
