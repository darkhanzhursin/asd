package observer.propertyChangeListener;


import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class StockService {
	private PropertyChangeSupport support= new PropertyChangeSupport(this);

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

	public void changeStockValue(String stockName, double value) {
		Stock stock = new Stock(stockName, value);
		support.firePropertyChange("stock", null, stock);
	}

}
