package com.chinhdd.thesis.datadefine;

import com.chinhdd.thesis.ForexException;

public class DotIntegerFactory {

    public static DotInteger getDotInteger(String sValue, int numberAfterDot) {
        if (sValue == null || sValue.isEmpty()) {
            return null;
        }
        try {
            DotInteger di = new DotInteger(sValue, numberAfterDot);
            return di;
        } catch (ForexException e) {
            return null;
        }
    }
}
