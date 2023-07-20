package April_10_23_IO_Operation;
//Serialization: to secure objects securely

import java.io.*;

//Fore securing Cricketer class implement Serializable interface
class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs)
    {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}
public class Serialization {
    public static void main(String[] args) throws IOException {
        Cricketer cric = new Cricketer("Aamir", 28, 98);

        //After securing class
        FileOutputStream fos = new FileOutputStream("CreateFile");

        //Using BufferedOutputStream for enhancing the efficiency of FileOutputStream
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        //Calling an object which has secured data
        oos.writeObject(cric);

        oos.flush();   //Making sure that assuring the data will be sent to the file for output
        oos.close();   //It is mandatory to close the resource
    }
}
/*
In order to secure any class, we have to 'implements' that particular class with inbuilt 'interface' called "Serializable"
 Method implementation not required; internally JVM will do implementations which ever required.
 */