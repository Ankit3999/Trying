package Collections;

import java.util.HashMap;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        HashMap<A, Integer > hm= new HashMap<A, Integer>();
        HashSet<Integer> s=new HashSet<>();
        A ob=new A(10,"aaa");
        A ob1=new A(100,"aaab");
        A ob2=new A(1000,"aaac");
        A ob3=new A(10000,"aaad");
        hm.put(ob,01);
        hm.put(ob1,02);
        hm.put(ob2,03);
        hm.put(ob3,04);
        for(A key:hm.keySet())
            System.out.println(key+" : "+hm.get(key));

    }
}
class A{
    int a;
    String b;
    public A(int a, String b){
        this.a=a;
        this.b=b;
    }
    public String toString(){
        return a+" "+b;
    }
}