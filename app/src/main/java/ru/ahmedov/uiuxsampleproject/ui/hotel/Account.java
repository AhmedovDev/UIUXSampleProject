package ru.ahmedov.uiuxsampleproject.ui.hotel;



public class Account  {

    // Это поля в них будут сохраняться значения, которые будут приходить с конструктора.
    // По умолчанию значения в них null.

    private int image;
    private String name;
    private String address;

    // Это конструктор класса Account, он создает объект данного класса.
    // Имя конструктора должно быть такоеже как и у его класса.
    // Конструктор позволяет создать объект с определенным количеством полей (переменных).
    // У определенного класса может быть несколько конструкторов, которые будут принимать разлчный
    // набор параметров
    public Account(int image,String name, String address) {

        this.image = image;
        this.name = name;
        this.address = address;
    }

    // Этотгеттеры онинужны для того чтобы организовать инкапсуляцию в классе. Т.е. мы не будем
    // видеть приватные поля класса, а будем видеть публичные методы, которые будут предоставлять
    // нам приватные поля.

    public int getImage() { return  image; }

    public void setImage() { this.image = image; }

    public String getName() { return  name; }

    public void setName() { this.name = name; }

    public String getAddress() { return  address; }

    public void setAddres() { this.address = address; }
}

/*
public class Account {

    // Это поля в них будут сохраняться значения, которые будут приходить с конструктора.
    // По умолчанию значения в них null.
    private String id;
    private String name;
    private String age;
    private int image;

    // Это конструктор класса Account, он создает объект данного класса.
    // Имя конструктора должно быть такоеже как и у его класса.
    // Конструктор позволяет создать объект с определенным количеством полей (переменных).
    // У определенного класса может быть несколько конструкторов, которые будут принимать разлчный
    // набор параметров
    public Account(String id, String name, String age, int image) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.image = image;
    }



    // Этотгеттеры онинужны для того чтобы организовать инкапсуляцию в классе. Т.е. мы не будем
    // видеть приватные поля класса, а будем видеть публичные методы, которые будут предоставлять
    // нам приватные поля.
    public String getId() { return id; }

    public void setId(String id) {this.id = id;}

    public String getName() { return name; }

    public void setName(String name) {this.name = name;}

    public String getAge() { return age; }

    public void setAge(String age) { this.age = age; }

    public int getImage() { return this.image; }

    public void setImage(int image) { this.image = image; }
}
*/

