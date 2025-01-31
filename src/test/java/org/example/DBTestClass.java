package org.example;

import org.testng.annotations.Test;
import utils.DBUtils;

public class DBTestClass {

    DBUtils db = DBUtils.getInstance();

    @Test
    public void test1() {
        DBUtils db = DBUtils.getInstance();
        db.runQuery("SELECT * FROM users");
    }

    @Test
    public void test2() {
        DBUtils db = DBUtils.getInstance();
        db.runQuery("SELECT * FROM users");
    }

    @Test
    public void test3() {
        DBUtils db = DBUtils.getInstance();
        db.runQuery("SELECT * FROM users");
    }

    @Test
    public void test4() {
        DBUtils db = DBUtils.getInstance();
        db.runQuery("SELECT * FROM users");
    }

    @Test
    public void test5() {
        DBUtils.method1();
    }


    // single pattern

}
