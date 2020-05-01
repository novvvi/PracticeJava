package com.udemy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        input();
        LinkedList<String> list = new LinkedList<String>();
        list.add("car");
        list.add("phone");
        list.add("computer");
        printList(list);
        list.add(1,"gaming");
        printList(list);
        addInOrder(list, "bmw");
        printList(list);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==========================");
    }

    private static void addInOrder(LinkedList<String> linkedList, String stuff) {
        ListIterator<String> x = linkedList.listIterator();
        System.out.println(x.hasNext());
        while(x.hasNext()) {
            int comparison = x.next().compareTo(stuff);

            if(comparison == 0) {
                System.out.println(stuff + "-" + comparison);
                break;
            } else if (comparison > 0) {
                x.previous();
                x.add(stuff);
                break;
            } else if (comparison < 0) {
                System.out.println(x.next() + "-" + comparison);
            }

        }

        x.add(stuff);
    }

    private static void input() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        
//        System.out.println(scanner.hasNext());
        scanner.close();

    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("no cities in the itenerary");
            return;
        } else  {
            System.out.println("Holiday over");
        }

        while(!quit) {
            int action
        }

    }
}
