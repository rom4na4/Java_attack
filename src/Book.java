public class Book{
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getYear(){
        return this.year;
    }

    public int setYear(int year){
        this.year = year;
        return year;
    }

    @Override
    public String toString(){
        return "Название книги: " + this.title + ". Её автор: " + this.author + ". Год публикации книги: " + this.year;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book another = (Book) other;
        return title.equals(another.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}
