package lambda;


import java.util.function.BiFunction;

interface AddFunction {

    int add(int a, int b);

}


public class AddLambda {
    public static void main(String args[]) {

        BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;

        System.out.println("Addition :" + addFunction.apply(10, 20));

        AddFunction adf = (a, b) -> a + b;

        System.out.println("Addition11 :" + adf.add(40, 20));


        BiFunction<Integer,Integer,Integer>  multiply = (x,y) -> x*y;
        System.out.println(multiply.apply(9,5));

    }

}
