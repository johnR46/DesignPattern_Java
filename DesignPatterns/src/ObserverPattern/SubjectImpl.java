import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class SubjectImpl implements ISubject {

    List<Observer> observerList = new ArrayList<Observer>();
    private int flag;

    /**
     * @return int return the flag
     */
    public int getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(int flag) {
        this.flag = flag;
        notiflyObserver();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);

    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);

    }

    @Override
    public void notiflyObserver() {
        observerList.forEach(v -> {
            v.update();
        });

    }

}