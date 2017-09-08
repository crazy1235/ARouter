package com.alibaba.android.arouter.demo.testinject;

import java.util.ArrayList;

/**
 * Created by Admin on 2017/9/8.
 */

public class TestParcelableList {

    private int id;

    private ArrayList<TestParcelable> list;

    public TestParcelableList(int id, ArrayList<TestParcelable> list) {
        this.id = id;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<TestParcelable> getList() {
        return list;
    }

    public void setList(ArrayList<TestParcelable> list) {
        this.list = list;
    }
}
