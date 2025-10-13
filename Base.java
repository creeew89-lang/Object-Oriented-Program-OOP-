public class Base extends BaseEntity {
    private String title;
    private String author;

    public Base(int id, String createdDate, String updatedDate, String title) {
        super(id, createdDate, updatedDate);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
