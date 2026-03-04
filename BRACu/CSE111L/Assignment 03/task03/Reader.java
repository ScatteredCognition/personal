public class Reader {
    String name;
    int capacity = 2;
    int currentBook = -1;
    String[] book = new String[capacity];

    public Reader(String name){
        this.name = name;
        System.out.println("A new reader is created!");
    }

    public Reader(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.book = new String[this.capacity];
        System.out.println("A new reader is created!");
    }

    public void readerInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Books: ");

        if(currentBook > -1){
            for(int i = 0; i < this.currentBook; i++){
                System.out.println("Book " + (i +1) + ": " + this.book[i]);
            }
        } else {
            System.out.println("No books added yet");
        }
    }

    public void addBook(String bookName){
        if(this.currentBook < 0){
            this.currentBook = 0;
        }

        if(this.currentBook >= this.capacity){
            System.out.println("No more capacity");
        } else {
            this.book[this.currentBook] = bookName;
            this.currentBook++;
        }
    }

    public void updateCapacity(int capacity){
        // Copying the variables to new, expanded arrays
        // So a situation where the maxcount changes after
        // There are already items in the carts never happens

        // Swapping the old capacity
        int oldcapacity = this.capacity;
        this.capacity = capacity;
        
        // Copying old variables to new temp ones
        String[] booktemp = this.book;

        // Making new variables with updated array sizes
        this.book = new String[this.capacity];
        
        // Update book names from temp variables
        for(int i = 0; i < oldcapacity; i++){
            this.book[i] = booktemp[i];
        }
    }
}