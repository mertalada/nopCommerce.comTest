package Utility;

public class MyFunction {
    public static void Wait(int sn){

        try {
            Thread.sleep(sn*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static int RandomNumber(int limit){
        return  (int)(Math.random()*limit);}
}
