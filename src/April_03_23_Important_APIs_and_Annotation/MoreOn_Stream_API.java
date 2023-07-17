package April_03_23_Important_APIs_and_Annotation;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MoreOn_Stream_API {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 2, 4, 5, 1, 3, 8, 6, 7);
        Stream<Integer> streamData = list.stream();     //created stream to use collections' data,
        // without modifying the original values in collections' data

        //Method 1: Count the collection's data
        /*long count = streamData.count();
        System.out.println(count);*/

        //Filtering:
//        Stream<Integer> filterData = streamData.filter(n -> n%2 == 0);

        //Sorting data:
//        Stream<Integer> sortedStream = filterData.sorted();

        //Map: by using a 'map' we can perform any calculations(double the value)
//        Stream<Integer> mapStream = sortedStream.map(n -> n*2);

        //Method 3: can be done by using anonymous inner class by implementing interface
        /*Predicate<Integer> pre = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        };*/

        //Method 3: Interface method using lambda expression in a single line the above anonymous class code
        //Predicate<Integer> pre = i -> i % 2 == 0;

        /*Method 2:
        NOTE: As we can see above filter, sort & map has the same return type (Stream),
        If we have the same 'return type' for the 'methods' we can do 'method chaining.'
        If the interface is a functional interface. Just by passing 'implementations.' We can do it using the lambda expression. As shown below:*/
        Stream<Integer> finalStream = streamData.filter(n -> n%2 == 0).sorted().map(n -> n * 2);
        finalStream.forEach(n -> System.out.println(n));

        //Method 3:
        /*Stream<Integer> finalStream = streamData.filter(pre).sorted().map(n -> n * 2);
        finalStream.forEach(n -> System.out.println(n));*/

        //Method 1: Iterating the stream
        //mapStream.forEach(n -> System.out.println(n));

        /*Once we have consumed the stream, we cannot run using the same stream
        If we try to use we get Run Time error: IllegalStateException
         */
        //streamData.forEach(i -> System.out.println(i));


    }
}

/*
Functional interface: It has only 1 abstract method
We can implement functional interface in general class, anonymous inner class or using lambda expression
 */