interface ISubject{

    void register(Observer o);
    void unregister(Observer o);
    void notiflyObserver();


}