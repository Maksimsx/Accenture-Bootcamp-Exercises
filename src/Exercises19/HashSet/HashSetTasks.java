package Exercises19.HashSet;

import java.util.*;

public class HashSetTasks {

    HashSet<String> hs = new HashSet<>();
    HashSet<String> newHs = new HashSet<>();

    public void addingElements(){
        hs.add("Element 1");
        hs.add("Element 2");
        hs.add("Element 3");
        System.out.println(hs);
        System.out.println("~~~~~~~~~~~~");
    }

    public void iteratingThroughHasShetElements(){
        for(String i : hs){
            System.out.println(i);
        }
        System.out.println("~~~~~~~~~~~~");
    }

    public void gettingNumberOfElements(){
        System.out.println(hs.size());
        System.out.println("~~~~~~~~~~~~");
    }

    public void emptyHashSet(){
        System.out.println("HasSet before emptying: " + hs);
        hs.clear();
        System.out.println("HasSet after Emptying: " + hs);
        System.out.println("~~~~~~~~~~~~");
    }

    public void isHasSetEmpty(){
        System.out.println("Is HasSet empty? " + hs.isEmpty());
        System.out.println("~~~~~~~~~~~~");
    }

    public void cloningHasSet(){
        hs.add("12312");
        hs.add("Numbers");

        newHs = (HashSet<String>) hs.clone();
        System.out.println(newHs);
        System.out.println("~~~~~~~~~~~~");
    }

    public void hashSetToAnArray(){
        String[] arr = new String[hs.size()];

        int i = 0;

        for(String ele : hs){
            arr[i++] = ele;
        }
        for(String n : arr){
            System.out.println(n);
        }
        System.out.println("~~~~~~~~~~~~");
    }

    public void hashSetToATreeSet(){
        Set<String> hashSetToTreeSet = new TreeSet<>(hs);
        System.out.println("TreeSet: " + hashSetToTreeSet);
        System.out.println("~~~~~~~~~~~~");
    }

    public void hashSetToAnArrayList(){
        ArrayList<String> arrList = new ArrayList<>(hs);
        System.out.println("TreeSet: " + arrList);
        System.out.println("~~~~~~~~~~~~");
    }

    public void compareTwoHashSets(){
        newHs.add("Something New");
        System.out.println("Is one HashSet equal to another? " + hs.equals(newHs));
        System.out.println("~~~~~~~~~~~~");
    }

    public void compareTwoHashSetsAndRetainElementsThatAreSame(){
        hs.retainAll(newHs);
        System.out.println("HashSet content: " + hs);
        System.out.println("~~~~~~~~~~~~");
    }

    public void removeAllElements(){
        hs.clear();
        System.out.println(hs);
    }
}
