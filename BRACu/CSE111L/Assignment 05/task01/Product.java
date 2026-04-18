public class Product {
  String name;
  int quantity = 0;
  static int maxQuantity = 45;
  static Product[] inventory = new Product[100];
  static int inventoryCount = 0;
  static int totalQuantity = 0;

  public Product(String name, int quantity) {
    if ((inventoryCount < Product.inventory.length) && ((Product.totalQuantity + quantity) <= Product.maxQuantity)) {
      this.name = name;
      this.quantity = quantity;
      Product.totalQuantity += quantity;
      Product.inventory[inventoryCount++] = this;
      System.out.println("Stored: " + name);
    } else {
      System.out.println("Storage is full! Cannot add " + name);
    }
  }

  public static void displayProducts() {
    System.out.println("=== Stored Products ===");
    for (int i = 0; i < Product.inventoryCount; i++) {
      Product product = Product.inventory[i];
      System.out.println(product.name + " - Qty: " + product.quantity);
    }
  }

  public static void buy(String name, int amount) {
    Product product = null;
    for(int i = 0; i < Product.inventoryCount; i++) {
      if(name == Product.inventory[i].name) {
        product = Product.inventory[i];
      }
    }

    if (product == null) {
      System.out.println("Product not found");
    } else if (product.quantity < amount) {
      System.out.println("Quantity low");
    } else {
      product.quantity -= amount;
      System.out.println("Product Sold");
    }
  }

}
