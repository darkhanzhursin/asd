package observer.propertyChangeListener;


public class Application {

	public static void main(String[] args) {
		StockService stockService = new StockService();
		HistoryLogger historyLogger= new HistoryLogger();
		Trader trader = new Trader();
		StockNotifier stockNotifier = new StockNotifier();

		stockService.addPropertyChangeListener(historyLogger);
		stockService.addPropertyChangeListener(trader);
		stockService.addPropertyChangeListener(stockNotifier);


		stockService.changeStockValue("AMZN", 2310.80);
		stockService.changeStockValue("MSFT", 890.45);

	}
}
