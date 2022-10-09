package demo;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    MyComponent(){
        this.myComponentName= "Emmanuele La Duca";
    }

    public String getMyComponentName(){
        return "myComponentImmutableName";
    }


}
