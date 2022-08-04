
abstract class TV 
{
    Remote remote;
    TV(Remote r) 
    {
        this.remote = r;
    }
    abstract void on();
    abstract void off();
}

class Sony extends TV
{
    Remote remoteType;
    Sony(Remote r) 
    {
        super(r);
        this.remoteType = r;
    }
  
    public void on()
    {
        System.out.print("Sony TV (Gudang) ON: ");
        remoteType.on();
    }
    
    public void off()
    {
        System.out.print("Sony TV (Gudang) OFF: ");
        remoteType.off();
    }
}
    
class Philips extends TV 
{
    Remote remoteType;
    Philips(Remote r) 
    {
        super(r);
        this.remoteType = r;
    }
  
    public void on()
    {
        System.out.print("Philips (Kantor) TV ON: ");
        remoteType.on();
    }
    
    public void off()
    {
        System.out.print("Philips (Kantor) TV OFF: ");
        remoteType.off();
    }
}

interface Remote
{
    public void on();
    public void off();
}

class OldRemote implements Remote 
{
    @Override
    public void on()  
    {
        System.out.println("Di nyalakan dari ruang pengawas");
    }

    @Override
    public void off() 
    {
        System.out.println("Di matikan dari ruang pengawas");
    }
  
}

class NewRemote implements Remote 
{
    @Override
    public void on() 
    {
        System.out.println("Di nyalakan dari ruang pengawas");
    }

    @Override
    public void off() 
    {
        System.out.println("Di matikan dari ruang pengawas");
    }
}

public class BridgePattern 
{
    public static void main(String[] args) 
    {
        TV sonyOldRemote = new Sony(new OldRemote());
        sonyOldRemote.on();
        sonyOldRemote.off();
        System.out.println();
    
        TV sonyNewRemote = new Sony(new NewRemote());
        sonyNewRemote.on();
        sonyNewRemote.off();
        System.out.println();
    
        TV philipsOldRemote = new Philips(new OldRemote());
        philipsOldRemote.on();
        philipsOldRemote.off();
        System.out.println();
    
        TV philipsNewRemote = new Philips(new NewRemote());
        philipsNewRemote.on();
        philipsNewRemote.off();  
    }
}