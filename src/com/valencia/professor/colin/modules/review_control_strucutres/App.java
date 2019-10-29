package com.valencia.professor.colin.modules.review_control_strucutres;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World");

//         selection: if else, switch, ? : conditional
//         repetition: while, do-while, for loop, enhanced for loop

        int a=10, b=6, c;

        int[] array = {10,20,30,40,50};

        for (int element : array) {
            System.out.println(element);
        }

        while (a > b) {  //-> use a 'while loop' when you dont know how many times the loop is going to happen
            System.out.println(b);
            b++;
        }

        do { // -> do while loops are frowned upon. if you use 'do while' have a good reason
            System.out.println(b);
            b++;
        } while (a > b);

        for (int i=0; i<10; i++) {
//            System.out.println(i);
            if (i==5) {
                continue;
            }
            System.out.println(i);
        }

//        for (int i=0, j=5; i<10; i++, j--) {
//            System.out.println(i);
//            System.out.println(j);
//
//
//            if (i+j == 5) {
//                break;
//            }
//        }


        c = a > b ? 23 : a / b; //-> needs to of same type i.e. all must be either int or double

        System.out.println(a > b ? 5 : 34.78); // -> operands MUST BE compatible with each other

        if (a > b) {
            a=10;
        } else {
            b = a / b;
        }

        switch ("Colin") {
            case "Colin":
                System.out.println("Colin");
                break;
            case "Bob":
                System.out.println("Bob");
                break;
            default:
                System.out.println("Error");
                break;
        }

        switch (a % 2) {  //something that can be promoted as an int
            case 0:
                System.out.println("it's a 0");
                break;
            case 1: //case 5: //can stack cases
                System.out.println("it's a 1");
                break;
            default:
                System.out.println("not 0 or 1");
                break;
        }

    }
}
