package com.valencia.professor.colin.modules.java_operator;

public class App {
    public static void main(String[] args) {
        //OPERATORS::

        // + - * / %        -> Arithmetic
        // > < >= <= == !=  -> Relational
        // && & || | !      -> Logical     ^  XOR (exclusive or)

        // >> >>> << ~ & |  -> Bitwise      >>=
        System.out.println(15 & 6);

        // ++ -- pre / post increment / decrement
        // += -= *= %= /=   -> Combined assignments

        // unary + -

        int i=56;
        System.out.println(-i);

        // (type) (int)      -> Cast
        // mixed type expressions

        int a=10, b=6, c;
        double d=1.6, d2;

        c = a / b;
        c = (int) 1.9;

        d2=a / b; // exampled of an upcast
        //left @ 17:18

        System.out.println(c);

    }
}
