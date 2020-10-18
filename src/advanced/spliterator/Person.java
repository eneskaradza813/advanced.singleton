package advanced.spliterator;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String name;
    private final String surname;
    private final Gender gender;
    private final LocalDate birthday;

    public Person(String name, String surname, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
       
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }
    public int getAge(){
       LocalDate currentDate = LocalDate.now();
       int years = birthday.until(currentDate).getYears();
       return years;
    }

    @Override
    public String toString() {
        return name + ", " + surname + " " + gender.getName() + ", birthday" + birthday;
    }
    
    
    public static List<Person> socialNetwork(){
        List<Person> socialNetworkList = new ArrayList<>();
        socialNetworkList.add(new Person("Amar", "Hodzic", Gender.MALE, LocalDate.of(1992, Month.JANUARY, 17)));
        socialNetworkList.add(new Person("Smajo", "Vrebac", Gender.MALE, LocalDate.of(2000, Month.APRIL, 13)));
        socialNetworkList.add(new Person("Sejad", "Karadza", Gender.MALE, LocalDate.of(1995, Month.DECEMBER, 11)));
        socialNetworkList.add(new Person("Kemal", "Duranovic", Gender.MALE, LocalDate.of(2002, Month.MARCH, 01)));
        socialNetworkList.add(new Person("Suvad", "Karadza", Gender.MALE, LocalDate.of(1990, Month.JUNE, 8)));
        socialNetworkList.add(new Person("Sabir", "Makic", Gender.MALE, LocalDate.of(1997, Month.NOVEMBER, 27)));
        socialNetworkList.add(new Person("Rasim", "Turanovic", Gender.MALE, LocalDate.of(2003, Month.OCTOBER, 27)));
        return socialNetworkList;
    }

}
