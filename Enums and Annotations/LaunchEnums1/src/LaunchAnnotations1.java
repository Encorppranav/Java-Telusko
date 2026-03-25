import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.PARAMETER})

@ interface CricketPlayer
{
        String country() default "India";
        int age() default 35;
}

@CricketPlayer()
 class ViratKohli
 {
     private int innings;

     public ViratKohli()
     {}

     public void setInnings(@CricketPlayer int innings)
     {
         this.innings= innings;
     }

     public int getInnings()
     {
         return innings;
     }
 }



public class LaunchAnnotations1 {
    public static void main(String[] args) {

       ViratKohli vk = new ViratKohli();

       vk.setInnings(344);

       int in = vk.getInnings();
        System.out.println(in);

        System.out.println("***************************");

         Class <? extends ViratKohli> c = vk.getClass();
          Annotation an = c.getAnnotation(CricketPlayer.class);

          CricketPlayer cp = (CricketPlayer)an ;

           String co = cp.country();
           int ag = cp.age();

        System.out.println("The info of attributes of Annotation are "+co+","+ag);

    }

}
