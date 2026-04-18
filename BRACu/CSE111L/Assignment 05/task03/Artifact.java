public class Artifact {
    private String name;
    private String owner;
    private static Artifact[] vault = new Artifact[4];
    private static int vaultCount = 0;

    public Artifact(String name) {
        this.name = name;
        this.owner = "Okabe";
    }

    public Artifact(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public static void AddtoVault(Artifact a) {
        if(vaultCount < vault.length){
            Artifact.vault[vaultCount++] = a;
            System.out.println(a.GetOwner() + " added " + a.GetName() + " successfully to the vault.");
        } else {
            System.out.println("!!" + a.GetOwner() + " unsuccessful in adding artifact to the vault!!");
        }
        
    }

    public static void labReport() {
        System.out.println("=== Future Gadget Lab ===");
        for(int i = 0; i < vaultCount; i++) {
            Artifact a = Artifact.vault[i];
            a.revealArtifact();
        }
    }

    public static String strongest() {
        String sName = "";
        int most = 0;        
        
        for(int i = 0; i < vaultCount; i++) {
            Artifact a = Artifact.vault[i];
            if(a.CalcPower() > most) {
                sName = a.GetName();
            }
        }

        return sName;
    }

    public String GetName() {
        return name;
    }
    public String GetOwner() {
        return owner;
    }

    public int CalcPower() {
            int power = 0;
            int offset = 0;
            String name = this.GetName();

            if((name.length() % 2) != 0) {
                offset = 1;
            }

            for(int i = offset; i < name.length(); i += 2) {
                power += (int) name.charAt(i);
            }

            return power;
    }

    public void revealArtifact() {
        System.out.println(this.GetName() + " added by " + this.GetOwner() + " has power of " + this.CalcPower());
    }

    public void changeName(String newName) {
        this.name = newName;
        System.out.println("Name changed and power recalculated.");
    }
}
