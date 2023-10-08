public class Lesson6_2 {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Лев", "Толстой");
        Book firstBook = new Book("Война и мир", firstAuthor, 1861);

        Author secondAuthor = new Author("Фёдор", "Достоевский");
        Book secondBook = new Book("Преступление и наказание", secondAuthor, 1866);

        secondBook.setYear(1867);

        System.out.println(firstBook.equals(secondBook));

        System.out.println(firstAuthor.hashCode());
    }
}
