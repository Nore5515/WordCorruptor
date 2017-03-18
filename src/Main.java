import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nore5515 on 3/17/2017.
 */
public class Main {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        System.out.println("Message?");
        String message = s.nextLine();
        System.out.println("% of corruption?");
        int corruption = s.nextInt();
        Main m = new Main();

        while (message != "exit"){
            if (message == "change%"){
                corruption = s.nextInt();
            }
            else{
                System.out.println(m.corrupt(message,corruption));
                message = s.next();
            }
        }





    }

    public String corrupt (String s, int corr){
        Random rand = new Random();
        String fHalf,lHalf,toReturn;
        toReturn = s;
        for (int x = 0; x < toReturn.length(); x++){
            if (rand.nextInt(100)+1 <= corr){
                fHalf = toReturn.substring(0,x);
                lHalf = toReturn.substring(x+1);
                toReturn = fHalf + "_" + lHalf;
            }
        }
        return toReturn;
    }

}
