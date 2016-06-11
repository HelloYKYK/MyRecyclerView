package com.toy.iwillgotothatcompany;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOY on 2016/6/11.
 *
 */
public class DataServer {

    private static List<String> list;

    public static List<String> getData() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add( "hello, I am the " + i + "item");
        }
        return list;
    }

    public static List<String> getSampleData(int page_size) {

        ArrayList<String> newList = new ArrayList<>();
        for (int i =newList.size(); i < page_size+10; i++) {
            newList.add( "hello, I am the " + i + "item");
        }
        list.addAll(newList);
        return list;
    }
}
