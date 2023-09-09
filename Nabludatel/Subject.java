package Nabludatel;

public interface Subject {
    public void registrationObserver(Observer o);
    public void removeObserver(Observer o);

    public void notifyObservers();
}
