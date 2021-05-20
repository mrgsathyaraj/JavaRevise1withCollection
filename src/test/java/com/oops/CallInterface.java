package com.oops;

public class CallInterface {

    public void test()
    {
        Interface1 obj = new ConstructorTest();
        obj.MethodTestM();

        Interfaceempty obj2 = (Interfaceempty) new ConstructorTest();

        obj2.MethodTestM();
    }


}
