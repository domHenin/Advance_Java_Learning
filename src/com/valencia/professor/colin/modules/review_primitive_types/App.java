package com.valencia.professor.colin.modules.review_primitive_types;

public class App {
    public static void main(String[] args) {

        // "beef stew is like food & drink"  -- for the 8 primitive order of data types.

        //8 primitive data types::

        //integer data types:
        byte b;   // 1 byte     -> signed -> can store (-128 => 127)   (-2^7 => 2^7-1)
        short s;  //2 byte
        int i;    //4 byte
        long myL; //8 byte                                              (-2^63 => 2^63-1)

        //floating data types:
        float f;  //4 byte
        double d; //8 byte

        //
        boolean bool;  //1 byte
        char ch;       //2 byte

        b=127; //in this situation 'narrowing' will take place and convert this parameter to a byte because its a constant
               //only time in the language a 'narrowing' or 'downcasting' will be done for you
        s=32566;
        i=1234;
        myL=1234567801234567L; // the 'L' is required to indicate this is a LONG

        i=017; // will print out '11' not '13' because of the leading '0' this is using "octal" numbers
        i=0xA04; // this is a HEX number
        i=0b1001; //binary number
        System.out.println(i);

        f = 2.5F;
        d = 2.5;

        f = 1.5e-6f;
        d=1.5e6;

        System.out.println(d);

        System.out.println(d);

        bool = true;
        ch = 'k'; //can only fit one character inside a literal constant



        //LEGAL IDENTIFIERS::
        int $$$_____asdf_ASDF_____34343434;  //cannot stat with a number.
        int myIntVariable; //camel case example
        final int MY_CONSTANT = 345; //use all upper for a constant variable



    }
}



//NOTES::
// name of CLASS and name of an INTERFACE ALWAYS starts with capital
// name of METHOD ALWAYS start with lower case letter
// method name should ALWAYS have a verb in it. it should only do ONE thing