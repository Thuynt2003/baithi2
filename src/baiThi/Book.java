package baiThi;

public class Book {
    private Integer idBook;
    private String nameBook;
    private  String authorBook;
    private Integer priceBook;

    public Book(Integer idBook, String nameBook, String authorBook, Integer priceBook) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.priceBook = priceBook;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(Integer priceBook) {
        this.priceBook = priceBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }
}
