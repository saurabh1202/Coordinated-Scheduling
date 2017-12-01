package trafficSimulation4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EventList  {
	
	public static PriorityQueue<Event> eq = new PriorityQueue<Event>(11,new Comparator<Event>() {
											public int compare(Event e1 , Event e2) {
												return e1.compareTo(e2);
											}
		
									});
	public static void queue(Event e) {
		eq.add(e);
	}
	public static Event getEvent() {
		
		Event e = eq.peek();
		return e;
	}
	public static void dequeue() {
		eq.remove();
	}
}