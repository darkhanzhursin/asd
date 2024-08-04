package decorators;

public class BaseDecorator implements IHtmlConverter {

    private final IHtmlConverter wrapped;

    public BaseDecorator(IHtmlConverter wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void convert(String text) {
        wrapped.convert(text);
    }
}
