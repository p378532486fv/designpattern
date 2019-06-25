package cn.chen.designpattern.observer.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Person
 * @Description TODO
 * @Author chen
 * @Date 2019/6/25 20:25
 **/
public class Person implements Observer {

    @Getter
    @Setter
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name+"看到了订阅新闻");
    }
}
