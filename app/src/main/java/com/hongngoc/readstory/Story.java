package com.hongngoc.readstory;

/**
 * Created by sida on 2/21/2017.
 */

public class Story {
    private String name;
    private String author;
    private Integer imgId;

    public Story(String name, String author, Integer imgId){
        this.name = name;
        this.author = author;
        this.imgId = imgId;
    }

    public String getName(){ return name; }

    public String getAuthor(){ return author; }

    public Integer getImgId(){ return imgId; }
}
