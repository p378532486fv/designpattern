package cn.chen.designpattern.observer;

import cn.chen.designpattern.observer.observable.NewspaperOffice;
import cn.chen.designpattern.observer.observer.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.List;

@SpringBootApplication
@PropertySource(value = "classpath:people.properties",encoding = "utf-8",ignoreResourceNotFound = true)
public class ObserverApplication {

    @Value("#{'${names}'.split(',')}")
    private List<String> names;

    public static void main(String[] args) {
        SpringApplication.run(ObserverApplication.class, args);
    }

    @Bean
    @Scope("singleton")
    public NewspaperOffice newspaperOffice(){
        NewspaperOffice newspaperOffice = new NewspaperOffice(){};
        for(String name:names){
            newspaperOffice.addObserver(new Person(name));
        }
        return newspaperOffice;
    }

}
