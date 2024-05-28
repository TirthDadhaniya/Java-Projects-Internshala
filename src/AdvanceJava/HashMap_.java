package AdvanceJava;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ {

    public static void main(String[] args) {

        //TREEMAP WORKS THE SAME WAY AS HASHMAP

        Map<String, Integer> studentInfo = new HashMap<>();
        studentInfo.put("Tirth", 1);
        studentInfo.put("Raj", 2);
        studentInfo.put("Krish", 3);
        studentInfo.put("Kunj", 4);

        //display
        System.out.println(studentInfo);

        for (Map.Entry<String, Integer> entry : studentInfo.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        //access one element
        System.out.println("Tirth:" + studentInfo.get("Tirth"));

        //check contain
        System.out.println(studentInfo.containsKey("Tirth"));

        //remove
        studentInfo.remove("Raj");
        System.out.println(studentInfo);
    }
}