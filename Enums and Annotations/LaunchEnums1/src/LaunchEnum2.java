
    enum Result
    {
        PASS,FAIL,NR;
        //public static final Result PASS = new Result();

        int marks;

      Result()
      {
          System.out.println("Constructor of Enum");
      }

      public void  setMarks(int marks)
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }

    }


public class LaunchEnum2 {

    public static void main(String[] args) {
        Result.PASS.setMarks(44);

        int m = Result.PASS.getMarks();
        System.out.println(m);
    }

}
