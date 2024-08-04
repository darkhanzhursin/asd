import decorators.*;

public class Application {

    public static void main(String[] args) {
        IHtmlConverter converter =
                new BoldDecorator(
                        new ItalicDecorator(
                            new UnderlineDecorator(
                                    new StrikethroughDecorator(
                                            new BasicText()
                                    )
                            )
                        )
                );

        converter.convert("Hello World!");
    }
}
