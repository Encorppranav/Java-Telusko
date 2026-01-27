
interface P {
    public void show(String s);
}

interface Calc {
    public int addition(int x, int y);
}

class R implements P {
    public void show(String s){
        System.out.println("in R show");
    }
}


public class LambdaExpression {
    public static void main(String[] args) {

//        R obj = new R();
//        obj.show();

        P obj = s -> System.out.println("In " +s+" show");

        obj.show("Lamda ");

        System.out.println("***********************");

        Calc calc = (int x , int y) ->  x+y;

        System.out.println(calc.addition(5,10));
    }
}
