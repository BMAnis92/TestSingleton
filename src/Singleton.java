public class Singleton {

    private int nbrExection =0;
    //instance
    private static Singleton instance = null;

    //Singlton

    public Singleton() {
        System.out.println("Creating Singletonn");
        nbrExection++;
    }

    /**
     * methode getInstance
     * @return
     */

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
