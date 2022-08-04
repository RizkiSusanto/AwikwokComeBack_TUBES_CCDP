import java.util.ArrayList;
import java.util.List;

public class Bendungan {
    private List<Observer> observers = new ArrayList<Observer>();
    private int ketinggian_air;

    public int getKetinggianAir() {
        return this.ketinggian_air;
    }

    public void setKetinggianAir(int ketinggian_air_baru) {
        this.ketinggian_air = ketinggian_air_baru;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for(Observer obs : observers) {
            obs.update();
        }
    }

}