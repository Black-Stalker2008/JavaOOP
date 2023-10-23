package HW4;


public class PhysicsTeacher extends Teacher{

    protected PhysicsTeacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "PhysicsTeacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}