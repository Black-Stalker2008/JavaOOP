package HW6;

public class Main {
    public static void main(String[] args) {
        ClassOfTeachers<Teacher> teachers = new ClassOfTeachers<>("teachers");
        teachers.add(new PhysicsTeacher("Vitaly", "Sergeevich"));
        teachers.add(new MathTeacher("Galina", "Evgenievna"));

        for (int index = 0; index < teachers.count(); index++) {
            System.out.println(teachers.get(index));
        }
    }
}