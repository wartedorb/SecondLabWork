import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    public String groupNumber;
    public ArrayList<Student> groupMates = new ArrayList<>();

    public void addStudent(Student newStudent){
        groupMates.add(newStudent);
    }
    public Student getByNumber(int serialNumber) {
        for(Student student: groupMates) {
            if (student.number == serialNumber) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(Student student){
        groupMates.remove(student);
    }
    public List<Student> getAll(){
        return new ArrayList<>(groupMates);
    }
    public Map<Integer, Integer> getCountByAge(){
        Map<Integer, Integer> studentMap = new HashMap<>();
        for(Student student : groupMates){
            if(!studentMap.containsKey(student.age)){
                int numOfStudents = 0;
                for(Student stud : groupMates){
                    if(stud.age == student.age) {
                        numOfStudents += 1;
                    }
                }
                studentMap.put(student.age, numOfStudents);
            }
        }
        return studentMap;
    }
    public List<Student> getByMinScore(double score){
        List<Student> studentList = new ArrayList<>();
        for(Student student: groupMates) {
            if(student.averageScore >= score) {
                studentList.add(student);
            }
        }
        return studentList;
    }
    public void printInfo(){
        System.out.println("Группа: " + groupNumber + "\n");
        for(Student student : groupMates){
            student.printInfo();
        }
    }
}
