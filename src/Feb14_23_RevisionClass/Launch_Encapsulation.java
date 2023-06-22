package Feb14_23_RevisionClass;

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Launch_Encapsulation {
    public static void main(String[] args) {

        Student st = new Student();
        st.setName("Aamir");
        st.setAge(27);
        System.out.println(st.getName());
        System.out.println(st.getAge());

        Student st1 = new Student();
        st1.setName("Azlaan");
        st1.setAge(28);

        System.out.println(st1.getName());
        System.out.println(st1.getAge());
    }
}
