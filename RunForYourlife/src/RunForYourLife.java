public class RunForYourLife implements Runnable {
public String name;
public double angka;
public int chekcpoint=1;
public Thread thread;

    public RunForYourLife(String name, double angka) {
        this.name = name;
        this.angka = angka;
    }




    public void run()
    {
        System.out.println(name + ", go!");
        while (this.chekcpoint!=21)

        {

            double random = LetsGo.random()*angka;
            int random_int=(int) random;


                try
                {
                    Thread.sleep(random_int);
                }
                catch (InterruptedException e)
                {
                    System.out.println(this.name+" interrupted");
                }

                System.out.println(this.name+" has passed checkpoint ("+chekcpoint+")");
                chekcpoint=chekcpoint+1;

        }

        System.out.println(this.name+" has finished !");

    }




    public void Start(){


        if (thread == null) {

            thread = new Thread(this, name);
            System.out.println(name + ", ready.");

            System.out.println(name + ", set...");
            thread.start();
        }


    }



}
