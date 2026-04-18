public class Animalkeepers {
    public static String[] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
    public static Animalkeepers[] kDuty = new Animalkeepers[5];
    public static int akCount;
    public String[] task = new String[5];
    public static int taskCount = 0;
    public static int idCounter = 100;
    private int id;
    public String name;
    
    public Animalkeepers(String name) {
        this.id = ++Animalkeepers.idCounter;
        this.name = name;
        System.out.println(this.name + " with ID " + this.id + " got the job!");
        akCount++;
    }
    
    public static void details() {
        if(Animalkeepers.akCount > 0) {
        System.out.println("Total Animal Keeper: " + Animalkeepers.akCount);
        System.out.println("Total Task assigned: " + Animalkeepers.taskCount);
        Animalkeepers.printTasks();
        } else {
            System.out.println("No Animal Keepers working yet.");
        }
    }
    
    public static void printTasks() {
        int tc = 0;
        for(int i = 0; i < Animalkeepers.kDuty.length; i++) {
            if(Animalkeepers.kDuty[i] != null) {
                String task = Animalkeepers.kDuty[i].task[i];
                String name = Animalkeepers.kDuty[i].name;
                String animal = Animalkeepers.Animals[i];
                System.out.println(task + " (Keeper - " + name + ") === " + animal);
                tc++;
            }
        }

        if(tc == 0) {
            System.out.println("No tasks assigned.");
        }
    }
    
    public void doTask(String animal, String task) {
        int arc = -1;
        for(int i = 0; i < Animalkeepers.Animals.length; i++) {
            if(animal == Animalkeepers.Animals[i]) {
                arc = i;
            }
        }

        if(arc != -1) {
            this.task[arc] = task;
            if(Animalkeepers.kDuty[arc] == null) {
                taskCount++;
            }
            Animalkeepers.kDuty[arc] = this;
            System.out.println("Task assigned to " + this.name);
        } else {
            System.out.println("Animal not in the Safari");
        }
    }
}
