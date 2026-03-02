public class Employee {
    public String name;
    public String title;
    public double salary;

    public void newEmployee(String name){
        this.name = name;
        this.title = "junior";
        this.salary = 30000.0;
    }

    public void displayInfo(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary + " Tk");
        System.out.println("Employee Designation: " + this.title);
    }

    public void calculateTax(){
        if(salary <= 30000.0){
            System.out.println("No need to pay tax");
        } else if(salary > 30000.0 && salary <= 50000.0){
            System.out.println(this.name + " Tax Amount: " + this.salary*0.1 + " Tk");
        } else if(salary > 50000.0){
            System.out.println(this.name + " Tax Amount: " + this.salary*0.3 + " Tk");
        }
    }

    public void promoteEmployee(String title){
        this.title = title;
        if(title.toLowerCase() == "senior"){
            this.salary += 25000.0;
        } else if(title.toLowerCase() == "lead"){
            this.salary += 50000.0;
        } else if(title.toLowerCase() == "manager"){
            this.salary += 75000.0;
        }

        System.out.println(this.name + " has been promoted to " + this.title);
        System.out.println("New Salary: " + this.salary + " Tk");
    }
}