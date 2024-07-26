package observer.propertyChangeListener;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class HistoryLogger implements PropertyChangeListener {
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		log((Stock)evt.getNewValue());
	}

	  public void log(Stock stock) {
	    System.out.println("HistoryLogger log stock :" + stock);;
	  }
}
