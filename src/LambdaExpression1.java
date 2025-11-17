

 class A {
  public void show()
  {System.out.println("In A Show");}

     public void display(){
         System.out.println("in Display");
     }
}

class B extends A
{
 public void show(){
     System.out.println("In B Show");
 }
}
public class LambdaExpression1 {
    public static void main(String[] args) {

        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
//        obj.display();
    }
}