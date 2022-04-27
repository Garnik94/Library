package model;

public class Book extends AbstractMaterial {

    private int pages;

    public Book() {
    }

    public Book(String author, String title, String category, String language, int year, String documentType, int pages) {
        super(author, title, category, language, year, documentType);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
