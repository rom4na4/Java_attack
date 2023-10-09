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

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        return "Название книги: " + this.title + ". Её автор: " + this.author + ". Год публикации книги: " + this.year;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book another = (Book) other;
        if (title.equals(another.title) && this.year == another.year && author.equals(another.author)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title + year + author);
    }
}
