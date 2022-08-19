package Exercises19.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tasks {
    ArrayList<String> colors = new ArrayList<>();

    List<String> randomList = new ArrayList<>();


    public void addingToArrayList(){

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println("Adding values to arrayList: " + colors);
        System.out.println("~~~~~~~~~~~~~~~~~~");
    }

    public void loopingThroughArrayList(){
        for(int i = 0; i < colors.size(); i++){
            System.out.println("Looping through arrayList: " + colors.get(i));
        }
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void insertingToArrayList(){
        colors.add(0, "Pink");
        System.out.println("Inserting value at first position: " + colors);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
    }

    public void elementAtSpecifiedIndex(){
        System.out.println("Getting an element from specific index: " + colors.get(2));
        System.out.println("~~~~~~~~~~~~~~~~~");
    }
    public void updateElementAtSpecifiedIndex(){
        System.out.println("Getting an element from specific index: " + colors.set(1, "Purple"));
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void removeElement(){
        System.out.println("All the elements: " + colors);
        System.out.println("Removing the third element from ArrayList: " + colors.remove(2));
        System.out.println("All the elements after 3rd is removed: " + colors);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void searchElement(){
        System.out.println("Searching index of element: " + colors.indexOf("Green"));
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void sortingArrayList(){

        System.out.println("arrayList before sorting: " + colors);
        Collections.sort(colors);
        System.out.println("Sorted arrayList: " + colors);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void copyArrayLists(){
        ArrayList colorsCopy = (ArrayList)colors.clone();
        System.out.println("Cloned arrayList: " + colorsCopy);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void shuffleElements(){
        Collections.shuffle(colors);
        System.out.println("Shuffled color arrayList: " + colors);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void reverseElements(){
        Collections.reverse(colors);
        System.out.println("Reversed colors: " + colors);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void elementsExtraction(){
        List<String> sub_List = colors.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void compareArrayLists(){

        randomList.add("Rocket");
        randomList.add("Green");
        randomList.add("Furniture");

        System.out.println(randomList.equals(colors));
        System.out.println("~~~~~~~~~~~~~~~~~");

    }

    public void swapTwoElements(){
        Collections.swap(colors, 1, 3);
        System.out.println("Swapped elements: " + colors);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void joinTwoArrayLists(){
        ArrayList <String> newArrayList = new ArrayList<>();
        newArrayList.addAll(randomList);
        newArrayList.addAll(colors);
        System.out.println("Joined arrayLists: " + newArrayList);
        System.out.println("~~~~~~~~~~~~~~~~~");

    }

    public void emptyArrayList(){
        randomList.clear();
        System.out.println(randomList);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void isEmptyList(){
        System.out.println("Is colors arrayList empty? " + colors.isEmpty());
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void trimArrayList(){
        colors.trimToSize();
        System.out.println("~~~~~~~~~~~~~~~~~");
    }
    public void increaseSizeOfAnArrayList(){
        colors.ensureCapacity(10);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void replacingElements(){
        colors.set(1, "White");
        System.out.println(colors);
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public void printingElements(){
        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
    }

}
