public class Student {
    protected int number;
    protected String name;
    protected String lastName;
    protected int age;
    protected double averageScore;

    public Student(int number, String name, String lastName, int age, double averageScore) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + " " + lastName + "\nВозраст: " + age + "\nНомер зачётной книжки: " + number +
                "\nСредний балл: " + averageScore + "\n");
    }
}
