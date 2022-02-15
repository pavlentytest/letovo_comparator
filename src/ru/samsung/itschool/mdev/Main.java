package ru.samsung.itschool.mdev;

import java.lang.reflect.AnnotatedArrayType;
import java.util.*;

public class Main {

    public static void main(String[] args) {
/*
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList add to the end -  "+(endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add to the end - "+(endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList add to the begin - "+(endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add to the begin- "+(endTime-startTime));

        startTime = System.nanoTime();
        for(int i=75000;i<150000;i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList get - "+(endTime-startTime));

        startTime = System.nanoTime();
        for(int i=75000;i<150000;i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList get - "+(endTime-startTime));

        // Stack - LIFO
        // Queue - FIFO

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s); // добавление в стек
            queue.offer(s); // добавление в очередь
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+ " " ); // Удаление элемента и его возврат
        }
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // с начала очереди возвращаем и удаляем
        }
*/
        // Collections - класс
        // Collection - интерфейс

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Maria");

        Collections.sort(names);

        class Country {
            private String name;
            private int pupulation;

            public Country(String name, int pupulation) {
                this.name = name;
                this.pupulation = pupulation;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPupulation() {
                return pupulation;
            }

            public void setPupulation(int pupulation) {
                this.pupulation = pupulation;
            }
        }

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("USA",300000));
        countries.add(new Country("Germany",80000));
        countries.add(new Country("Russia",150000));
        countries.add(new Country("France",70000));

        Comparator<Country> rule = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                //return o1.getPupulation()-o2.getPupulation();
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(countries,rule);
        for(Country c: countries) {
            System.out.println(c.getPupulation() + "-" + c.getName());
        }

        class Animal implements Comparable<Animal> {
            public String name;
            public byte age;

            public Animal(String name, byte age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(Animal o) {
                return this.age - o.age;
            }
        }

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Barsik",(byte) 8));
        animals.add(new Animal("Bobik",(byte) 18));
        animals.add(new Animal("Mumu",(byte) 10));

        Collections.sort(animals);

        for(Animal a: animals) {
            System.out.println(a.age + "-" + a.name);
        }

    }
}
