package com.company;

public class Change {
    int id;

    void callValue(int id){
        id=10;
    }
    void callref(Change c){
        c.id=10;
    }

}
