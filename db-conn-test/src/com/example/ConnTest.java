package com.example;

public class ConnTest {

    public static void main(String[] args){


        DbImpl db = new DbImpl();
        System.out.println(db.getAllPeople().get(0).getFirstname());
    }
}
