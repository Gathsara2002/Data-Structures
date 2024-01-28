package Lists;

import java.util.LinkedList;

/**
 * @author : Gathsara
 * created : 1/28/2024 -- 3:46 PM
 **/

//linkedist eka hadila tiiyenne node valin
//hama node ekakma previos node eka ha next node ekath ekka ink ekak tiyagannava
//first node - head
//last node - tail

public class LinkedListDemo {

    public static void main(String[] args) {

        //initialize
        LinkedList<Person> list = new LinkedList<>();

        //add data
        list.add(new Person("John", 20));
        list.add(new Person("Mark", 30));

        //add to first
        list.addFirst(new Person("Sam", 24));

        //print
        list.forEach(System.out::println);
    }

    static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
