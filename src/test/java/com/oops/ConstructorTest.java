package com.oops;

public class ConstructorTest implements Interface1{

int a =100;
int b=200;
int c ;

private int mark1;
private int mark2;
private int total;

private int Num;

 ConstructorTest()
 {
     System.out.println("Test  Constructor");
 }

 ConstructorTest(int x , int y )
 {
     this.a =x;
     this.b=y;
      int z;

     z= x+y;

     System.out.println("z is "+ z);
 }

 public void MethodTest()
 {
     new ConstructorTest();
     new ConstructorTest(30,40);
 }



    public void MethodTestM()
    {
        System.out.println("methodm");
    }

    @Override
    public String TestString() {
        return null;
    }


    public void MethodTestN()
    {
       MethodTestM();
    }

 public String TestReturnMethodString()
 {
     return "testStringReturn";
 }

    public String TestReturnMethodStringCopy()
    {

        return TestReturnMethodString();
    }

    private int calculateMarks()
    {
        int sum;
        sum =mark1+mark2;
        return sum;
    }

    public int getMarks(int marks1,int marks2)
    {
        this.mark1 =marks1;
        this.mark2=marks2;

        return calculateMarks();
    }

    public int getNum()
    {
        Num = Num+10;
        return Num;
    }

    public void SetNum(int num)
    {
       this.Num = num;
        System.out.println("Num is :"+Num);
    }
}
