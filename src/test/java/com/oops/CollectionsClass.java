package com.oops;

import java.util.*;

public class CollectionsClass {
String name;
String email;
int rollno;

CollectionsClass()
{

}
    CollectionsClass(String name ,String email,int rollno)
    {
        this.name=name;
        this.email=email;
        this.rollno=rollno;
    }

    List<String> List = new ArrayList<String>();
    //Interface assignatation can be done at any place but the method invocation should be inside the method.
    public void TestArrayList()
    {

      boolean s=   List.add("test");
        List.add("test");
        List.add("rest");
        List.remove("rest");

        System.out.println("s is true or false :"+s);

        if(List.contains("test"))
        {
            List.add("add");
        }

        for(String a:List)
        {
            System.out.println("list size is :"+List.size());
            System.out.println("a is :"+a);

        }

        Iterator<String> it = List.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());

        }
    }

    public void TestHashSet()
    {
        Set<String> objset= new HashSet<String>();
        objset.add("last");
        objset.add("must");
        objset.add("kenset");
        objset.add("nuuset");
        objset.add("last");
        objset.remove("must");


        Iterator<String> its = objset.iterator();

      for(String itsa: objset)
      {
          System.out.println("itsa :"+itsa);

          while(its.hasNext())
          {
              its.next();

          }
      }


    }

    public void TestIntHashSet()
    {
        List<Integer> objint = new ArrayList<Integer>();
        objint.add(6);
        objint.add(3);
        objint.add(4);
        objint.add(5);

        Collections.sort(objint);

        List<Integer> objpre = new ArrayList<Integer>();

        objpre.add(2);
        objpre.add(1);

        Collections.sort(objpre);

        objint.addAll(1,objpre);

        for(Integer i: objint)
        {
            System.out.println("all collectons :"+i);
        }
        objint.removeAll(objint);
        objint.removeAll(objpre);

        for(Integer i:objint)
        {
            System.out.println("i f is:"+i);
        }

    }

    public void ClassObjectAccessinList()
    {
        CollectionsClass obja = new CollectionsClass("Ragu","Ragu@gamil.com",100);
        ArrayList<CollectionsClass> testme = new ArrayList<CollectionsClass>();
        testme.add(obja);
        testme.add(new CollectionsClass("test","test@gamil.com",101));
        testme.set(1,new CollectionsClass("maek","mmma",122)); // set for replace the specified element present in the list

        testme.get(1);

        testme.removeIf(collectionsClass -> testme.contains("test"));

        Iterator itm= testme.iterator();

        while(itm.hasNext())
        {
            System.out.println("basic it :"+itm.next());

            CollectionsClass cm = (CollectionsClass) itm.next();
            System.out.println("name :"+cm.name+" email :"+cm.email+"rollno :"+cm.rollno);

        }
    }

    public static void main(String[] args) {

        CollectionsClass obj = new CollectionsClass();
        obj.TestArrayList();
        obj.TestHashSet();
        obj.TestIntHashSet();
        obj.ClassObjectAccessinList();

    }

}