package com.company.io;

/**
 * Created by Tonyx on 17/06/15.
 */
public class ConsoleWriter implements Writer{
    public void write(String inString) {
        System.out.println(inString);
    }
}
