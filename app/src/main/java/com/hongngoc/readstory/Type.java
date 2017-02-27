package com.hongngoc.readstory;

/**
 * Created by sida on 2/21/2017.
 */

public class Type {
    Integer id;
    String name;

    public Type ( Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId(){ return id; }

    public String getName(){ return name; }
}
