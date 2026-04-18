public class Organizer {
    private String name;
    private Event[] organizedEvents = new Event[4];
    private int organizedCount;

    public Organizer() {
        System.out.println("Please provide the organizer's name");
    }

    public Organizer(String name) {
        this.name = name;
    }

    public void organizeEvent(Event event) {
        if (organizedCount < organizedEvents.length) {
            organizedEvents[organizedCount++] = event;
        }
        System.out.println(name + " successfully organized " + event.getName());
    }

    public void searchEventByDate(String date) {
        int idy = -1;
        for(int i = 0; i < organizedCount; i++) {
            if(organizedEvents[i].getDate() == date) {
                idy = i;
            }
        }

        if(idy == -1) {
            System.out.println("No event is scheduled for " + date);
        } else {
            System.out.println(organizedEvents[idy].getName());
        }
    }
}
