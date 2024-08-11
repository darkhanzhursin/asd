package application;

@Service(name="three")
public class MyServiceThree {
    private String name = "myServiceThree";

    private void print(){
        System.out.println(name);
    }
}
