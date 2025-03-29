package org.example.CodingTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class E10ArrayListDuplicate {

    public static void main(String[] args) {
        //Create an ArrayList with Integer with duplicate elements
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 23, 30, 23, 47, 55, 37, 33));

        // Convert the ArrayList into a HashSet. Remove duplicates by converting ArrayList to a Set
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);//LinkedHashSet is used to maintain the original order.

        // Convert Set back to ArrayList
        list.clear();// Clear the Original ArrayList to empty the list
        list.addAll(set);//All the elements from Hashset are added back to the ArrayList only contains the unique values

        // Print the list with only the unique elements or removes all the duplicates
        System.out.println("ArrayList after removing duplicates: " + list);
    }
}

