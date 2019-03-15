/**
 * ДЗ
 * Создайте класс Book и Author 
 * Книгу могут написать много авторов 
 * (в классе Book есть поле Author[] authors) 
 * Создайте конструкторы, get/set (где необходимо сделайте проверку), 
 * также метод toString()
 * Создайте массив из 5 книг
 */
package javabooks;

public class Book {

    private String title; // Закрытое поле
    Author[] authors;

    public static void main(String[] args) {
        
// Экзэмпляр класса Book 
        Book bookName = new Book();
// Экзэмпляр класса Author 
        Author[] authors = {
            new Author("Петров"),
            new Author("Иванов"),
            new Author("Сидоров")
        };

        // Подгружаем название книги через Settter
        bookName.setTitle("Водолаз в горах Кавказа");
        // Выводим название книги через Getter
        System.out.println(bookName.getTitle());
        // Проверка метода toString
        System.out.println(bookName.toString());
        // Выводим имя автора через Getter
        System.out.println(authors[0].getName() + "\n");

        // Объявляем массив из 5 книг
        String books[] = new String[5];
        
        bookName.setTitle("Баба Яга в тылу врага");
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
    // Getter
    public String getTitle() {
        return title;
    }
    // Settter
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
