package April_10_23_IO_Operation;

import java.io.*;

//Transient selective serialization
class Cricketer2 implements Serializable
{
    private String name;
    private int age;
    transient private int runs;   //This data member of a class will not get serialized because of 'transient' keyword

    public Cricketer2(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}
public class Transient_Selective_Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Cricketer2 cric2 = new Cricketer2("Azlaan", 18, 500);
        cric2.disp();

        FileOutputStream fos = new FileOutputStream("CreateFile");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(cric2);

        oos.flush();
        oos.close();*/

        FileInputStream fis = new FileInputStream("CreateFile");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer2 cri = (Cricketer2) ois.readObject();
        cri.disp();

        ois.close();
    }
}
/*
If we don't want to use any members/properties of a class.
Then we can use 'transient' keyword
We cannot 'Deserialize' those 'member/properties of a class' which has not been 'Serialized'
 */