package counter;

import state.CounterState;

public class Counter {
	
	private int count=0;

	private CounterState counterState;

	public void setCounterState(CounterState counterState) {
		this.counterState = counterState;
	}

	public void increment(){
		counterState.increment();
		Printer.print(count);
	}
	
	public void decrement(){
		counterState.decrement();
		Printer.print(count);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
