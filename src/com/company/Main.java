package com.company;

import com.company.io.ConsoleWriter;

public class Main {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld(new ConsoleWriter());
        helloWorld.run();
    }
}
