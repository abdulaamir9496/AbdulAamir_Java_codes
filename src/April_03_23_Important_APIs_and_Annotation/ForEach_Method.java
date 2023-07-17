package April_03_23_Important_APIs_and_Annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach_Method {
    public static void main(String[] args) {

        //Writing Array object's collection in multiple lines of code using 'add' method
        /*List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);*/

        //Writing Array object's collection in single line of code using 'Arrays.asList'
        List<Integer> list1 = Arrays.asList(11, 12, 13, 42, 50);
        System.out.println(list1);

        /*using advance for loop/ forEach loop/ enhanced for loop,
        This loop is an external loop introduced in java: 8
        few steps to write forEach loop as shown below
        */
        //Step1: Using Object
        /*for(Object o : list1)
        {
            System.out.println(o);
        }*/

        //Step2: We can specify which type of data we can use particularly
        /*for (Integer i : list1)
        {
            System.out.println(i);
        }*/

        /* Step3: Using inbuilt foreach method with lambda expression
        Without loop also we can use via inbuilt method to access the data
        Single abstract method, consumer implementation. Using foreach inbuilt with Lambda expression.
         */
        //list1.forEach(i -> System.out.println(i));

        /*
        If you don't want to give implementation directly, we can call via using accept method which is inbuilt in consumer method
         If using foreach method to process/access the data, without using any external loop
         We have to define the consumer body. Can also implement anonymous inner class
         */
        /*Consumer<Integer> cons = new Consumer<Integer>()
        {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        list1.forEach(cons);*/

        /*
        As we single parameter, we can skip other steps as shown below. And write in a single line
         */
        /*Consumer<Integer> cons = i -> System.out.println(i);  //Written definition here and giving implementations to consumer interface
        list1.forEach(cons);     //passing the consumer-defined body here.*/

        //Instead, we can do it in a single line as shown below:
        list1.forEach(i -> System.out.println(i));    //inbuilt loop using foreach loop with lambda (Introduced in java: 8)
    }
}
