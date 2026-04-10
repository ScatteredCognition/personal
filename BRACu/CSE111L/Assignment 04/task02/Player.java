public class Player {
    String name = "";
    int hp = 0;
    String[] defeated = new String[1024];
    int defeatedCount = 0;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.defeated = new String[1024];
        System.out.println(name + " joined the game");
        System.out.println("HP: " + hp);
    }

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.defeated = new String[1024];
        System.out.println(name + " joined the game");
        System.out.println("HP: " + hp);
    }

    public void viewInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Current HP: " + hp);

        if (defeatedCount > 0) {
            System.out.println("Defeated: ");
            for (int i = 0; i < defeatedCount; i++) {
                System.out.print(defeated[i] + ", ");
            }
            System.out.println();
        }
    }

    void defeatVillainCore(char boostChar, String vName, int vHp) {
        
        if ((boostChar >= '1') && (boostChar <= '9')) {
            int boost = Character.getNumericValue(boostChar);
            this.hp = (this.hp * boost);
            System.out.println("HP with " + boost + "x boost: " + this.hp);
        }

        if (this.hp >= vHp) {
            this.defeated[defeatedCount] = vName;
            this.defeatedCount++;
            System.out.println("defeated " + vName);
            this.hp += vHp;

        } else {
            System.out.println("failed to defeat " + vName);
        }
    }

    public void defeatVillain(String vName, int vHp) {
        this.defeatVillainCore('0', vName, vHp);
    }

    public void defeatVillain(char boostChar, String vName, int vHp) {
        this.defeatVillainCore(boostChar, vName, vHp);
    }

    public void defeatVillain(Player villain) {
        this.defeatVillainCore('0', villain.name, villain.hp);
    }

}
