package com.singleton;

public class App 
{
    public static void main( String[] args ) {

        var a = new ClassA();
        a.logInformation();

        var b = new ClassB();
        b.logInformation();

        var c = new ClassC();
        c.logInformation();

    }
}
