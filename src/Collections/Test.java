package Collections;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*ArrayList<Integer> arr=new ArrayList<>();
      *//*  arr.add(10);
        arr.add(100);
        arr.add(1,5);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }*//*
        *//*arr.add(10);
        arr.add(100);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        for(Integer v: arr){
            System.out.println(v);
        }
        List<A> l=new ArrayList<>();
        l.add(new A());

        System.out.println(l.toString());
*//*
        LinkedList<Integer> lst=new LinkedList<>();
        dot("ankit",arr);
        dot("sagar", lst);
    }
    private static void dot(String type, List<Integer> list){
        long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            list.add(0,i);
        }

        long end=System.currentTimeMillis();
        System.out.println("add at start time is "+(end-start));

        start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            list.add(list.size()-1,i);
        }

        end=System.currentTimeMillis();
        System.out.println("add at end time is "+(end-start));
        System.out.println(list.size());*/
        /*HashMap<Integer, String > hm=new HashMap<Integer, String>();
        hm.put(3999, "ankit");
        hm.put(4000, "sagar");
        *//*for(int i=0;i<hm.size();i++){
            System.out.println(hm.get(3999));
        }*//*
        for(Map.Entry<Integer, String > entry: hm.entrySet()){
            int key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" "+value);
        }*/
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(n);
        Iterator iterator = arr.iterator();



        int num=0;
        for(int i=0;i<n;i++){
            num = sc.nextInt();
            arr.add(num);
        }
        /*for(Integer i: arr) {
            num = sc.nextInt();
            arr.add(num);
        }*/
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

}