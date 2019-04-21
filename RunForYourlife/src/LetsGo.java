import java.util.Random;



public class LetsGo {

    public static double random(){

        Random r = new Random();
        return r.nextInt((500 - 200) + 1) + 200;


    }

    public static void main(String[] args){


        RunForYourLife Lionel = new RunForYourLife("Lionel", 1);
        RunForYourLife Andres = new RunForYourLife("Andres", 0.7);
        RunForYourLife Messi = new RunForYourLife("Messi", 0.5);

        Lionel.Start();
        Andres.Start();
        Messi.Start();


    }


}

