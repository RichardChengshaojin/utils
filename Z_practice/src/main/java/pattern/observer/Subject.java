package pattern.observer;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/9/15
 */
public interface Subject {
    
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
