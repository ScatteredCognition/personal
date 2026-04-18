public class Character {
    String name;
    String group;
    int health;
    static Character character[] = new Character[128];
    static int curChCount = 0;
    int id = Character.curChCount + 1;

    public Character(String name, String group, int health) {
        this.name = name;
        this.group = group;
        this.health = health;
        Character.character[curChCount++] = this;
    }

    public Character(String name, int health) {
        this.name = name;
        this.group = "Teen";
        this.health = health;
        Character.character[curChCount++] = this;
    }

    public static void printStats() {
        int kids = 0;
        int teens = 0;
        int adults = 0;
        double avgHealth = 0;
        double totalHealth = 0;
        int cHealth = 0;
        int strongest = -1;

        for(int i = 0; i < curChCount; i++){
            if(Character.character[i] != null) {
                totalHealth += Character.character[i].health;
                cHealth++;
                if(strongest == -1) {
                    strongest = i;
                }
                if(Character.character[strongest].health < Character.character[i].health){
                    strongest = i;
                }

                if(Character.character[i].group == "Kid"){
                    kids++;
                } else if(Character.character[i].group == "Teen"){
                    teens++;
                } else if(Character.character[i].group == "Adult"){
                    adults++;
                }
            }
        }

        avgHealth = totalHealth / (double) cHealth;

        System.out.println("Total Characters: " + curChCount);
        System.out.println("Kids: " + kids);
        System.out.println("Teens: " + teens);
        System.out.println("Adults: " + adults);
        System.out.println("Average Health: " + avgHealth);
        System.out.println("Strongest Character: " );
        if(strongest == -1) {
            System.out.println("None");
        } else {
            System.out.println(Character.character[strongest].name + "(Health " + Character.character[strongest].health + ")");
        }
    }

    public void printDetails() {
        System.out.println("ID: " + this.id + ", Name: " + this.name);
        System.out.println("Group: " + this.group);
        System.out.println("Health: " + this.health);
    }
}
