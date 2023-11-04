package HW6;

public abstract class Teacher {

    protected String firstName;
    protected String lastName;


    protected Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
//  Класс стал абстрактным
//  Поля стали защищёнными
//  Класс закрыт для модификаций, открыт для расширений
//  Неиспользуемые функции убраны