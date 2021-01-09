package jdbc;

public class MainMethodd {
    public static void main(String[] args) throws Exception{
        Thread t = new ThreadTesting();
        t.start();
        throw new Exception("Somethign wrong");
    }
}
