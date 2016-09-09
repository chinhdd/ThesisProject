package com.chinhdd.thesis.predata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TAIEXprocess {
    
    public static final String FILE_NAME = "2004_taiex.txt";

    /**
     * @param args
     */
    public static void main(String[] args) {
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(FILE_NAME));
            do {
                line = br.readLine();
                if (line != null && line.isEmpty() == false) {
                    //System.out.println(line);
                    String month = line.substring(0, 3);
                    int day = Integer.parseInt(line.substring(4, 6));
                    int year = Integer.parseInt(line.substring(7, 11));
                    // open
                    TAIEX_Daily td = new TAIEX_Daily();
                    td.month = month;
                    td.day = day;
                    td.year = year;
                    td.open = getDotInteger(line.substring(13, 20));
                    td.high = getDotInteger(line.substring(22, 29));
                    td.low = getDotInteger(line.substring(31, 38));
                    td.close = getDotInteger(line.substring(40, 47));
                    System.out.println(month + " - " + day + " - " + year 
                            + " - " + td.open + " - " + td.high
                            + " - " + td.low + " - " + td.close);
                }
            } while (line != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static DotInteger getDotInteger(String str) {
        DotInteger di = new DotInteger();
        di.first = Integer.parseInt(str.substring(0, 4));
        di.second = Integer.parseInt(str.substring(5, 7));
        return di;
    }

    public static class TAIEX_Daily {
        public int year;
        public String month;
        public int day;
        public DotInteger open;
        public DotInteger high;
        public DotInteger low;
        public DotInteger close;
    }
    
    public static class DotInteger {
        public int first;
        public int second;
        @Override
        public String toString() {
            return first + "." + second;
        }
    }
}
