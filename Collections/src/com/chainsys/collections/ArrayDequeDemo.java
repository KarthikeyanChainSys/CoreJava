package com.chainsys.collections;
import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo { 
    public static void main(String args[]) {

ArrayDeque<String> arraydeque = new ArrayDeque<String>(); // Use an ArrayDeque like a stack.
        arraydeque.push ("A");
        arraydeque.push ("B");
        arraydeque.push ("x");
        arraydeque.push ("Z");
        arraydeque.push ("D");
        arraydeque.push ("X");//duplicate value
        arraydeque.push ("z");//duplicate value
        arraydeque.push ("E");
        arraydeque.push("F");
//       System.out.println("Before Popping the stack: ");
//       while (arraydeque.peek() != null) 
//        System.out.print (arraydeque.pop() + " "); 
//       System.out.println("After popping Iterating the stack: " + arraydeque.size());
//        Iterator<String> iterator = arraydeque.iterator();
//         while(iterator.hasNext()) {
//             System.out.println("\t"  + iterator.next());
//         }
         Iterator<String> strIterator = arraydeque.descendingIterator();
         while(strIterator.hasNext()) {
             System.out.println("\t" + strIterator.next());
         }
         arraydeque.addFirst("H");
         arraydeque.addLast("I");
         strIterator = arraydeque.iterator();
         while(strIterator.hasNext()) {
             System.out.println("\t"  + strIterator.next());
         }
         
         System.out.println("**************PollFirst: " + arraydeque.pollFirst());
         System.out.println(arraydeque);
         System.out.println("**************pollLast: " + arraydeque.pollLast());
         System.out.println(arraydeque);
         System.out.println("**************PeekFirst: " + arraydeque.peekFirst());
         System.out.println(arraydeque);
         System.out.println("**************8PeekLast: " + arraydeque.peekLast());
         System.out.println(arraydeque);
         System.out.println("*************RemoveFirst: " + arraydeque.removeFirst());
         System.out.println(arraydeque);
         System.out.println("*************RemoveLast: " + arraydeque.removeLast());
         System.out.println(arraydeque);
         System.out.println("RemoveFirstOccurance: " + arraydeque.removeFirstOccurrence("x"));
         System.out.println(arraydeque);
         System.out.println("RemoveLastOccurance: " + arraydeque.removeLastOccurrence("z"));
         System.out.println(arraydeque);
         
}
}