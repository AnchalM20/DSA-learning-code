package com.collections;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> color = new Stack<>();
        color.push("red");
        color.push("yellow");
        color.push("black");
        color.push("green");
        color.push("blue");
        color.push("violet");
        System.out.println(color);
        color.pop();
        System.out.println(color);
        System.out.println("top element is: "+ color.peek()); //return top element of Stack


    }
}
