package Lists;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Gathsara
 * created : 1/28/2024 -- 3:01 PM
 **/

//Behavior එක - FIFO (First In First Out)  or LILO (Last In Last Out)
// queue interface ekak nisa implmenetation eka vidiyata linkedlist use karanava

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("John", 20));
        queue.add(new Person("Alex", 32));

        //show top element
        System.out.println(queue.peek());

        //remove element
        queue.poll();

        //size
        System.out.println(queue.size());

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
