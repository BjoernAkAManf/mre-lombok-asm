package org.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Main {
    private final String msg;

    public void run() {
        System.out.println(this.msg);
    }

    public static void main(String[] args) {
        new Main("Hello world!").run();
    }
}