package HW6;

public class MathTeacher extends Teacher {
    protected MathTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
    @Override
    public String toString() {
        return "MathTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
//  Наследуемый класс может заменить родительский