package Exercises19.LinkedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TasksLinkedLists {

    LinkedList ll = new LinkedList();
    LinkedList newList = new LinkedList();

    public void addElements(){
        ll.add("Accenture");
        ll.add("Bootcamp");
        ll.add("LinkedList");
        ll.add("Tasks");
        System.out.println(ll);
        System.out.println("~~~~~~~~~~~~~~~");
    }

    public void iteratingThroughElementsOfLinkedList(){
        for(int i = 0; i< ll.size(); i++){
            System.out.println(ll.get(i));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~`");
    }

    public void elementAtSpecifiedPositionIteration(){
        for(int i = 2; i< ll.size(); i++){
            System.out.println(ll.get(i));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~`");
    }

    public void reverseOrderIteration(){
        Collections.reverse(ll);
        for(int i = 0; i< ll.size(); i++){
            System.out.println(ll.get(i));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void elementInsertionAtSpecificPosition(){
        ll.add(2, "August");
        System.out.println(ll);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void addingElementsToFirstAndLastPosition(){
        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println("Elements added to first and last poition: " + ll);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void addingElementToFront(){
        ll.addFirst("Something");
        System.out.println(ll);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
    public void addingElementToEnd(){
        ll.addLast("SomethingEnd");
        System.out.println(ll);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void specificPosition(){
        ll.add(4, "Element");
        System.out.println(ll);
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void gettingFirstAndLastElement(){

        for(int i = 0; i< ll.size(); i++){
            System.out.println(ll.getFirst());
            System.out.println(ll.getLast());
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
        }
    }

    public void displayElementsAndPositions(){
        for(int i = 0; i< ll.size(); i++){
            System.out.println(ll.get(i) + " " + i);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }

    public void removeSpecificElement(){
        System.out.println("Before removal: " + ll);
        ll.remove("Element");
        System.out.println("After removal: " + ll);
    }

    public void removeFirstAndLastElement(){
        System.out.println("Before first and last element is removed: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After first and last element is removed: " + ll);
        System.out.println("~~~~~~~~~~~~~~~~`");
    }

    public void removeAll(){
        LinkedList randomList = new LinkedList<>();
        randomList.add("asdsa");
        randomList.add("adsagfa");
        randomList.clear();
        System.out.println("All elements are removed from list: " + randomList);
        System.out.println("~~~~~~~~~~~~~~~`");
    }

    public void swapElements(){
        System.out.println("Elements before swapping: " + ll);
        Collections.swap(ll, 3, 2);
        System.out.println("Elements after swapping: " + ll);
        System.out.println("~~~~~~~~~~~~~~~`");
    }

    public void shuffleElements(){
        System.out.println("Elements before shuffle: " + ll);
        Collections.shuffle(ll);
        System.out.println("Elements after shuffle: " + ll);
        System.out.println("~~~~~~~~~~~~~~~`");
    }

    public void addTwoLinkedLists(){
        System.out.println("List before adding additional list elements: " + ll);
        newList.add("newWord");
        newList.add("WordWord");
        ll.addAll(newList);
        System.out.println("List after adding additional list elements: " + ll);
        System.out.println("~~~~~~~~~~~~~~~`");

    }

    public void cloneLists(){
        newList = (LinkedList) ll.clone();
        System.out.println("Cloned linked list: " + newList);
        System.out.println("~~~~~~~~~~~~~~~`");

    }

    public void removeAndReturnFirstElement(){
        System.out.println("Removed element: " + ll.pop());
        System.out.println("List with removed first element: " + ll);
        System.out.println("~~~~~~~~~~~~~~~");
    }

    public void retrieveButNotRemove(){
        System.out.println("Retrieve but not remove last element: " + ll.peekLast());
        System.out.println("~~~~~~~~~~~~~~~");

    }

    public void checkIfExists(){
        System.out.println(ll);
        System.out.println("Does it exists? " + ll.contains("Bootcamp"));
        System.out.println("~~~~~~~~~~~~~~~");
    }

    public void convertionLinkedListToArrayList(){
        List<String> ar = new ArrayList<String>(ll);
        System.out.println("ArrayList elements are: " + ar);
        System.out.println("~~~~~~~~~~~~~~~");
    }

    public void linkedListComparison(){
        LinkedList<String> c3 = new LinkedList<String>();
        System.out.println(ll);
        System.out.println(newList);
        for (Object e : newList)
            c3.add(ll.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }

    public void isLinkedListEmpty(){
        System.out.println("is list empy? " + ll.isEmpty());
        System.out.println("~~~~~~~~~~~");
    }

    public void replaceAnElement(){
        System.out.println("Before replacing an element: " + ll);
        System.out.println(ll.set(3, "Finished"));
        System.out.println("After replacing an element: " + ll);
    }
}
