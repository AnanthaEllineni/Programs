package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddDataSpecificIndex {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();

        //add elements
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);

        //add(index,element)
        l.add(1,50);
        System.out.println(l);

        //size
        System.out.println(l.size());

        //set(index,element)
        //replace element at specific index
        l.set(3,60);
        System.out.println(l);

        //remove particular element based on index
        int index=0;
        l.remove(index);
        System.out.println(l);

        //get a particular element
        int indx=1;
        System.out.println(l.get(indx));

        //convert list to array
        Object[] ob=l.toArray();
        for(Object t:ob){
            System.out.println(t);
        }

        //merge two lists
        ArrayList<Integer> l1=new ArrayList<Integer>();
        l1.add(70);
        l1.add(80);
        l1.add(90);
        l1.add(90);
        l.addAll(l1);
        System.out.println(l);

        //Remove duplicates from list
        ArrayList<Integer> uniqueList=new ArrayList<Integer>();
        for(Integer te:l1) {
            if (!uniqueList.contains(te)) {
                uniqueList.add(te);
            }
        }
        System.out.println(uniqueList);

        //Index of
        Integer a=30;
        int firstOccurance =l.indexOf(a);
        System.out.println(firstOccurance);

        //lastIndexOf
        Integer i=60;
        int lastOccurance =l.lastIndexOf(i);
        System.out.println(lastOccurance);

        //List is empty or not
        boolean flag =l1.isEmpty();
        if(flag){
            System.out.println("List is Empty");
        }
        else{
            System.out.println("List is not Empty");
        }

        //mutable ArrayList to immutable ArrayList
        List<Integer> ummodifiableList = Collections.unmodifiableList(l);
        System.out.println(ummodifiableList);

        //non synchronize list to Synchronized list
        List<Integer> synchronozedList = Collections.synchronizedList(l1);
        System.out.println(l);

        //remove unique element from list
        l.retainAll(l1);
       System.out.println(l);

        //Remove duplicate from List
       l.removeAll(l1);
        System.out.println(l);

        //Remove all the elements at a time
        l.clear();
        System.out.println(l);


        }
    }

