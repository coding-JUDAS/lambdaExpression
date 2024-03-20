package com.java8.lambda;

public class HelloWorldTraditional implements IHelloWorld{
    @Override
    public String sayHelloWorld() {
        return "Hello World !";
    }

    public static void main(String[] args) {
        // Traditional Implementation of Functional Interface.
        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
        System.out.println(helloWorldTraditional.sayHelloWorld());

        // Lambda Implementation - Lambda is like anonymous Method : Only requires the IMPLEMENTATION
        // provided for the METHOD defined in the FUNCTIONAL INTERFACE...
        IHelloWorld iHelloWorld = () -> {
            return "Hello World : Lambda";
        };
        System.out.println(iHelloWorld.sayHelloWorld());

        System.out.println("- - - - - - - - - - - - - - ");
        // Optimised Lambda expression

        IHelloWorld iHelloWorld1 = () -> "Hello World : Optimised Lambda";
        System.out.println(iHelloWorld1.sayHelloWorld());
    }
}
