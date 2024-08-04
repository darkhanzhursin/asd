package decorators;

public class ItalicDecorator extends BaseDecorator {

    public ItalicDecorator(IHtmlConverter wrapped) {
        super(wrapped);
    }

    @Override
    public void convert(String text) {
        super.convert("<i>" + text + "</i>");
    }
}
