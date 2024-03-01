package org.example;

import java.util.ArrayList;

public class NotificacaoVideo implements ISubject{

    private ArrayList<IObserver> observers;
    private Video video;

    public NotificacaoVideo(Video video) {
        this.video = video;
        this.observers = new ArrayList<>();
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public void subscriber(IObserver obs) {
        this.observers.add(obs);
    }

    @Override
    public void unSubscriber(IObserver obs) {
        for (int index = this.observers.size() - 1; index >= 0; index--) {
            if(this.observers.get(index) == obs){
                this.observers.remove(index);
            }
        }
    }

    @Override
    public void subscriberAll() {
        this.observers.clear();
    }

    @Override
    public void notifyObserver(IObserver obs) {
        obs.update(this.video);
    }

    @Override
    public void notifyAllObservers() {
        this.observers.forEach(obs -> {
            this.notifyObserver(obs);
        });
    }
}
