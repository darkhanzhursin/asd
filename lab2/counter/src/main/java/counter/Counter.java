package counter;

import observer.Subject;
import state.CounterState;

public class Counter extends Subject {
	
	private int count=0;

	private CounterState counterState;

	public void setCounterState(CounterState counterState) {
		this.counterState = counterState;
	}

	public void increment(){
		counterState.increment();
		donotify(count);
	}
	
	public void decrement(){
		counterState.decrement();
		donotify(count);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
