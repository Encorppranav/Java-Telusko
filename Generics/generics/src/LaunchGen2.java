
interface alpha <T>
{

}


    class Generics <T> implements alpha <String>
    {
        private T ref;

        public Generics(T ref){
            this.ref = ref;
        }

        public void disp ()
        {
            System.out.println("The type of T is:" + ref.getClass().getName());
        }

        public T getRef()
        {
            return ref;
        }
    }


public class LaunchGen2 {
    public static void main(String[] args) {

        Generics <Integer> g = new Generics<>(44);
        g.disp();
        System.out.println(g.getRef());

        Generics <String> g1 = new Generics<>("Pranav");
        g1.disp();
        System.out.println(g1.getRef());

    }

}
