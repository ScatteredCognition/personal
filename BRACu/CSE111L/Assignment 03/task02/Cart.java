public class Cart {
    public int maxItemCount = 3;
    public String[] itemName = new String[maxItemCount];
    public double[] itemPrice = new double[maxItemCount];
    public int cartNumber;
    int currentItem = 0;
    double discount = 0;

    public void create_cart(int cartNumber){
        this.cartNumber = cartNumber;
        //// Copying the variables to new, expanded arrays
        //// So a situation where the maxcount changes after
        //// There are already items in the carts never happens
//
        //// Swapping the old max count
        //int oldItemCount = this.maxItemCount;
        //this.maxItemCount = maxItemCount;
        //
        //// Copying old variables to new temp ones
        //String[] itemNameTemp = this.itemName;
        //double[] itemPriceTemp = this.itemPrice;
//
        //// Making new variables with updated array sizes
        //this.itemName = new String[this.maxItemCount];
        //this.itemPrice = new double[this.maxItemCount];
        //
        //// Update name and price from temp variables
        //for(int i = 0; i < oldItemCount; i++){
        //    this.itemName[i] = itemNameTemp[i];
        //    this.itemPrice[i] = itemPriceTemp[i];
        //}
//
        //if(currentItem > this.maxItemCount){
        //    currentItem = this.maxItemCount;
        //}
        
    }

    public void addItem(String name, double price){
        if(this.currentItem >= this.maxItemCount){
            System.out.println("You already have " + this.maxItemCount + " items on your cart");
        } else {
            ++currentItem;
            this.itemName[currentItem-1] = name;
            this.itemPrice[currentItem-1] = price;
            System.out.println(this.itemName[currentItem-1] + " added to cart " + this.cartNumber + ".");
            System.out.println("You have " + (this.currentItem + 0) + " item(s) in your cart now." );
        }
    }

    // Shim for the reversed naming stuff
    public void addItem(double price, String name){
        this.addItem(name, price);
    }

    public void cartDetails(){
        System.out.println("Your cart" + "(c" + this.cartNumber + ")" +" :");
        double total = 0;
        for(int i = 0; i < this.currentItem; i++){
            total += this.itemPrice[i];
        }
        total *= ((100.0 - this.discount)/100.0);

        for(int i = 0; i < this.currentItem; i++){
            System.out.println(this.itemName[i] + " - " + this.itemPrice[i]);
        }

        System.out.println("Discount Applied: " + this.discount + "%");
        System.out.println("Total Price: " + total);
    }

    public void giveDiscount(double discount){
        this.discount = discount;

    }
}
