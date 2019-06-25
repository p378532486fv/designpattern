package cn.chen.designpattern.observer.observable;

import java.util.Observable;

/**
 * @ClassName NewspaperOffice
 * @Description TODO
 * @Author chen
 * @Date 2019/6/25 20:24
 **/
public class NewspaperOffice extends Observable {

    public void stateChanged(){
        setChanged();
        if(hasChanged()){
            notifyObservers();
        }
    }
}
