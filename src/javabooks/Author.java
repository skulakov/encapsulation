package javabooks;

class Author {

    private String name; // Закрытое поле

    // Constructor
    public Author(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Settter
    public void setName(String name) {
        this.name = name;
    }
}
