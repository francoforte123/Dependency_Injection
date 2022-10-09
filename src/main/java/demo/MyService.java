package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    MyService(MyComponent myComponent){
        this.myComponent= myComponent;
    }

    public String getName(){
       return myComponent.getMyComponentName();
    }
}
