package March_27_23_Map_and_Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//More on HashMap class
class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
    public String toString()
    {
        return name + " " + age + " " + city;
    }
}

public class MoreOnHashMap_Class {
    public static void main(String[] args) {
        Student std1 = new Student("Muhammad", 25, "Tolichowki");
        Student std2 = new Student("Abdul", 27, "Madhapur");
        Student std3 = new Student("Aamir", 28, "Gachibowli");

        Map map = new HashMap();
        map.put(01, std1);
        map.put(02, std2);
        map.put(03, std3);

        System.out.println(map);

        Set entrySet = map.entrySet();
        Iterator itr = entrySet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
