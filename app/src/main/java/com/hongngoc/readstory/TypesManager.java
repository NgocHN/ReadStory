package com.hongngoc.readstory;

import java.util.ArrayList;

/**
 * Created by sida on 2/21/2017.
 */

public class TypesManager {
    private ArrayList<Type> types;
    public TypesManager() {
        types = new ArrayList<>();
        types.add(new Type(1, "Truyện cổ tích"));
        types.add(new Type(2, "Truyện ngụ ngôn"));
        types.add(new Type(3, "Truyện cười"));
        types.add(new Type(4, "Truyện khoa học"));
        types.add(new Type(5, "Truyện dân gian"));
    }

    public ArrayList<Type> getTypes() {
        return types;
    }
}
