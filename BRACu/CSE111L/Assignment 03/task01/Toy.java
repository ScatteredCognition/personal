public class Toy {
    public String name;
    public int price;

    public Toy(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("A new toy has been made!");
    }

    public void updateName(String newname){
        System.out.println("Changing old name: " + this.name);
        System.out.println("new name: " + newname);
        this.name = newname;
    }

    public void updatePrice(int newprice){
        this.price = newprice;
    }

    public void showPrice(){
        System.out.println("price: " + this.price + " Taka");
    }
}
