package decorators;

public class BasicText implements IHtmlConverter {

    @Override
    public void convert(String text) {
        System.out.println(text);
    }
}
