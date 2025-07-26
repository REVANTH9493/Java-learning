class AuthorInitializer {
    private String name;
    private String email;
    private char gender;
    public AuthorInitializer(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;

    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return name+"\t" + "Email: "+ email+"\t" + "Gender: "+ gender;
    }
}


class Book {
    private String book_name;
    private int qtyInStock;
    private double price;
    private AuthorInitializer author;
    public Book(String book_name,AuthorInitializer author, int qtyInStock, double price){
        this.book_name = book_name;
        this.qtyInStock = qtyInStock;
        this.price = price;
        this.author = author;
    }
    public void setBook_name(String name){
        this.book_name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setqtyInStock(int books){
        this.qtyInStock = books;
    }
    public String getBook_name(){
        return book_name;
    }
    public double getPrice(){
        return price;
    }
    public int getqtyInStok(){
        return qtyInStock;
    }
    public String toString(){
        return "The name of the book: "+book_name + 
        "\n" + "Name of Author: " + author.toString() + 
        "\n" + "Price: " + price + 
        "\n" + "Quantity in stock: " + qtyInStock;
    }
}


public class Book_details {
    public static void main(String[] args) {
       AuthorInitializer au = new AuthorInitializer("Ziraya Uzumaki", "ziraya@gmail.com", 'M');
       Book b = new Book("The tale of Naruto Uzumaki", au, 100, 999.99);
       System.out.println(b.toString());

        
    
    }

}