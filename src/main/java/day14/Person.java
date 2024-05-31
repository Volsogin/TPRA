package day14;

public class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{name='" + name + "', year=" + age + "}";
        }

        // Getters and setters can be added if needed

}
