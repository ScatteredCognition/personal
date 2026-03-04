public class MoneyTracker {
    String name;
    double balance;
    double lastAdded;
    double lastSpent;

    public MoneyTracker(){
        System.out.println("A new money tracker has been launched.");
    }

    public String info(){
        return "Name: " + this.name + "\n" + "Current Balance: " + this.balance;
    }

    public void createTracker(String name){
        this.name = name;
        this.balance = 1;
        //System.out.println(this.info());
    }

    public void income(double income){
        this.balance += income;
        this.lastAdded = income;
        System.out.println("Balance Updated!");
    }

    public void expense(double expense){
        if(expense > this.balance){
            System.out.println("Not enough balance.");
        } else if(expense == this.balance){
            System.out.println("You're broke!");
            this.balance -= expense;
            this.lastSpent = expense;
        } else {
            System.out.println("Balance Updated.");
            this.balance -= expense;
            this.lastSpent = expense;
        }

    }

    public void showHistory(){
        System.out.println("Last added: " + this.lastAdded);
        System.out.println("Last spent: " + this.lastSpent);
    }
}
