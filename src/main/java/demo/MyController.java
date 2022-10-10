package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService myService;

    MyController(MyService myService){
        this.myService= myService;
    }

    @GetMapping(value = "/")
    public String getMyService(){
        System.out.println("has been called");
        return "welcome";
    }

    @GetMapping(value = "/getName")
    public String getName(){
        return myService.getName();
    }


}
