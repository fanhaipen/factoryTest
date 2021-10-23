package com.imooc.user;

import com.imooc.factory.Factory;
import com.imooc.interfac.Apple;

public class UserTest {

    public static void main(String[] args) {
        Apple apple= Factory.GetApple("Red");
        apple.GetCorlor();
    }
}
