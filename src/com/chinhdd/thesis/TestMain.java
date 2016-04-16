package com.chinhdd.thesis;

import com.chinhdd.thesis.datadefine.DotInteger;
import com.chinhdd.thesis.datadefine.DotIntegerFactory;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("Hello thesis");
        String s = "1.1059";
        DotInteger di = DotIntegerFactory.getDotInteger(s, 5);
        System.out.println(di);
    }
}
