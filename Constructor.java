import java.applet.Applet;
import java.util.ArrayList;
import java.util.TreeSet;

public class Constructor {


    public static int Fibo(int n ){
        if(n <=1){
            return  1;
        }
        return Fibo(n-1) + Fibo(n-2);

    }


    public static int Sum(int n){
        if(n == 0){
            return 0;
        }
        return (n*10)+ Sum(n/10);
    }

    public static void Tree(){
        TreeSet<Integer> t = new TreeSet<>();
        t.add(23);
        t.add(24);
        System.out.println(t);

    }

    public static void main(String[] args) {
        System.out.println(Fibo(5));
//        System.out.println(Sum(123));
//        Tree();


    }
}
