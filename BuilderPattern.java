class Distribusi 
{
  private String barangmasuk;
  private int barangrusak;
  private int barangpromosi;
  
  public String getbarangmasuk() 
  {
    return this.barangmasuk;
  }
  
  public int getbarangrusak() 
  {
    return this.barangrusak;
  }
  
  public int getbarangpromosi()
  {
    return this.barangpromosi;
  }
  
  private Distribusi(distributor builder)
  {
    this.barangmasuk= builder.barangmasuk;
    this.barangrusak = builder.barangrusak;
    this.barangpromosi = builder.barangpromosi;
  }
  
  public static class distributor
  {
    private String barangmasuk;
    private int barangrusak;
    private int barangpromosi;
    
    public distributor(String barangmasuk, int barangrusak)
    {
      this.barangmasuk= barangmasuk;
      this.barangrusak = barangrusak;
    }
    
    public distributor setbarangpromosi(int barangpromosi) 
    {
      this.barangpromosi = barangpromosi;
      return this;
    }
    
    public Distribusi build() 
    {
      return new Distribusi(this);
    }
  }
}

public class BuilderPattern
{
  public static void main(String[] args) 
  {
    Distribusi truk = new Distribusi.distributor("Truk", 4).setbarangpromosi(4).build();
    Distribusi kargo = new Distribusi.distributor("Kargo", 2).build();
    
    System.out.println(truk.getbarangmasuk());
    System.out.println(truk.getbarangrusak());
    System.out.println(truk.getbarangpromosi());
    
    System.out.println(kargo.getbarangmasuk());
    System.out.println(kargo.getbarangrusak());
    System.out.println(kargo.getbarangpromosi());
  }
}
