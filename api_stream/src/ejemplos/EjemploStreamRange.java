package ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {

    public static void main(String[] args) {

        IntStream nombres = IntStream.range(5, 20).peek(System.out::println);

                //Integer result = nombres.reduce(0, (a,b) -> a + b);
        //int result = nombres.reduce(0 , Integer::sum);
       // int result = nombres.sum();
        IntSummaryStatistics stats = nombres.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " + stats.getSum());
        System.out.println("avrg: " + stats.getAverage());
        System.out.println("count: " + stats.getCount());
    }
}
