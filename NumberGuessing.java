import java.util.Random;
import java.util.Scanner;
class Guessing
{


    void guessNumber()
    {
        int attempted=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("NUMBER GUESSING GAME");
        Random ran=new Random();
        int target=ran.nextInt(100)+1;

//        System.out.println(target);
//int attempted=0;
        while(true)
        {
            System.out.println("GUESS A NUMBER IN THE RANGE OF 1-100:");
              int   user=sc.nextInt();
                attempted=attempted+1;
                if(user<target)
                {
                    System.out.println("SORRY YOU GUESS LOW NUMBER");
                }
                else if(user>target)
                {
                    System.out.println("SORRY YOU GUESS HIGH NUMBER");

                }
                else {
                    System.out.println("CONGRATULATIONS YOU GUESS CORRECT NUMBER in "+ attempted+" times");
                    System.out.println("SCORE IS "+attempted);
                    break;
                }
        }
sc.close();
    }
}
public class NumberGuessing {
    public static  void  main(String []args)
    {
        Guessing obj=new Guessing();
        obj.guessNumber();
    }
}
