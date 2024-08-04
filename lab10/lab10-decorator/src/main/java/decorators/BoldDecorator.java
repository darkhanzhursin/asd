package decorators;

public class BoldDecorator extends BaseDecorator {

    public BoldDecorator(IHtmlConverter wrapped) {
        super(wrapped);
    }

    @Override
    public void convert(String text) {
        super.convert("<b>" + text + "</b>");
    }
}
