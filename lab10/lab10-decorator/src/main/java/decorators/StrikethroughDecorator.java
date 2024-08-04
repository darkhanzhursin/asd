package decorators;

public class StrikethroughDecorator extends BaseDecorator {

    public StrikethroughDecorator(IHtmlConverter wrapped) {
        super(wrapped);
    }

    @Override
    public void convert(String text) {
        super.convert("<s>" + text + "</s>");
    }
}
