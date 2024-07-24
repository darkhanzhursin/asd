package command;

import paint.Shape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack {
	private List<Shape> list = new ArrayList<>();

	public void push(Shape shape) {
		list.add(shape);
	}

	public Shape pop() {
		Shape top = null;
		Iterator<Shape> iter = list.iterator();
		while (iter.hasNext()) {
			top = iter.next();
		}
		iter.remove();
		return top;
	}

	@Override
	public String toString() {
		return "Stack [list=" + list + "]";
	}	
}