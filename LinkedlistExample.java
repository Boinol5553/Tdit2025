
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExample {

    public static void main(String[] args) {

//        LinkedList<String> list;
//        list = new LinkedList<String>();
//
//        list.add("JAVA");
//
//        list.add("J2EE");
//
//        list.add("JSP");
//
//        list.add("SERVLETS");
//
//        list.add("JDBC");
//
//        System.out.println(list);

  //      String s= "JSP";
//        boolean contains = list.contains(s);
//        if(contains){
//            System.out.println(list.indexOf(s));
//        }
//        s= "STRUTS";
//        contains= list.contains("STRUTS");
//        if(contains){
//            System.out.println(list.indexOf(s));
//        }
//        Iterator<String> it = list.descendingIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("SIX");
//        arrayList.add("SEVEN");
//        arrayList.add("EIGHT");
//        arrayList.add("NINE");
//        arrayList.add("TEN");
//
//        System.out.println(arrayList);
//
//        list.addAll(arrayList);
//        System.out.println(list);

//        LinkedList<Integer> queue = new LinkedList<Integer>();
//        queue.offer(10);
//        queue.offer(20);
//        queue.offer(30);
//        queue.offer(40);
//        queue.offer(50);
//
//        System.out.println(queue);
//
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        System.out.println(queue.peekLast());


//        LinkedList<Integer> List = new LinkedList<Integer>();
//        List.add(10);
//        List.add(20);
//        List.addLast(50);
//        List.add(40);
//        List.add(2,30);
//        List.add(5,60);
//        System.out.println(List);
//
//        LinkedList<Integer> List1 = new LinkedList<Integer>();
//        List1.add(111);
//        List1.add(222);
//        List1.add(333);
//
//        System.out.println(List1);
//        List.addAll(3,List1);
//        System.out.println(List);

        LinkedList<String> list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        list.set(3,"ZERO");
        System.out.println(list);
    }
}
