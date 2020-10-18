/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.two;

import advanced.spliterator.Gender;
import advanced.spliterator.Person;
import java.util.List;

/**
 *
 * @author mesa
 */
public class SocialNetworkExecutor {
    
    public static void main(String[] args) {
        List<Person> listOfPersons = Person.socialNetwork();
        listOfPersons.stream().filter(p->p.getGender().equals(Gender.FEMALE)).map(p -> p.getName()).forEach(name -> System.out.println(name));
    }
}
