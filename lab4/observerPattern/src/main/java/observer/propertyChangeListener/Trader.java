package observer.propertyChangeListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Trader implements PropertyChangeListener {
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		trade((Stock)evt.getNewValue());
	}

	public void trade(Stock stock) {
		System.out.println("Trader trade stock :" + stock);
	}
}
