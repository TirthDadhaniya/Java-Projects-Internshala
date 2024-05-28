package AdvanceJava;

import java.util.ArrayList;

public class GadgetArrayList{

    public static void main(String[] args) {

        //creating array list just like an objects
        ArrayList<Gadget> gadgetlist = new ArrayList<>();

        //adding items to array list
        gadgetlist.add(new Gadget("Smartphone", 20000));
        gadgetlist.add(new Gadget("Laptop", 60000));
        gadgetlist.add(new Gadget("Headphones", 5000));

        //System.out.println(gadgetlist);
        //display
        System.out.println("List of Gadgets");
        for (Gadget i : gadgetlist){
            System.out.println(i);
        }

        //access elements by index
        System.out.println("Gadget: " +gadgetlist.get(1).getName()+ ", Price is " +gadgetlist.get(1).getPrice());
        Gadget laptop = gadgetlist.get(1);
        System.out.println("Details: "+laptop);

        //remove elements
        gadgetlist.remove(1);
    }
}
