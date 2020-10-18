package advanced.two;

import advanced.spliterator.Gender;
import advanced.spliterator.Gender;
import advanced.spliterator.Person;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.function.Predicate;

public class PersonExecutor {

    public static void main(String[] args) {
        
        List<Person> persons = Person.socialNetwork();
        PersonExecutor personExecutor = new PersonExecutor();
        CheckPerson checker = new CheckPerson() {
            @Override
            public boolean check(Person person) {
                return person.getGender().equals(Gender.FEMALE);
                }
        };
        CheckPerson checkerDame = p-> p.getGender().equals(Gender.FEMALE);
        
        personExecutor.printPersonWithGender(persons, Gender.FEMALE);
        personExecutor.printPersonsOlderThan(persons, LocalDate.of(0, Month.MARCH, 0));
        personExecutor.printPersonsYoungerThan(persons, LocalDate.of(2000, Month.MARCH, 1));
    }
    void printPerson(List<Person> persons, CheckPerson checkPerson){
        persons.stream()
                .filter(p-> checkPerson.check(p))
                .forEach(it->System.out.println(it));
    }
    
    <E> void printElements(List<E> elements, Predicate<E> tester){
        elements.stream().filter(tester).forEach(e->System.out.println(e));
    }
    
     void printPersonWithGender(List<Person> persons, Gender gender){
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            if (p.getGender().equals(gender)) {
                System.out.println(p);
            }
        }
    }
     void printPersonsOlderThan(List<Person> persons, LocalDate date){
         for(Person p: persons){
             if(p.getBirthday().isBefore(date)){
                 System.out.println("Ti si person: " + p);
             }
         }
     }
     void printPersonsYoungerThan(List<Person> persons, LocalDate date){
        persons.stream().filter(p->p.getBirthday().isAfter(date)).forEach(to->System.out.println(to));
         
     }
     void printPersonsBetweenDates(List<Person> persons, LocalDate fromDate, LocalDate toDate){
         persons.stream()
                 .filter(p->p.getBirthday().isAfter(fromDate))
                 .filter(p->p.getBirthday().isBefore(toDate))
                 .forEach(it->System.out.println(it));
     }
}
