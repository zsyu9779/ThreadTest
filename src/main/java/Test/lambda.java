package Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * @Author: Zsyu
 * @Date: 19-10-27 上午10:24
 */
public class lambda {
    public static void main(String[] args) {
        Function<Integer, Integer> function = p->p+1;
         int i = function.apply(2);
        System.out.println(function.apply(2));
        Arrays.asList(1,2,3).stream().map(function).forEach(System.out::println);
        BiFunction<Integer,Integer,Integer> b=(x,y)->x+y;
        BinaryOperator binaryOperator;

    }
}
