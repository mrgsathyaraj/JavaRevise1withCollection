package com.oops;

public class Runner {

    public static void main(String[] args) {

        ConstructorTest puplicconstructor =  new ConstructorTest();

        ConstructorTest conswitharg = new ConstructorTest(10,20);

        puplicconstructor.MethodTest();
        String m = puplicconstructor.TestReturnMethodString();

        System.out.println("m is :"+m);

        puplicconstructor.MethodTestM();
        puplicconstructor.MethodTestN();
        String MCopy=  puplicconstructor.TestReturnMethodStringCopy();
        System.out.println("M copy is: "+MCopy);

        Inheritancechild1 child1 = new Inheritancechild1();
        child1.TestMethodSuper();
        child1.MethodTestM();

        System.out.println(child1.a);

       int n= puplicconstructor.getMarks(10,20);
       System.out.println("n is :"+n);

       puplicconstructor.SetNum(10);
        int encap= puplicconstructor.getNum();
        System.out.println("encap :"+encap);

    }
}

/*
Constructor (called after object created with new keyword)
Super (access parent)
this make ref to current class global
inheritance -access parent properties
object overload and override
encapsulation -private
 */