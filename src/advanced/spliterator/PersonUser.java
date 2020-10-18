package advanced.spliterator;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class PersonUser {

    public static void main(String[] args) {
        List<Person> persons = Person.socialNetwork();
        
        CheckPerson checker = (Person p) -> p.getAge()>22;
        printPersons(persons, (p)->p.getAge()>22);
        printPersonsOlderThan(persons, 18);
        
        printPersonsYoungerThan(persons, 20);
        printPersonsWithGender(persons, Gender.FEMALE);
    }
    
    static void printPersons(List<Person> persons, CheckPerson checkPerson){
        for (Person p: persons) {
            if(checkPerson.check(p)){
                System.out.println(p);
            }
        }
    }
    
    static void printPersonsWithTheRange(List<Person> persons, LocalDate min, LocalDate max){
        for (Person p : persons) {
            if (p.getBirthday().getYear() >= min.getYear() && p.getBirthday().getYear()<=max.getYear()) {
                System.out.println(p);
            }
        }
    }
    static void printPersonsOlderThan(List<Person> persons, int age){
        for (Person p : persons) {
            if (p.getAge()>age) {
                System.out.println(p);
            }
        }
    }
    static void printPersonsYoungerThan(List<Person> persons, int age){
        for (Person p : persons) {
            if (p.getAge() < age) {
                System.out.println(p);
            }
        }
    }
    static void printPersonsWithGender(List<Person> persons, Gender spol){
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getGender().equals(spol)){
                System.out.println(next);
            }
        }
    }
}
