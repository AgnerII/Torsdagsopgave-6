package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Kalle", new ArrayList<>(Arrays.asList("Programming","Danish","Java 1.0")));
        Student s2 = new Student("Jens", new ArrayList<>(Arrays.asList("Programming","Danish")));
        Student s3 = new Student("Hanne", new ArrayList<>(Arrays.asList("Programming","Danish")));

        Teacher t1 = new Teacher("Signe", new ArrayList<>(Arrays.asList("Programming","Danish")));
        Teacher t2 = new Teacher("Tess", new ArrayList<>(Arrays.asList("Programming","Danish")));
        Teacher t3 = new Teacher("Dan", new ArrayList<>(Arrays.asList("Programming","Danish","Java 1.0")));

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);

        for (Person p : persons) {
            boolean add = p.addCourse("Java 1.0");
            if(add == false){
                if(p instanceof Student){
                    System.out.println(p.getName()+": "+"Student has already passed the course");
                }
                else if(p instanceof Teacher) {
                    System.out.println(p.getName()+": "+"Teacher cannot teach this course");
                }
            }
        }
    }
}
