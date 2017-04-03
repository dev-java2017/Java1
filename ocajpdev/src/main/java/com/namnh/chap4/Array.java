package com.namnh.chap4;

import java.util.ArrayList;
import java.util.List;

public class Array {
//    public static void alterValue (int x ){
//        x = 0; 
//    }
//    public static void alterArray (int[] a){
//        a[0] = 0; 
//    }
    public static void main(String[] args) {
//        exam1Declare();
//        exam2Declare();
//        exam3Init();
//        exam4Use();
//        exam4Legel();
//        exam5Use();
//        exam6Legel();
//        exam7Legel(new String[] {"a1","a2","a3"});
//        exam6Encapsulation();
//        exam8Compare();
        test();
    }
    

    private static void test() {
        
    }

    private static void exam1Declare() {
        String[] str1;
        String str2[];
//        String str3 [];
//        String[][] str4;
//        String[] str5[];
//        int[] key1;
//        int key2[];
//        int key3 [];
//        int[6] key6;
//        int[] key7 = new int[];
        
    }
    private static void exam2Declare() {
//        int[][] arrStr = {{1, 2}, {3, 4}};
//        int[] b = arrStr[1];
//        Object o1 = arrStr;
//        int[][] a2 = (int[][])o1;
//        a2[1][1] = 3;
//        System.out.println(b[1]);
//        int[] b2 = (int[]) o1;
        
//        String[][] arrStr = {{"first", "1"}, {"second", "2"}};
//        Object o1 = arrStr;
//        String[][] a2 = (String[][])o1;
//        a2[1][1] = "temp";
//        a2[0][0].toUpperCase();
//        System.out.println();
        
        
//      what is in a2? arrStr?
        
    }
    private static void exam3Init() {
//        int[][] myArray = new int[3][];
//        myArray[0] = new int[2];
////        myArray[0] = {   1  ,  2    };
//        myArray[0][0] = 6;
//        myArray[0][1] = 7;
//        myArray[1] = new int[3];
//        myArray[1][0] = 9;
//        myArray[1][1] = 8;
//        myArray[1][2] = 5;
//        for (int i = 0; i < myArray.length; i++) {
//            for (int j = 0; j < myArray[i].length; j++) {
//                System.out.println(myArray[i][j]);
//            }
//        }
    }
    private static void exam4Use() {
//        Object[ ][ ] myArray = new Object[3][ ];
//        
//        myArray[0] = new Animal[1];
//        myArray[0][0] = new Animal();
//        Animal animal = (Animal)myArray[0][0];
//        animal.move();
//        myArray[1] = new String[2];
//        myArray[1][0] = "string 1";
//        myArray[1][1] = "string 2";
////        
//        myArray[2] = new Integer[3];
//        myArray[2][1] = 100;
    }
    private static void exam5Use() {
        Object names[] = new String[5];
        names[2] = "Steve";
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
    private static void exam4Legel() {
        int[] target;
        int[] current = new int[] {1, 2, 3};
        char[] charAray = new char [] {'a', 'b', 'c'};
//        target = current;
//        target = charAray;
//        target[1] = charAray[0];
//        for (int i : target) {
//            System.out.println(i);
//        }
    }
    private static void exam6Legel() {
        int[][] books = new int[3][];
        int[] numbers = new int[6];
        int aNumber = 7;
//        books[0] = aNumber;
//        books[1] = numbers;
    }
    private static void exam6Encapsulation() {
        Animal sp = new Animal();
//        // test descript
//        StringBuilder des = sp.getDescript();
//        des.append(" dog");
//        sp.printDescript();
//        
//        // test name
//        String name = sp.getName();
//        name += " dog";
//        sp.printName();
//        
    }
    private static void exam7Legel(String[] args) {
//        String[] horses = new String[5];
//        horses[4] = null;
//        for (int i = 0; i < horses.length; i++) {
//            if (i < args.length) {
//                horses[i] = args[i];
//            }
//            System.out.print(horses[i].toUpperCase() + " ");
//        }
    }
    private static void exam8Compare() {
        StringBuilder arr1[] = new StringBuilder[5];
        arr1[0] = new StringBuilder("Pine");
        arr1[1] = new StringBuilder("Oak");
        arr1[2] = new StringBuilder("Maple");
        arr1[3] = new StringBuilder("Walnut");
//        
        StringBuilder arr2[] = new StringBuilder[5];
        System.arraycopy(arr1, 0, arr2, 0, 5);
        arr2[3] = new StringBuilder("test"); // orther
//        for(int i = 0; i < 5; i++) {
//            arr1[i] = 0;
//            arr2[i] = 0;
//        }
        
        // print out
        if (arr1.equals(arr2)) {
            System.out.println("equal true");
        } else {
            System.out.println("equal false");
        }
        if (arr1 == arr2) {
            System.out.println("== true");
        } else {
            System.out.println("== false");
        }
    }
    
    
    
}
class Animal {
    private String name = "kind of animal";
    private List<String> arrayList = new ArrayList<>();
    
    
    public Animal(Object object) {
        // TODO Auto-generated constructor stub
    }
    public Animal() {
        // TODO Auto-generated constructor stub
    }
    void move() {
        System.out.println("animal can move");
    }
    void printName() {
        System.out.println(name);
    }
    
    // getter
    
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    List<String> getArrayList() {
        return arrayList;
    }
    void setArrayList(List<String> arrayList) {
        this.arrayList = arrayList;
    }

}
