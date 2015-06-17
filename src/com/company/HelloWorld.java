package com.company;

import com.company.io.Writer;

/**
 * Created by Tonyx on 17/06/15.
 */
public class HelloWorld {
    Writer writer;
    public HelloWorld(Writer writer) {
        this.writer = writer;
    }
    public void run() {
        writer.write("hello world");
    }
}
