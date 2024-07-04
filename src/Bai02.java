import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Bai02 {

    public static void main(String[] args) {
        Integer[] array = {1, 7, 18, 25, 77, 300, 101};

        List<Integer> list = Arrays.asList(array);

        // Find the second largest element
        Function<List<Integer>, String > function = new Function<List<Integer>, String>() {
            @Override
            public String apply(List<Integer> integers) {
                String result = "secondLargest: ";
                result += secondLargest(integers) ;
                result += "\nsmallestElement:" + smallestElement(integers);
                return result;
            }
        };


        System.out.println(function.apply(list));


    }

    public static Integer secondLargest(List<Integer> list){
        Integer secondLargest = list.stream()
                .distinct()
                .sorted((a, b) -> b-a)
                .skip(1)
                .findFirst()
                .orElse(null);
       return secondLargest;
    }

    public static Integer smallestElement(List<Integer> list){
        Integer smallestElement = list.stream()
                .distinct()
                .sorted((a, b) -> a-b)
                .findFirst()
                .orElse(null);

       return smallestElement;
    }


}
