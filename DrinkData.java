import java.util.ArrayList;
import java.util.Iterator;


public class DrinkData implements Subject {
    private int pepsi = 0; 
    private int coke = 0; 
    private int fanta = 0; 
    
    private double amount = 0.0; 
    ArrayList<Observer> observerList;
    
    public DrinkData() {
    observerList = new ArrayList<Observer>();
    }
    
    @Override
    public void registerObserver(Observer o) {
    observerList.add(o);
    }
    
    @Override
    public void unregisterObserver(Observer o) {
    observerList.remove(observerList.indexOf(o));
    }
    
    @Override
    public void notifyObservers() {
    for (Iterator<Observer> it = observerList.iterator(); it.hasNext();) {
    Observer o = it.next();
    o.update( pepsi, coke, fanta, amount);
    }
    }
    
    private int getPepsi() {
    return pepsi;
    }
    
    private int getCoke() {
    return coke;
    }
    
    private int getFanta() {
    return fanta;
    }
    
    
    private void setPepsi(int n) {
    pepsi += n;
    }
    
    private void setCoke(int n) {
    coke += n;
    }
    
    private void setFanta(int n) {
    fanta += n;
    }
    
    private double setamount() {
    amount = ( 2 * getPepsi()) + ( 1.5 * getCoke()) + ( 2.5 * getFanta()) ;
    return amount;
    }
    
    public void dataChanged( int pepsi, int coke, int fanta) {
    setPepsi(pepsi);
    setCoke(coke);
    setFanta(fanta);
    setamount();
    
    notifyObservers();
    }
    }
    