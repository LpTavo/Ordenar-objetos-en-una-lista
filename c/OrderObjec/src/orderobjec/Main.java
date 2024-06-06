import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 35));
        
   
        System.out.println("Lista antes de ordenar:");
        for (Person person : people) {
            System.out.println(person);
        }
        
       
        Collections.sort(people);
        
  
        System.out.println("\nLista ordenada por nombre:");
        for (Person person : people) {
            System.out.println(person);
        }
        
        
        Collections.sort(people, new AgeComparator());
        
   
        System.out.println("\nLista ordenada por edad:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.getName());
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}
