public class Event {
    private String name;
    private String date;
    private static Event[] allEvents = new Event[5];
    private static int eventCount = 0;

    public Event(String name, String date) {
        this.name = name;
        this.date = date;
        Event.allEvents[Event.eventCount++] = this;
    }

    public String details() {
        return "Name: " + this.name + "\n" + "Date: " + this.date;
    }

    public static void allEventInfo() {
        System.out.println("Total Events: " + Event.eventCount);
        System.out.println("Event Details: ");
        for (int i = 0; i < Event.eventCount; i++) {
            System.out.println("Event " + (i + 1));
            System.out.println(Event.allEvents[i].details());
        }
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
