package April_10_23_IO_Operation;

import java.io.*;

//Deserialization
class Cricketer1
{
    private String name;
    private int age;
    private int runs;

    public Cricketer1 (String name, int age, int runs)
    {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}
public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cricketer1 cric1 = new Cricketer1("Muhammad", 28, 100);
        cric1.disp();

        FileOutputStream fos = new FileOutputStream("LocalDirectory");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(cric1);

        oos.flush();
        oos.close();

        //Using Deserialization
        /*FileInputStream fis = new FileInputStream("CreateFile");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer1 cr = (Cricketer1)ois.readObject();   //Down-casting for storing the crushed byte code back into program code from file
        cr.disp();

        ois.close();*/

    }
}
/*
After data stored in small crushed bytes in a file and secure.
How to bring back in program and How to Deserialization?
In Deserialization, we can reconstruct and use the crushed byte of code program
 */