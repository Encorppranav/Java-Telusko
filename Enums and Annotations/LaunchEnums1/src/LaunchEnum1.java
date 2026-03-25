
enum Week
{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}

public class LaunchEnum1 {

    public static void main(String[] args) {

         Week week = Week.MON;
        System.out.println(week);

        int index = Week.SUN.ordinal();
        System.out.println(index);

        Week [] weekAr = Week.values();

        for ( Week w:weekAr)
        {
            System.out.println(w.ordinal()+ "-->"+ w);
        };

    }

}
