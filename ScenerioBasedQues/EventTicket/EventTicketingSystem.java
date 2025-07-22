import java.util.*;

class  EventTicketingSystem {
    private HashMap<String, Queue<Attendee>> eventMap;

    public EventTicketingSystem() {
        eventMap = new HashMap<>();
    }
    public void createEvent(String eventName) {
        if (eventMap.containsKey(eventName)) {
            System.out.println("Event already exists");
        } else {
            eventMap.put(eventName, new LinkedList<>());
            System.out.println("Event '"+eventName+"' created");
        }
    }
    public void bookTicket(String eventName, Attendee attendee) {
        if (!eventMap.containsKey(eventName)) {
            System.out.println("Event not found: "+eventName);
            return;
        }
        eventMap.get(eventName).offer(attendee);
        System.out.println(attendee.getName() + " booked for " + eventName);
    }
    public int getPosition(String eventName, String attendeeEmail) {
        if (!eventMap.containsKey(eventName)) {
            System.out.println("Event not found: " + eventName);
            return -1;
        }
        Queue<Attendee> queue = eventMap.get(eventName);
        int position = 1;
        for (Attendee att : queue) {
            if (att.getEmail().equalsIgnoreCase(attendeeEmail)) {
                return position;
            }
            position++;
        }
        return -1;
    }
    public void printQueue(String eventName) {
        if (!eventMap.containsKey(eventName)) {
            System.out.println("Event not found.");
            return;
        }
        Queue<Attendee> queue = eventMap.get(eventName);
        if (queue.isEmpty()) {
            System.out.println("No attendees in the queue yet.");
        } else {
            System.out.println("Queue for " + eventName + ":");
            for (Attendee a : queue) {
                System.out.println(" - " + a);
            }
        }
    }
}