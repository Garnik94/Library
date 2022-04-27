package model;

public abstract class AbstractMaterial {

    private String author;
    private String title;
    private String category;
    private String language;
    private int year;
    private String documentType;

    public AbstractMaterial() {

    }

    public AbstractMaterial(
            String author,
            String title,
            String category,
            String language,
            int year,
            String documentType) {
        this.author = author;
        this.title = title;
        this.category = category;
        this.language = language;
        this.year = year;
        this.documentType = documentType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
}
