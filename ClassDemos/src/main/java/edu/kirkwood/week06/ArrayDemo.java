package edu.kirkwood.week06;

import edu.kirkwood.shared.UIUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        # Python Tuple - fixed length
//        menuItems = ("View all customers", "View all Rooms", "View all reservation", "Add new room"
        // Java Array - fixed length
        // Declare everything at once using curly brackets
        String[] menuItems= {"View all customers", "View all Rooms", "View all reservation", "Add new room"};
        // Declare the length and assign values later
        String[] menuItems2 = new String[4];
        menuItems2[0] = "View all customers";
        menuItems2[1] = "View all Rooms";
        menuItems2[2] = "View all reservation";
        menuItems2[3] = "Add new room";
//        print(menuItems)
        System.out.println(Arrays.toString(menuItems));
        System.out.println(Arrays.toString(menuItems2));
//        print(menuItems[0])
//        print(menuItems[1])
//        print(menuItems[2])
//        print(menuItems[3])
        System.out.println(menuItems[0]);
        System.out.println(menuItems[1]);
        System.out.println(menuItems[2]);
        System.out.println(menuItems[3]);
//        print(len(menuItems))
        System.out.println(menuItems.length);
//        for i in range(len(menuItems)):
//              print(menuItems[i])
//        print()
//        for(int i = 0; i < menuItems.length; i++) {
//            System.out.println(menuItems[i]);
//        }
        UIUtility.printMenu("Demo Menu",menuItems);
        System.out.println();
//        for item in menuItems:
//              print(item)
        for(String item : menuItems) {
            System.out.println(item);
        }
        System.out.println();




//        # List - dynamic length
//        myPets = []
        ArrayList<String> myPets = new ArrayList<>();
//        myPets.append("Zipper")
//        myPets.append("Waffles")
        myPets.add("Zipper");
        myPets.add("Waffles");
//        myPets.insert(0, "Velcro")
        myPets.add(0, "Velcro");
//        print(myPets)
        System.out.println(myPets);
//        print(myPets[0])
//        print(myPets[1])
//        print(myPets[2])
//        #print(myPets[3])
        System.out.println(myPets.get(0));
        System.out.println(myPets.get(1));
        System.out.println(myPets.get(2));
//        System.out.println(myPets.get(3));
//        print(len(myPets))
        System.out.println(myPets.size());
//        for i in range(len(myPets)):
//          print(myPets[i])
//        print()
        for(int i = 0; i < myPets.size(); i++) {
            System.out.println(myPets.get(i));
        }
        System.out.println();
//        for pet in myPets:
//          print(pet)
        for(String pet : myPets) {
            System.out.println(pet);
        }
        System.out.println();

    }
}
