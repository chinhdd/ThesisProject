package com.chinhdd.thesis.util;

import java.io.IOException;
import java.util.Date;

public class Utils {

    public static Date getDateTime(String s) throws IOException {
        // TODO
        return null;
    }
    
    public static double getDoubleValue(String s) throws IOException {
        try {
            double result = Double.parseDouble(s);
            return result;
        } catch (NumberFormatException e) {
            throw new IOException();
        }
    }
}
