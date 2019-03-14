package javabooks;

public class Book {

    private String title;
    Author[] authors;

    public static void main(String[] args) {

        Book bookName = new Book();

        Author[] authors = {
            new Author("Петров"),
            new Author("Иванов"),
            new Author("Сидоров")
        };

        // Тэсты
        bookName.setTitle("Водолаз в горах Кавказа");
        System.out.println(bookName.getTitle());
        System.out.println(bookName.toString());
        System.out.println(authors[0].getName() + "\n");

        String books[] = new String[5];
        bookName.setTitle("Баба Яга в тылк врага");
        books[0] = "Название " + "\"" + bookName.getTitle() + "\"" + "; Автор " + authors[0].getName();
        bookName.setTitle("На троих");
        books[1] = "Название " + "\"" + bookName.getTitle() + "\"" + "; Автор " + authors[1].getName();
        bookName.setTitle("Меняю собаку на паровоз");
        books[2] = "Название " + "\"" + bookName.getTitle() + "\"" + "; Автор " + authors[2].getName();
        bookName.setTitle("Воскресный день в аду");
        books[3] = "Название " + "\"" + bookName.getTitle() + "\"" + "; Автор " + authors[1].getName();
        bookName.setTitle("Зелёный слоник");
        authors[0].setName("Пупкин");
        books[4] = "Название " + "\"" + bookName.getTitle() + "\"" + "; Авторы " + authors[0].getName() + ", " + authors[1].getName();

        for (String ss : books) {
            System.out.println(ss);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
