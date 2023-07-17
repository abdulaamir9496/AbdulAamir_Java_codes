package April_03_23_Important_APIs_and_Annotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntroductionTo_StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 6, 7, 8);
        System.out.println(list);

        /*We want to update and modify the data in the list without affecting its original data in 'list'
        By using Stream API concept
        If we want to work on Stream, we can work. Will learn further.
         */
        Stream<Integer> streamData = list.stream();     //created stream to use collections' data,
        // without modifying the original values in collections' data

        /*long count = streamData.count();     //Gives count of data
        System.out.println(count);*/

        streamData.forEach(n -> System.out.println(n));        //enhanced inside foreach loop with lambda expression

        //We cannot work on the same stream if we have worked it on already.
        //streamData.forEach(n -> System.out.println(n));      //RunTime error: IllegalStateException


    }
}
