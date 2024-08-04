package decorators;

public class UnderlineDecorator extends BaseDecorator {

    public UnderlineDecorator(IHtmlConverter wrapped) {
        super(wrapped);
    }

    @Override
    public void convert(String text) {
        super.convert("<u>" + text + "</u>");
    }
}
