package com.chinhdd.thesis.datadefine;

import java.util.Date;

public class ItemData {

    public static final String TEXT_OPEN = "OPEN";
    public static final String TEXT_CLOSE = "CLOSE";
    public static final String TEXT_LOW = "LOW";
    public static final String TEXT_HIGH = "HIGH";
    public static final String TEXT_DATE = "TIME";
    public static final String TEXT_SMA = "SMA";
    public static final String TEXT_EMA = "EMA";
    
    DotInteger open;
    DotInteger close;
    DotInteger low;
    DotInteger high;
    
    double sma;
    double ema;
    
    Date date;
}
