package author;

public class Book {
    private String name;
    private double price;
    private int qtyInStock;
    Author author = new Author("Author","email@yahoo.com",'m');

    public Book(String name, double price, int qtyInStock, Author author) {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.author = author;
    }

    public Book (String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}


