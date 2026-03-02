public class MobilePhone {
    int cMax;
    int cTotal;
    String cName[];
    int cNumber[];

    public void setContactCapacity(int cMax){
        int cMaxold = this.cMax;
        this.cMax = cMax;
        String cNametmp[] = new String[this.cMax];
        int cNumbertmp[] = new int[this.cMax];

        //copy contacts
        for(int i = 0; i < cMaxold; i++){
            cNametmp[i] = this.cName[i];
            cNumbertmp[i] = this.cNumber[i];
        }

        this.cName = new String[this.cMax];
        this.cNumber = new int[this.cMax];

        for(int i = 0; i < this.cMax; i++){
            this.cName[i] = this.cName[i];
            this.cNumber[i] = this.cNumber[i];
        }
    }

    public void details(){
        System.out.println("Total Contacts: " + this.cTotal);
        System.out.println("Contact List: ");

        for(int i = 0; i < this.cTotal; i++){
            System.out.println(this.cName[i] + ":" + this.cNumber[i]);
        }
    }

    public void addContact(String cName, int cNumber){
        if(this.cTotal >= this.cMax){
            System.out.println("Storage Full!!");
        } else {
            this.cName[this.cTotal] = cName;
            this.cNumber[this.cTotal] = cNumber;
            System.out.println("Contact of " + cName + " is added.");
            this.cTotal++;

        }
    }

    public void makeCall(int number){
        boolean called = false;
        for(int i = 0; i < this.cTotal; i++){
            if(number == cNumber[i]){
                System.out.println("Calling " + cName[i] + " . . .");
                called = true;
                break;
            }
        }

        if(called == false){
            System.out.println("Calling " + number + " . . .");
        }
    }
}
