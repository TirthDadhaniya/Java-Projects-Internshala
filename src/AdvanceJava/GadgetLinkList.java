package AdvanceJava;

import java.util.LinkedList;

public class GadgetLinkList {

    public static void main(String[] args) {

        LinkedList<Gadget> gadgetlist = new LinkedList<>();

        //adding items to array list
        gadgetlist.add(new Gadget("Smartphone", 20000));
        gadgetlist.add(new Gadget("Laptop", 50000));
        gadgetlist.add(new Gadget("Headphones", 4000));

        //System.out.println(gadgetlist);
        //display
        System.out.println("List of Gadgets");
        for (Gadget i : gadgetlist){
            System.out.println(i);
        }

        //access elements by index
        Gadget laptop = gadgetlist.get(1);
        System.out.println("Details: "+laptop);

        //remove elements
        gadgetlist.removeFirst();
        System.out.println("List of Gadgets");
        for (Gadget i : gadgetlist){
            System.out.println(i);
        }
    }
}
