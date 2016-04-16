package com.chinhdd.thesis.datadefine;

import com.chinhdd.thesis.ForexException;

public class DotInteger {

    private int mValue;
    private int mAfterDot;

    private static final int[] TEN_POWER = { 1, 10, 100, 1000, 10000,
            100000, 1000000 };

    DotInteger(String sValue,int numberAfterDot) throws ForexException {
        try {
            mAfterDot = numberAfterDot;
            if (mAfterDot == 0) {
                mValue = Integer.parseInt(sValue);
            } else {
                int k = 0;
                int i = 0;
                int nRealAfterDot = 0;
                boolean afterDot = false;
                for (i = 0; i < sValue.length(); i++) {
                    if (sValue.charAt(i) == '.') {
                        afterDot = true;
                        continue;
                    }
                    if (afterDot) {
                        nRealAfterDot++;
                    }
                    k = k * 10 + sValue.charAt(i) - '0';
                }
                if (nRealAfterDot < mAfterDot) {
                    k = k * TEN_POWER[mAfterDot - nRealAfterDot];
                }
                mValue = k;
            }
        } catch (NumberFormatException e) {
            throw new ForexException(e, "Can not construct Dot Value");
        }
    }

    public int getIntValue() {
        return mValue;
    }

    public double getRealValue() {
        return mValue * 1.0 / TEN_POWER[mAfterDot];
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("DotInteger [").append(mValue).append(", ").append(mAfterDot).append("]");
        return str.toString();
    }
}
