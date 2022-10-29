import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("FIRS TASK\n***************************************************************************");
        Circle circle = new Circle(2.0f);
        circle.getInfo();
        circle.setRadius(3f);
        circle.getInfo();

        Square square = new Square(2f);
        square.getInfo();
        square.setSide(3f);
        square.getInfo();

        Rectangle rectangle = new Rectangle(2f, 3f);
        rectangle.getInfo();
        rectangle.setLengthWidth(3f, 4f);
        rectangle.getInfo();


        System.out.println("SECOND TASK\n***************************************************************************");
        Student student1 = new Student(1, "Максим", "Кондрашов", 20, 4.1);

        // Инфо о студенте
        student1.printInfo();

        Student student2 = new Student(2, "Мария", "Евдищенко", 20, 4.6);
        Student student3 = new Student(3, "Эдуард", "Бикметов", 19, 3.4);
        Student student4 = new Student(4, "Стив", "Джобс", 21, 3.0);
        Student student5 = new Student(5, "Альберт", "Энштейн", 21, 5.0);

        Group group = new Group();
        group.groupNumber = "20704";

        // Добавление студентов
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);

        // Гет по номеру зачетки
        Student res = group.getByNumber(5);
        res.printInfo();

        // Получение списка баллов выше
        List<Student> studentArrayListScore = group.getByMinScore(4.1);
        System.out.println("Колво студентов средняя оценка которых больше заданной: " + studentArrayListScore.size());

        // Получение мапы возраст - колво
        Map<Integer, Integer> groupMap;
        groupMap = group.getCountByAge();
        System.out.println("Мапа: " + groupMap);

        // Получение всех студентов
        List<Student> groupMates = group.getAll();
        System.out.println(groupMates);

        // Удаление студента
        group.deleteStudent(student1);
        System.out.println(group.groupMates.size());

        // Получение всех студентов
        System.out.println("Списки не связаны" + groupMates);

        //Инфо о группе
        group.printInfo();
        System.out.println("***************************************************************************\n");
    }
}

