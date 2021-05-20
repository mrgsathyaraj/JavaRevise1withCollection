package com.oops;

public class Inheritancechild1 extends ConstructorTest{

    Inheritancechild1()
    {
       // System.out.println("Test throws error and it should come under super");
        super(10,20);
       //this calls super class and first statement
    }
public void TestMethodSuper()
{
   // super();  super only in constuctor body
    System.out.println("Super keyword only for constructor ");
}


@Override

public void MethodTestM()
{
    System.out.println("method overrided");
}

}
