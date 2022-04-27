package model;

public class Article extends AbstractMaterial {

    private String journal;

    public Article() {

    }

    public Article(String author,
                   String title,
                   String category,
                   String language,
                   int year,
                   String documentType,
                   String journal) {
        super(author, title, category, language, year, documentType);
        this.journal = journal;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }
}
