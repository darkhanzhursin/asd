package observer.propertyChangeListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StockNotifier implements PropertyChangeListener {
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		handleStockChange((Stock)evt.getNewValue());
	}

	public void handleStockChange(Stock stock) {
		System.out.println("StockNotifier handle stock :" + stock);
	}
}
